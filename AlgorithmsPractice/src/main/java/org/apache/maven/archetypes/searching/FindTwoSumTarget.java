package org.apache.maven.archetypes.searching;

import java.util.HashMap;
import java.util.Map;

public class FindTwoSumTarget {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            seen.put(x, i);
            int need = target - x;
            if (seen.containsKey(need)) {
                System.out.println("indices: [" + seen.get(need) + ", " + i + "]");
                System.out.println("values : [" + need + ", " + x + "]");
                return;
            }
            seen.put(x, i);
        }
        System.out.println("no answer");
    }
}
