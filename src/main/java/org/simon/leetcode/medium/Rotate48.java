package org.simon.leetcode.medium;

public class Rotate48 {

    /**
     * 给定一个 n×n 的二维矩阵matrix 表示一个图像。请你将图像顺时针旋转 90 度。
     * 你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。
     *
     * 示例 1：
     * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
     * 输出：[[7,4,1],[8,5,2],[9,6,3]]
     * 
     * 示例 2：
     * 输入：matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
     * 输出：[[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/rotate-image
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public void rotate(int[][] matrix) {
        int dim = matrix.length;
        int temp, buffer;
        for (int round = 0; round < dim / 2; round++) {
            for (int index = round; index < dim - 1 - round; index++) {
                // top -> right
                buffer = matrix[index][dim - 1 - round];
                matrix[index][dim - 1 - round] = matrix[round][index];
                // right -> bottom
                temp = matrix[dim - 1 - round][dim - 1 - index];
                matrix[dim - 1 - round][dim - 1 - index] = buffer;
                buffer = temp;
                // bottom -> left
                temp = matrix[dim - 1 - index][round];
                matrix[dim - 1 - index][round] = buffer;
                buffer = temp;
                // left -> top
                matrix[round][index] = buffer;
            }
        }
    }
}
