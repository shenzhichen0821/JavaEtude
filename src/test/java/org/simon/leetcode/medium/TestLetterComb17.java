package org.simon.leetcode.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TestLetterComb17 {

    @Test
    public void test001() {
        LetterComb17 lc = new LetterComb17();
        String data = "23";
        String[] expected = new String[] {"ad","ae","af","bd","be","bf","cd","ce","cf"};
        List<String> actual = lc.letterCombinations(data);

        System.out.println("Data: " + data);
        System.out.println("Expected: " + Arrays.toString(expected));
        System.out.println("Actual: " + Arrays.toString(actual.toArray()));

        Assert.assertEquals(actual.size(), expected.length);
        for (int i = 0; i < actual.size(); i++) {
            Assert.assertTrue(actual.contains(expected[i]));
        }
    }

    @Test
    public void test002() {
        LetterComb17 lc = new LetterComb17();
        String data = "";
        List<String> actual = lc.letterCombinations(data);

        System.out.println("Data: " + data);
        System.out.println("Expected: " + "[]");
        System.out.println("Actual: " + Arrays.toString(actual.toArray()));

        Assert.assertEquals(actual.size(), 0);
    }

    @Test
    public void test003() {
        LetterComb17 lc = new LetterComb17();
        String data = "2";
        String[] expected = new String[] {"a","b","c"};
        List<String> actual = lc.letterCombinations(data);

        System.out.println("Data: " + data);
        System.out.println("Expected: " + Arrays.toString(expected));
        System.out.println("Actual: " + Arrays.toString(actual.toArray()));

        Assert.assertEquals(actual.size(), expected.length);
        for (int i = 0; i < actual.size(); i++) {
            Assert.assertTrue(actual.contains(expected[i]));
        }
    }

    @Test
    public void test004() {
        LetterComb17 lc = new LetterComb17();
        String data = "4957";
//        String[] expected = new String[] {"ad","ae","af","bd","be","bf","cd","ce","cf"};
        List<String> actual = lc.letterCombinations(data);

        System.out.println("Data: " + data);
//        System.out.println("Expected: " + Arrays.toString(expected));
        System.out.println("Actual: " + Arrays.toString(actual.toArray()));

//        Assert.assertEquals(actual.size(), expected.length);
//        for (int i = 0; i < actual.size(); i++) {
//            Assert.assertTrue(actual.contains(expected[i]));
//        }
    }
}
