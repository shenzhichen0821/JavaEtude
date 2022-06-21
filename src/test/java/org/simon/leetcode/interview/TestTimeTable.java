package org.simon.leetcode.interview;

import org.simon.interview.TimeTable;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestTimeTable {
    
    @Test
    public void test() {
        List<List<Integer>> data = new ArrayList<List<Integer>>() {{
            add(new ArrayList<Integer>() {{add(2); add(14579050); add(14579055);}});
            add(new ArrayList<Integer>() {{add(1); add(14579020); add(14579040);}});
            add(new ArrayList<Integer>() {{add(0); add(14579000); add(14579010);}});
            add(new ArrayList<Integer>() {{add(2); add(14579090); add(14579100);}});
            add(new ArrayList<Integer>() {{add(1); add(14579000); add(14579010);}});
            add(new ArrayList<Integer>() {{add(0); add(14579010); add(14579030);}});
            add(new ArrayList<Integer>() {{add(1); add(14579040); add(14579070);}});
            add(new ArrayList<Integer>() {{add(2); add(14579060); add(14579070);}});
            add(new ArrayList<Integer>() {{add(2); add(14579075); add(14579080);}});
        }};

        TimeTable tt = new TimeTable();
        System.out.println(tt.getBreakTime(data, 2));
    }
}
