package org.apache.maven.archetypes.searching;

import java.util.HashSet;
import java.util.Set;

public class FindTargerNumber {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 4, 4, 5, 3, 3, 1, 4};
        int target = 4;
        Set<Integer> seen = new HashSet<>();
       for(int number : numbers){
           int complement = target - number;
           if(seen.contains(complement)){
               int result = complement + number;
               if(result == target) {
                   System.out.println("This is two number:" + complement + " & " + number);
                   break;
               }
           }
           seen.add(number);
       }

    }
}
