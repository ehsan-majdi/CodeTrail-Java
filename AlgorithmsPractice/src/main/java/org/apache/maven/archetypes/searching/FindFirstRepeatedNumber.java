package org.apache.maven.archetypes.searching;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindFirstRepeatedNumber {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 2, 4, 5, 3, 3, 1, 4};
        Integer firstRepeated = null;

        Set<Integer> seen = new HashSet<>();

        for(int number:numbers){
            if(seen.contains(number)){
                firstRepeated = number;
                break;
            }
            seen.add(number);
        }
        if(firstRepeated != null){
            System.out.println("First repeated number: " + firstRepeated);
        }else {
            System.out.println("No repeated number found.");
        }
    }
}
