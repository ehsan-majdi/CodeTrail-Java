package org.apache.maven.archetypes.basicOperations;

import java.util.ArrayList;

public class ShowOddAndEven {

    public static void main(String[] args) {

        int[] numbers = {6, 9, 10, 1, 4, 3}; // آرایه اعداد
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
    }
}
