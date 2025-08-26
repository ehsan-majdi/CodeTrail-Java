package org.apache.maven.archetypes.sorting;

import java.util.Arrays;

public class FindMaxThird {



        public static void main(String[] args) {
            int[] number = {10, 5, 20, 8, 2};

            for (int i = 0; i < number.length; i++) {
                int minIndex = i;

                for (int j = i + 1; j < number.length; j++) {
                    if (number[j] < number[minIndex]) {
                        minIndex = j;
                    }
                }

                int temp = number[i];
                number[i] = number[minIndex];
                number[minIndex] = temp;
            }

            System.out.println("Sorted Array: " + Arrays.toString(number));
        }
}
