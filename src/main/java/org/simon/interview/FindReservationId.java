package org.simon.interview;

import java.util.*;

public class FindReservationId {
    /**
     * 两个二维数组
     * 100 12345
     * 101 23456
     * 103 45678
     *
     * 100 12345
     * 100 13579
     * 101 23456
     * 102 34567
     * 103 45678
     *
     * 返回第二个数组在第一个数组中不存在的id
     * [100,102]
     */
    public List<Integer> findResId(List<List<Integer>> first, List<List<Integer>> second) {
        Map<Integer, Set<Integer>> buffer = new HashMap<>();
        first.forEach(item -> {
            if (!buffer.containsKey(item.get(0))) {
                Set<Integer> temp = new HashSet<>();
                temp.add(item.get(1));
                buffer.put(item.get(0), temp);
            } else {
                buffer.get(item.get(0)).add(item.get(1));
            }
        });

        Set<Integer> result = new HashSet<>();
        second.forEach(item -> {
            if (!buffer.containsKey(item.get(0)) ||
                    !buffer.get(item.get(0)).contains(item.get(1))) {
                result.add(item.get(0));
            }
        });
        return new ArrayList<>(result);
    }
}
