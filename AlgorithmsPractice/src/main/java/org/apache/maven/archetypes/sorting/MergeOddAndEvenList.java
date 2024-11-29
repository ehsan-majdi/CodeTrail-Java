package org.apache.maven.archetypes.sorting;

import java.util.ArrayList;


public class MergeOddAndEvenList {
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

        System.out.println("odd numbers: " + oddList);
        System.out.println("even numbers: " + evenList);

        ArrayList<Integer> result = mergeList(oddList,evenList);

        System.out.println("mergList" + result);

        selectionSort(oddList);
        selectionSort(evenList);

        System.out.println("Sorted Array oddList: " + oddList);

        System.out.println("Sorted Array evenList: " + evenList);

    }

    public static ArrayList<Integer> mergeList(ArrayList<Integer> oddList , ArrayList<Integer> evenList) {
        ArrayList<Integer>  allnumber = new ArrayList<>();
        allnumber.addAll(oddList);
        allnumber.addAll(evenList);
        return allnumber;
    }

    public static void selectionSort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }
            int temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }
    }
}
