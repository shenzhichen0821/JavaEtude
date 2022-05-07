package org.simon.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class TestPalindromic564 {

    @Test
    public void test() {
        // 196(191, 202) 297(292, 303) 398(393, 404) 499(494, 505)
        // 903(898, 909) 802(797, 808) 701(696, 707) 600(595, 606)
        // 11-9, 100-99, 99-101, 10...00-9...99, 9...99-10...01
        // 1-0, 123-121
        String[] dataArray = new String[] {
                "1001",
                "123454321", "100099999999", "100100001001",
                "100000000", "99999999", "90004", "90009", "70001", "69996",
                "700002", "700007", "99999998", "99999999", "99999999", "100000001",
        };

        Palindromic564 palindromic = new Palindromic564();

        System.out.println("\nAuto test begin!!!!");
        for (int i = 1; i <= 10001; i++) {
            String data = String.valueOf(i);
            System.out.println("Start: " + data);
            String result = palindromic.nearestPalindromic(data);
            String expect = violent(data);
            System.out.println(data + "-" + expect);
            Assert.assertEquals(result, expect);
        }
        System.out.println("\nManual test begin!!!!");
        for (String data: dataArray) {
            System.out.println("Start: " + data);
            String result = palindromic.nearestPalindromic(data);
            String expect = violent(data);
            System.out.println(data + "-" + expect);
            Assert.assertEquals(result, expect);
        }
    }

    public String violent(String n) {
        long temp = Long.parseLong(n);
        long offset = 1;
        while (true) {
            if (isPalindromic(temp - offset)) {
                return String.valueOf(temp - offset);
            } else if (isPalindromic(temp + offset)) {
                return String.valueOf(temp + offset);
            }
            offset++;
        }
    }

    public boolean isPalindromic(long n) {
        Palindromic564 pal = new Palindromic564();
        return pal.isPalindromic(pal.str2IntArray(String.valueOf(n)));
    }
}
