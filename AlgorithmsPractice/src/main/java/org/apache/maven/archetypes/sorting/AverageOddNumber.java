package org.apache.maven.archetypes.sorting;

import java.util.ArrayList;

public class AverageOddNumber {

    public static void main(String[] args) {
        int[] number = {6,9,10,1,4,3};

        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        double average = 0;

        for(int i : number) {
            if (i % 2 != 0) {
                list.add(i);
                sum += i;
            }
        }
        average = (double) sum / list.size() ;

        System.out.println("list number of odd" + list);
        System.out.println("average odd number = " + average);
    }
}
