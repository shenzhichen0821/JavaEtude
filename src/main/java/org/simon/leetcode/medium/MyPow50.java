package org.simon.leetcode.medium;

public class MyPow50 {

    /**
     * 实现pow(x, n)，即计算 x 的 n 次幂函数（即，xn ）。
     *
     * 示例 1：
     * 输入：x = 2.00000, n = 10
     * 输出：1024.00000
     *
     * 示例 2：
     * 输入：x = 2.10000, n = 3
     * 输出：9.26100
     *
     * 示例 3：
     * 输入：x = 2.00000, n = -2
     * 输出：0.25000
     * 解释：2-2 = 1/22 = 1/4 = 0.25
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/powx-n
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public double myPow(double x, int n) {
        return n > 0 ? pow(x, n) : (1.0 / pow(x, -(long) n));
    }

    public double pow(double x, long n) {
        if (n == 1) {
            return x;
        }
        if (n == 0) {
            return 1.0;
        }
        double res = pow(x, n / 2);
        if (n % 2 == 1) {
            return res * res * x;
        } else {
            return res * res;
        }
    }
}
