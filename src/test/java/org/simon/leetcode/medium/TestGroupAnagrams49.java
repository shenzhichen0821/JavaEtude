package org.simon.leetcode.medium;

import org.testng.annotations.Test;

public class TestGroupAnagrams49 {

    @Test
    public void test() {
        String[] data = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
        GroupAnagrams49 ga = new GroupAnagrams49();
        System.out.println(ga.groupAnagrams(data));
    }
}
