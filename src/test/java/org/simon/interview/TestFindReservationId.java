package org.simon.interview;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestFindReservationId {

    @Test
    public void test() {
        List<List<Integer>> first = new ArrayList<List<Integer>>() {{
            add(new ArrayList<Integer>() {{add(100); add(12345);}});
            add(new ArrayList<Integer>() {{add(101); add(23456);}});
            add(new ArrayList<Integer>() {{add(103); add(45678);}});
        }};
        List<List<Integer>> second = new ArrayList<List<Integer>>() {{
            add(new ArrayList<Integer>() {{add(100); add(12345);}});
            add(new ArrayList<Integer>() {{add(100); add(13579);}});
            add(new ArrayList<Integer>() {{add(101); add(23456);}});
            add(new ArrayList<Integer>() {{add(102); add(34567);}});
            add(new ArrayList<Integer>() {{add(103); add(45678);}});
        }};
        FindReservationId fr = new FindReservationId();
        System.out.println(fr.findResId(first, second));
    }
}
