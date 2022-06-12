package org.simon.leetcode.medium;

import sun.security.util.BitArray;

import java.util.BitSet;

public class IsValidSudoku36 {

    /**
     * 请你判断一个9 x 9 的数独是否有效。只需要 根据以下规则 ，验证已经填入的数字是否有效即可。
     *
     * 数字1-9在每一行只能出现一次。
     * 数字1-9在每一列只能出现一次。
     * 数字1-9在每一个以粗实线分隔的3x3宫内只能出现一次。（请参考示例图）
     * 
     *
     * 注意：
     *
     * 一个有效的数独（部分已被填充）不一定是可解的。
     * 只需要根据以上规则，验证已经填入的数字是否有效即可。
     * 空白格用'.'表示。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/valid-sudoku
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public boolean isValidSudoku(char[][] board) {
        short[][] row = new short[9][9];
        short[][] col = new short[9][9];
        short[][] block = new short[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                short val = (short) (board[i][j] - '0');
                // row
                if (row[i][val - 1] != 0) {
                    return false;
                }
                row[i][val - 1] = 1;
                // col
                if (col[j][val - 1] != 0) {
                    return false;
                }
                col[j][val - 1] = 1;
                // block
                int blockId = 3 * (i / 3) + (j / 3);
                if (block[blockId][val - 1] != 0) {
                    return false;
                }
                block[blockId][val - 1] = 1;
            }
        }
        return true;
    }

}
