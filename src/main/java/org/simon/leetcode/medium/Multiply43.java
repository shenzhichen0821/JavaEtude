package org.simon.leetcode.medium;

public class Multiply43 {
    /**
     * 给定两个以字符串形式表示的非负整数num1和num2，返回num1和num2的乘积，它们的乘积也表示为字符串形式。
     *
     * 注意：不能使用任何内置的 BigInteger 库或直接将输入转换为整数。
     *
     * 示例1:
     * 输入: num1 = "2", num2 = "3"
     * 输出: "6"
     *
     * 示例2:
     * 输入: num1 = "123", num2 = "456"
     * 输出: "56088"
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/multiply-strings
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int[] numArray1 = (num1.length() >= num2.length() ? num1 : num2).chars().map(item -> item - '0').toArray();
        int[] numArray2 = (num1.length() < num2.length() ? num1 : num2).chars().map(item -> item - '0').toArray();

        int[][] resArray = new int[numArray2.length][numArray1.length + 1];
        int[] result = new int[numArray1.length + numArray2.length];
        for (int i = numArray2.length - 1; i >= 0; i--) {
            int upgrade = 0;
            for (int j = numArray1.length - 1; j >= 0; j--) {
                int cur = numArray1[j] * numArray2[i] + upgrade;
                resArray[numArray2.length - 1 - i][j + 1] = cur % 10;
                upgrade = cur / 10;
            }
            resArray[numArray2.length - 1 - i][0] = upgrade;
        }
        int upgrade = 0;
        for (int i = 0; i < result.length; i++) {
            int single = 0;
            for (int j = 0; j < numArray2.length; j++) {
                int index = numArray1.length - i + j;
                if (index >= 0 && index < numArray1.length + 1) {
                    single += resArray[j][index];
                }
            }
            int temp = single + upgrade;
            result[result.length - 1 - i] = temp % 10;
            upgrade = temp / 10;
        }
        StringBuilder sb = new StringBuilder();
        if (result[0] != 0) {
            sb.append(result[0]);
        }
        for (int i = 1; i < result.length; i++) {
            sb.append(result[i]);
        }
        return sb.toString();
    }
}
