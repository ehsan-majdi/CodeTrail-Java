package org.apache.maven.archetypes.sorting;

import java.util.ArrayList;

public class FindMaxSumItemArray {

    public static void main(String[] args) {
        int[] numbers = {6, 9, 10, 1, 4, 3};
        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int j : numbers) {
            if (j % 2 == 0) { // بررسی زوج بودن عدد
                evenList.add(j);
            }else {
                oddList.add(j);
            }
        }

        System.out.println("odd numbers: " + oddList);
        System.out.println("even numbers: " + evenList);

        int sumOddList=0;
        int maxOdd = oddList.get(0);
        for(int i : oddList){
            sumOddList += i;
            if(i > maxOdd){
                maxOdd = i;
                System.out.println("max odd list:" + maxOdd);
            }
        }
        System.out.println("sum odd :" + sumOddList);

        int sumEvenList=0;
        int maxEven = evenList.get(0);
        for(int j : evenList){
            sumEvenList += j;
            if(j > maxEven){
                maxEven = j;
                System.out.println("max even list:" + maxEven);
            }
        }
        System.out.println("sum even :" + sumEvenList);
    }
}
