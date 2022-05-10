package org.simon.leetcode.medium;

public class ZedConvert6 {

    int pageSize;
    int fullPageNum;
    int lastPageSize;
    int numRows;

    /**
     * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行Z 字形排列。
     *
     * 比如输入字符串为"PAYPALISHIRING"行数为 3 时，排列如下：
     *
     * P   A   H   N
     * A P L S I I G
     * Y   I   R
     * 
     * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
     * 请你实现这个将字符串进行指定行数变换的函数：
     * string convert(string s, int numRows);
     *
     * 示例 1：
     * 输入：s = "PAYPALISHIRING", numRows = 3
     * 输出："PAHNAPLSIIGYIR"
     *
     * 示例 2：
     * 输入：s = "PAYPALISHIRING", numRows = 4
     * 输出："PINALSIGYAHRPI"
     * 解释：
     * P     I    N
     * A   L S  I G
     * Y A   H R
     * P     I
     * 
     * 示例 3：
     * 输入：s = "A", numRows = 1
     * 输出："A"
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/zigzag-conversion
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        } else if (numRows == 2) {
            char[] result = new char[s.length()];
            int single = s.length() % 2;
            for (int i = 0; i < s.length() / 2; i++) {
                result[i] = s.charAt(i * 2);
                result[s.length() / 2 + single + i] =  s.charAt(i * 2 + 1);
            }
            if (single == 1) {
                result[s.length() / 2] = s.charAt(s.length() - 1);
            }
            return String.valueOf(result);
        }

        this.numRows = numRows;
        this.pageSize = numRows + (Math.max(numRows - 2, 0));
        this.fullPageNum = s.length() / pageSize;
        this.lastPageSize = s.length() % pageSize;

        char[] result = new char[s.length()];

        int[] lastPageElement = new int[numRows];
        for (int index = 0; index < lastPageSize; index++) {
            if (index < numRows) {
                lastPageElement[index] = 1;
            } else {
                lastPageElement[2 * numRows - index - 2] += 1;
            }
        }

        for (int page = 0; page < fullPageNum; page++) {
            for (int index = 0; index < pageSize; index++) {
                result[getResultIndex(page, index, lastPageElement)] = getOriginChar(s, page, index);
            }
        }
        for (int index = 0; index < lastPageSize; index++) {
            result[getResultIndex(fullPageNum, index, lastPageElement)] = getOriginChar(s, fullPageNum, index);
        }

        return String.valueOf(result);
    }

    public int getResultIndex(int page, int indexInPage, int[] lastPageElement) {
        if (indexInPage == 0) {
            return page;
        }

        int row;
        if (indexInPage < numRows) {
            row = indexInPage;
        } else {
            // rowIndx = (numRows - 1) - (indexInPage - (numRows - 1))
            row = 2 * numRows - indexInPage - 2;
        }

        int lastElements = 0;
        for (int i = 0; i < row; i++) {
            lastElements += lastPageElement[i];
        }

        if (row == numRows - 1) {
            return fullPageNum * (2 * row - 1) + page + lastElements;
        } else {
            return fullPageNum * (2 * row - 1) + page * 2 + lastElements + (indexInPage >= numRows ? 1 : 0);
        }
    }

    public char getOriginChar(String origin, int page, int indexInPage) {
        return origin.charAt(page * pageSize + indexInPage);
    }

}
