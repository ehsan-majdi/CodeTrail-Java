package org.apache.maven.archetypes.searching;

import java.util.*;

public class FindAllRepeatedNumber {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 4, 4, 5, 3, 3, 1, 4};

        var duplicated = new HashMap<Integer, Integer>();

        for(int number:numbers){

            if (duplicated.containsKey(number)) {
                int count = duplicated.get(number);
                duplicated.put(number, count + 1);

            } else {
                duplicated.put(number, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : duplicated.entrySet()) {
            int value = entry.getValue();
            int key = entry.getKey();
            if(value > 1) {
                System.out.println("key: " + key + " value " + value);
            }
        }
    }
}
