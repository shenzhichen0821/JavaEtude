package org.simon.interview;

import java.util.*;

public class TimeTable {

    /**
     * 二维数组，数据一定会有三列，0列为id，1列为开始时间戳，2列为结束时间戳
     * 时间戳不连贯算作一次休息
     * 超过次数n就不作数
     * 返回所有休息次数符合条件id及休息次数
     *
     * 0 14579000 14579010
     * 1 14579000 14579010
     * 0 14579010 14579030
     * 2 14579050 14579055
     * 1 14579020 14579040
     * 1 14579040 14579070
     * 2 14579060 14579070
     * 2 14579075 14579080
     * 2 14579090 14579100
     * n = 2
     *
     * 返回
     * 0,0
     * 1,1
     */
    public List<List<Integer>> getBreakTime(List<List<Integer>> origin, int n) {
        origin.sort(Comparator.comparing(item -> item.get(1)));
        Map<Integer, List<Integer>> buffer = new HashMap<>();

        for (List<Integer> item : origin) {
            if (!buffer.containsKey(item.get(0))) {
                List<Integer> temp = new ArrayList<>();
                temp.add(0);
                temp.add(item.get(2));
                buffer.put(item.get(0), temp);
            } else {
                List<Integer> temp = buffer.get(item.get(0));
                if (item.get(1) > temp.get(1)) {
                    temp.set(0, temp.get(0) + 1);
                    temp.set(1, item.get(2));
                }
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        buffer.forEach((key, val) -> {
            if (val.get(0) < n) {
                List<Integer> sub = new ArrayList<>();
                sub.add(key);
                sub.add(val.get(0));
                result.add(sub);
            }
        });
        return result;
    }
}
