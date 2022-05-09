package org.simon.leetcode.hard;

import org.simon.leetcode.hard.Regular10;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class TestRegular10 {

    @Test
    public void test() {
        Map<String, Boolean> data = new HashMap<>();
        data.put("ccbbabbbabababa;.*.ba*c*c*aab.a*b*", false);
        data.put("fffffffffffffffdea;f*.de*.a", true);
        data.put("a;..*", true);
        data.put("abc;abc", true);
        data.put("ab;.*", true);
        data.put("aa;a*", true);
        data.put("aaa;a", false);
        data.put("aaaa;aa*a", true);
        data.put("bb;bb*b", true);
        data.put("cc;cc*cc", false);
        data.put("fg;.", false);
        data.put("abcd;s.*.*.", false);
        data.put("tttteee;tt*te*f*g*", true);
        data.put("fpwoquvnjpajsdf;fp.*sdf", true);
        data.put("fpwonjpajsdf;fp.*sd", false);

        Regular10 regular10 = new Regular10();
        for (Map.Entry<String, Boolean> entry : data.entrySet()) {
            String origin = entry.getKey().split(";")[0];
            String config = entry.getKey().split(";")[1];
            System.out.print(origin + ", " + config + ": ");

            boolean result = regular10.isMatch(origin, config);
            Assert.assertEquals(result, (boolean) entry.getValue());
            System.out.println(result);
        }

    }
}
