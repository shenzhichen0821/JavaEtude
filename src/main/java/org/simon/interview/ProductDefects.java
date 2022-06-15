package org.simon.interview;

import java.util.List;

public class ProductDefects {

    /**
     * 矩阵由0和1组成，求由1组成的正方形的最大边长
     */
    public static int findLargestSquareSize(List<List<Integer>> samples) {
        int rowSize = samples.size();
        int colSize = samples.get(0).size();
        int max = 0;
        for (int row = 0; row < rowSize; row++) {
            if (max > (rowSize - row)) {
                break;
            }
            for (int col = 0; col < colSize; col++) {
                if (samples.get(row).get(col) == 0) {
                    continue;
                }
                if (max > (colSize - col)) {
                    break;
                }
                max = Math.max(max, maxSquare(rowSize, colSize, row, col, samples));
//                System.out.println(String.format("row %d, col %d, max %d", row, col, max));
            }
        }
        return max;
    }

    public static int maxSquare(int rowSize, int colSize, int row, int col, List<List<Integer>> samples) {
        int rowOffset = 0;
        int maxOnCol = 0;
        while (true) {
            if (samples.get(row + rowOffset).get(col) == 0) {
                return Math.min(rowOffset, maxOnCol);
            }

            int colOffset = 0;
            while (true) {
                if (col + colOffset + 1 < colSize && samples.get(row + rowOffset).get(col + colOffset + 1) == 1 ) {
                    colOffset += 1;
                } else {
                    maxOnCol = maxOnCol == 0 ? 1 + colOffset : Math.min(maxOnCol, 1 + colOffset);
                    break;
                }
            }
            if (maxOnCol > rowOffset + 1) {
                if (row + rowOffset + 1 >= rowSize) {
                    return Math.min(rowOffset, maxOnCol);
                }
                rowOffset += 1;
            } else {
                return maxOnCol;
            }
        }
    }
}
