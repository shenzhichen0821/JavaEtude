package org.simon.leetcode.medium;

import java.util.Arrays;
import java.util.List;

public class SpiralOrder54 {

    /**
     * 给你一个 m 行 n 列的矩阵matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
     *
     * 示例 1：
     * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
     * 输出：[1,2,3,6,9,8,7,4,5]
     *
     * 示例 2：
     * 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
     * 输出：[1,2,3,4,8,12,11,10,9,5,6,7]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/spiral-matrix
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        Integer[] result = new Integer[row * col];
        int index = 0;
        for (int round = 0; round < Math.min(row, col); round++) {
            // right
            for (int colNum = round; colNum < col - round; colNum++) {
                result[index] = matrix[round][colNum];
                index++;
                if (index == result.length) {
                    return Arrays.asList(result);
                }
            }
            // down
            for (int rowNum = round + 1; rowNum < row - round; rowNum++) {
                result[index] = matrix[rowNum][col - round - 1];
                index++;
                if (index == result.length) {
                    return Arrays.asList(result);
                }
            }
            // left
            for (int colNum = col - round - 2; colNum >= round; colNum--) {
                result[index] = matrix[row - round - 1][colNum];
                index++;
                if (index == result.length) {
                    return Arrays.asList(result);
                }
            }
            // up
            for (int rowNum = row - round - 2; rowNum >= round + 1; rowNum--) {
                result[index] = matrix[rowNum][round];
                index++;
                if (index == result.length) {
                    return Arrays.asList(result);
                }
            }
        }
        return Arrays.asList(result);
    }
}
