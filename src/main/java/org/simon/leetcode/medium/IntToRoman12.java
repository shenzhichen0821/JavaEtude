package org.simon.leetcode.medium;

public class IntToRoman12 {

    /**
     * 罗马数字包含以下七种字符：I，V，X，L，C，D和M。
     *
     * 字符          数值
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     *
     * 例如， 罗马数字 2 写做II，即为两个并列的 1。12 写做XII，即为X+II。 27 写做XXVII, 即为XX+V+II。
     *
     * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做IIII，而是IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为IX。这个特殊的规则只适用于以下六种情况：
     *
     * I可以放在V(5) 和X(10) 的左边，来表示 4 和 9。
     * X可以放在L(50) 和C(100) 的左边，来表示 40 和90。
     * C可以放在D(500) 和M(1000) 的左边，来表示400 和900。
     * 给你一个整数，将其转为罗马数字。
     *
     *
     * 示例1:
     * 输入:num = 3
     * 输出: "III"
     *
     * 示例2:
     * 输入:num = 4
     * 输出: "IV"
     *
     * 示例3:
     * 输入:num = 9
     * 输出: "IX"
     *
     * 示例4:
     * 输入:num = 58
     * 输出: "LVIII"
     * 解释: L = 50, V = 5, III = 3.
     *
     * 示例5:
     * 输入:num = 1994
     * 输出: "MCMXCIV"
     * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/integer-to-roman
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public String intToRoman(int num) {
        StringBuilder res = new StringBuilder();
        if (num >= 1000) {
            for (int i = 0; i < num / 1000; i++) {
                res.append("M");
            }
            num = num % 1000;
        }
        if (num >= 100) {
            res.append(subRoman(num / 100, 'M', 'C', 'D'));
            num = num % 100;
        }
        if (num >= 10) {
            res.append(subRoman(num / 10, 'C', 'X', 'L'));
            num = num % 10;
        }
        if (num > 0) {
            res.append(subRoman(num, 'X', 'I', 'V'));
        }
        return res.toString();
    }

    public String subRoman(int digit, char high, char low, char mid) {
        StringBuilder res = new StringBuilder();
        if (digit == 9) {
            res.append(low);
            res.append(high);
        } else if (digit >= 5) {
            res.append(mid);
            for (int i = 0; i < digit - 5; i++) {
                res.append(low);
            }
        } else if (digit == 4) {
            res.append(low);
            res.append(mid);
        } else {
            for (int i = 0; i < digit; i++) {
                res.append(low);
            }
        }
        return res.toString();
    }
}
