package org.simon.leetcode.medium;

public class ReverseInt7 {

    static int[] MAX = new int[] {2,1,4,7,4,8,3,6,4,8};

    /**
     * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
     *
     * 如果反转后整数超过 32 位的有符号整数的范围[−231, 231− 1] ，就返回 0。
     *
     * 假设环境不允许存储 64 位整数（有符号或无符号）。
     *
     * 示例 1：
     * 输入：x = 123
     * 输出：321
     * 
     * 示例 2：
     * 输入：x = -123
     * 输出：-321
     * 
     * 示例 3：
     * 输入：x = 120
     * 输出：21
     * 
     * 示例 4：
     * 输入：x = 0
     * 输出：0
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/reverse-integer
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public int reverse(int x) {
        if (x < 10 && x > -10) {
            return x;
        }
        if (x == Integer.MIN_VALUE) {
            return 0;
        }

        int temp = Math.abs(x);
        int[] buffer = new int[10];

        int index = 0;
        while (true) {
            buffer[index] = temp % 10;

            temp = temp / 10;
            if (temp == 0) {
                break;
            } else {
                index++;
            }
        }

        if (index == 9) {
            for (int i = 0; i <= 9; i++) {
                if (buffer[i] > MAX[i]) {
                    return 0;
                } else if (buffer[i] < MAX[i]) {
                    break;
                }
                if (i == 9) {
                    if ((buffer[9] > MAX[9] - 1 && x > 0) || (buffer[9] > MAX[9] && x < 0)) {
                        return 0;
                    }
                }
            }
        }
        int result = 0;
        for (int i = 0; i <= index; i++) {
            result += (buffer[i] * Math.pow(10, index - i));
        }
        return result * (x < 0 ? -1 : 1);
    }
}
