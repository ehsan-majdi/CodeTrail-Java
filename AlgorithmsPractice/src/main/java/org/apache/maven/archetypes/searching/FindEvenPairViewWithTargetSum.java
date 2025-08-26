package org.apache.maven.archetypes.searching;

import java.util.HashSet;
import java.util.Set;

public class FindEvenPairViewWithTargetSum {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 4, 4, 5, 3, 3, 1, 8};
        int target = 8;
        Set<Integer> seen = new HashSet<>();

        for (int number : numbers) {
            if ( number % 2 == 0) {
                int complement = target - number;
                if (seen.contains(number)) {
                    System.out.println("These two numbers add up to " + target + ": " + complement + " & " + number);
                }
            }
            seen.add(number);
        }
    }

}
