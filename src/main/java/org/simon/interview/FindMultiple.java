package org.simon.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindMultiple {

    /**
     * x,y not z, less than n
     * 返回所有x,y的倍数，但不是z但倍数，且小于n的整数
     */
    public List<Integer> find(int x, int y, int z, int n) {
        if (x > y) {
            int temp = y;
            y = x;
            x = temp;
        }

        Set<Integer> res = new HashSet<>();
        long cur = 0;
        if (x != 0) {
            while (true) {
                cur += x;
                if (cur > n) {
                    break;
                }
                if (z != 0 && cur % z != 0) {
                    res.add((int) cur);
                }
            }
        }

        if (y != 0 && y % x != 0) {
            cur = 0;
            while (true) {
                cur += y;
                if (cur > n) {
                    break;
                }
                if (z != 0 && cur % z != 0) {
                    res.add((int) cur);
                }
            }
        }
        return new ArrayList<>(res);
    }
}
