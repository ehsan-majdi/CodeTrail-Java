package org.apache.maven.archetypes.sorting;

import java.util.Arrays;

public class FindMaxThird {


//    public static void main(String[] args) {
//        int[] number = {10, 5, 20, 8, 2};
//        int num = number[0];
//        for (int i = 0; i < number.length; i++) {
//            if (number[i] < num) {
//                int temp = number[i];
//                number[i] = number[0];
//                number[0] = temp;
//                System.out.println("number temp:" + number[i]);
//
//            }
//        }
//        System.out.println("number:" + number);
//    }


        public static void main(String[] args) {
            int[] number = {10, 5, 20, 8, 2};

            for (int i = 0; i < number.length; i++) {
                // فرض کنید کوچک‌ترین عدد در اندیس i است
                int minIndex = i;

                // جستجوی کوچک‌ترین عدد از i به بعد
                for (int j = i + 1; j < number.length; j++) {
                    if (number[j] < number[minIndex]) {
                        minIndex = j; // اندیس کوچک‌ترین عدد به‌روز شود
                    }
                }

                // جابجا کردن کوچک‌ترین عدد با عدد در موقعیت i
                int temp = number[i];
                number[i] = number[minIndex];
                number[minIndex] = temp;
            }

            // چاپ آرایه مرتب‌شده
            System.out.println("Sorted Array: " + Arrays.toString(number));
        }
}
