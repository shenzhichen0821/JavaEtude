package org.simon.leetcode.interview;

import org.simon.interview.FindMultiple;
import org.testng.annotations.Test;

import java.util.List;

public class TestFindMultiple {

    @Test
    public void test() {
        FindMultiple fm = new FindMultiple();
        List<Integer> result = fm.find(1,2,3, 1024);
        System.out.println(result.toString());
    }
}
