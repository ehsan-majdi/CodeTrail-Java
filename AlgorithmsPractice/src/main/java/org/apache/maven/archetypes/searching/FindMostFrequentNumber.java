package org.apache.maven.archetypes.searching;

import java.util.*;

public class FindMostFrequentNumber {
    public static void main(String[] args) {
        int[] number = {3, 1, 4, 4, 5, 3, 3, 1, 4};
        int maxCount = 0;
        int maxNumber = 0;

        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < number.length; i++) {
            int currentNumber = number[i];

            if (map.containsKey(currentNumber)) {
                int count = map.get(currentNumber);
                map.put(currentNumber, count + 1);
            } else {
                map.put(currentNumber, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            int key = entry.getKey();
            if (value > maxCount) {
                maxCount = value;
                maxNumber = key;

            }
        }

        System.out.println("number with highest: " + maxNumber + " (Count: " + maxCount + ")");
    }
}
