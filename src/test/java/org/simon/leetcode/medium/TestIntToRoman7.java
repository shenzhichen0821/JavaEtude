package org.simon.leetcode.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIntToRoman7 {

    @Test
    public void test000() {
        IntToRoman12 ir = new IntToRoman12();

        Assert.assertEquals(ir.intToRoman(3), "III");
        Assert.assertEquals(ir.intToRoman(4), "IV");
        Assert.assertEquals(ir.intToRoman(9), "IX");
        Assert.assertEquals(ir.intToRoman(58), "LVIII");
        Assert.assertEquals(ir.intToRoman(1994), "MCMXCIV");
    }
}
