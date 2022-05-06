package org.simon.sorting;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Random;

public class TestSorting {
    private static final int TEST_DATA_LENGTH = 10000;
    private static final int TEST_DATA_MAX = 10000;
    private static final int TEST_DATA_MIN = 0;
    private static final int TEST_RETRY_TIME = 10;


    @Test
    public void testSelectSorting() {
        test(new SelectSorting(), TEST_RETRY_TIME);
    }

    @Test
    public void testInsertionSorting() {
        test(new InsertionSorting(), TEST_RETRY_TIME);
    }

    @Test
    public void testMergeSorting() {
        test(new MergeSorting(), TEST_RETRY_TIME);
    }

    @Test
    public void testQuickSorting() {
        test(new QuickSorting(), TEST_RETRY_TIME);
    }

    private void test(AbstractSorting sorting, int retry) {
        for (int i = 0; i < retry; i++) {
            int[] data = genRandomData();
            sorting.sort(data);
            System.out.println(Arrays.toString(data));
            Assert.assertTrue(verify(data));
        }
    }

    private int[] genRandomData() {
        return new Random().ints(TEST_DATA_LENGTH, TEST_DATA_MIN, TEST_DATA_MAX).toArray();
    }
    private boolean verify(int[] dut) {
        for (int i = 0; i < dut.length - 1; i++) {
            if (dut[i] > dut[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
