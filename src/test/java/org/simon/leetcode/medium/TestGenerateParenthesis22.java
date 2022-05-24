package org.simon.leetcode.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestGenerateParenthesis22 {

    @Test
    public void test000() {
        GenerateParenthesis22 gp = new GenerateParenthesis22();
        List<String> actual = gp.generateParenthesis(3);
        String[] expected = new String[] {"((()))","(()())","(())()","()(())","()()()"};
        System.out.println("Actual: " + Arrays.toString(actual.toArray()));
        System.out.println("Expect: " + Arrays.toString(expected));
        assertEqualArrayAndList(expected, actual);
    }

    @Test
    public void test001() {
        GenerateParenthesis22 gp = new GenerateParenthesis22();
        List<String> actual = gp.generateParenthesis(4);
//        String[] expected = new String[] {"((()))","(()())","(())()","()(())","()()()"};
        System.out.println("Actual: " + Arrays.toString(actual.toArray()));
//        System.out.println("Expect: " + Arrays.toString(expected));
//        assertEqualArrayAndList(expected, actual);
    }

    public <T> void assertEqualArrayAndList(T[] left, List<T> right) {
        Assert.assertEquals(left.length, right.size());
        List<T> copyRight = new ArrayList<>(right);
        for (int i = 0; i < left.length; i++) {
            Assert.assertTrue(copyRight.contains(left[i]));
            copyRight.remove(left[i]);
        }
    }
}
