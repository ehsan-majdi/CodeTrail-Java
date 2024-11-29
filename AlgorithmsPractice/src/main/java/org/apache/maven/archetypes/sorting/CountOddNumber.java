package org.apache.maven.archetypes.sorting;

import java.util.ArrayList;

public class CountOddNumber {

    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6};

        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i : number) {
            if (i % 2 != 0) {
                list.add(i);
                count = count + 1;
            }

        }
        System.out.println("even" + list);
        System.out.println("count = " +count);
    }
}
