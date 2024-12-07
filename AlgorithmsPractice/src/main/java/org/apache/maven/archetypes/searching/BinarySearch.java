package org.apache.maven.archetypes.searching;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] number = {1, 3, 4, 5, 9, 11, 7};
        number = Arrays.stream(number).sorted().toArray();
        System.out.println("sort: " + Arrays.toString(number));
        int target = 4;
        int start = 0;
        int end = number.length - 1;

        boolean found = false;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (number[mid] == target) {
                System.out.println("Number found at index: " + mid);
                found = true;
                break;
            } else if (number[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (!found) {
            System.out.println("Number not found in the array.");
        }
    }
}
