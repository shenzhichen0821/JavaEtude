package org.simon.interview;

import java.util.ArrayList;
import java.util.List;

public class RollingMan {

    /**
     * 标题
     * 代码实现E：圈内剩下的数字(数字)
     *
     * 题目描述
     * 现有m=100个人围成一个圈，顺序编号。从第1个人开始依次1，2，3报数。数到n=3的时候下去一个，然后下一个人接着从1开始报数，直到最后剩余1人。
     * 问：最后留下的是原来第几号（变量k）?
     *
     * 举例1：m = 100，n = 3，k = 91
     *
     * 举例2：m = 5，n = 3，k = 4
     * 1 2 3 4 5 
     * 1 2 4 5 
     * 2 4 5 
     * 2 4
     * 4
     */
    public static void main(String[] args) {
        int n = 3;
        List<Integer> temp = new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
        }};

        int cursor = 0;
        int count = 0;
        while (true) {
            if (temp.size() == 1) {
                System.out.println(temp.get(0));
                break;
            }

            count++;
            System.out.println(cursor);
            System.out.println(temp);
            if (count % n == 0) {
                System.out.println("Delete: " + temp.get(cursor));
                temp.remove(cursor);
                if (cursor > temp.size() - 1) {
                    cursor = 0;
                }
                count = 0;
            } else {
                cursor++;
                if (cursor > temp.size() - 1) {
                    cursor = 0;
                }
            }
        }

    }
}
