package org.apache.maven.archetypes.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class MaxAndMinMergeOddAndEvenList {
    public static void main(String[] args) {

        int[] numbers = {6, 9, 10, 1, 4, 3};
        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int j : numbers) {
            if (j % 2 == 0) {
                evenList.add(j);
            } else {
                oddList.add(j);
            }
        }

        System.out.println("Odd Numbers (Unsorted): " + oddList);
        System.out.println("Even Numbers (Unsorted): " + evenList);

        ArrayList<Integer> result = mergeList(oddList,evenList);

        System.out.println("mergList" + result);

        oddList.sort(Comparator.naturalOrder());
        evenList.sort(Comparator.naturalOrder());
        System.out.println("Sorted Odd Numbers: " + oddList);
        System.out.println("Sorted Even Numbers: " + evenList);

        minAndMax(result);

    }

    public static ArrayList<Integer> mergeList(ArrayList<Integer> oddList , ArrayList<Integer> evenList) {
        ArrayList<Integer>  allnumber = new ArrayList<>();
        allnumber.addAll(oddList);
        allnumber.addAll(evenList);
        return allnumber;
    }

    private static void minAndMax(ArrayList<Integer> list){
        int min = Collections.min(list);
        int max = Collections.max(list);
        for (Integer i : list) {
            if (i > max) {
                max = i;

            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Minimum Value in Combined List: " + min);
        System.out.println("Maximum Value in Combined List: " + max);
    }
}
