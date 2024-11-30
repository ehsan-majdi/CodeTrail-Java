package org.apache.maven.archetypes.basicOperations;

public class SumOfEvenNumbers {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5, 6}; // آرایه اعداد
            int result = 0; // متغیری برای نگهداری مجموع

            // پیمایش آرایه
            for (int j : numbers) {
                if (j % 2 == 0) { // بررسی زوج بودن عدد
                    result += j; // اضافه کردن عدد زوج به مجموع
                    System.out.println("Found even number: " + j);
                }
            }

            // چاپ نتیجه نهایی
            System.out.println("Sum of even numbers: " + result);
        }
}
