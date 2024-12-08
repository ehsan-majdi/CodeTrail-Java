package org.apache.maven.archetypes.searching;

import java.util.ArrayList;

public class FindClosestNumber {
    public static void main(String[] args) {
        int[] number = {5, 3, 8, 3, 7, 3, 10};
        int target = 4;
        int difference = 0;
        int minDifference = Integer.MAX_VALUE;
        int closest = 0;
        int closestIndex = 0;
        ArrayList<Integer> targetFound = new ArrayList<>();
        boolean found = false;
        for (int i = 0; i < number.length; i++) {
            if (number[i] == target) {
                targetFound.add(i);
                found = true;
            }
            if (number[i] != target) {
                difference = Math.abs(number[i] - target);
                if (difference <= minDifference) {
                    closest = number[i];
                    closestIndex = i;
                    minDifference = difference;
                }
            }
        }

        if (found) {
            System.out.println("Target found at indices " + targetFound);
        }

        if (!found) {
            System.out.println("closest " + closest);
            System.out.println("closestIndex " + closestIndex);
        }
    }
}
