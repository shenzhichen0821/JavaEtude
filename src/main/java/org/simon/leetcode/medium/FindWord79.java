package org.simon.leetcode.medium;

import java.util.*;

public class FindWord79 {

    /**
     * 给定一个m * n 二维字符网格board 和一个字符串单词word 。如果word 存在于网格中，返回 true ；否则，返回 false 。
     * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
     *
     * 示例 1：
     * 输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
     * 输出：true
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/word-search
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    static int xm, ym;
    public boolean exist(char[][] board, String word) {
        xm = board.length - 1;
        ym = board[0].length - 1;
        Map<Integer, HashSet<Integer>> path = new HashMap<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                path.clear();
                boolean res = find(i, j, board, path, word, 0);
                if (res) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean find(int x, int y, char[][] board, Map<Integer, HashSet<Integer>> path, String word, int index) {
        if (board[x][y] != word.charAt(index)) {
            return false;
        }
        if (index == word.length() - 1) {
            return true;
        }

        path.putIfAbsent(x, new HashSet<>());
        path.get(x).add(y);
        if (valid(x - 1, y) && !visited(path, x - 1, y)) {
            boolean res = find(x - 1, y, board, path, word, index + 1);
            if (res) {
                return true;
            }
        }
        if (valid(x + 1, y) && !visited(path, x + 1, y)) {
            boolean res = find(x + 1, y, board, path, word, index + 1);
            if (res) {
                return true;
            }
        }
        if (valid(x, y - 1) && !visited(path, x, y - 1)) {
            boolean res = find(x, y - 1, board, path, word, index + 1);
            if (res) {
                return true;
            }
        }
        if (valid(x, y + 1) && !visited(path, x, y + 1)) {
            boolean res = find(x, y + 1, board, path, word, index + 1);
            if (res) {
                return true;
            }
        }
        path.get(x).remove(y);
        return false;
    }

    public boolean visited(Map<Integer, HashSet<Integer>> path, int x, int y) {
        if (!path.containsKey(x)) {
            return false;
        }
        HashSet<Integer> col = path.get(x);
        return col.contains(y);
    }

    public boolean valid(int x, int y) {
        return !(x < 0 || y < 0 || x > xm || y > ym);
    }
}
