package org.apache.maven.archetypes.basicOperations;

import java.util.ArrayList;

public class PrintAndSumOdd {
    public static void main(String[] args) {
        int[] number = {6,9,10,1,4,3};

        int result = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i : number) {
            if (i % 2 != 0) {
                list.add(i);
                result += i;
            }

        }
        System.out.println("odd" + list);
        System.out.println("count = " + result);
    }
}
