package org.apache.maven.archetypes.sorting;

public class FindMaxAndMin {

    public static void main(String[] args) {
        int[] number = {10, 5, 20, 8, 2};
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        int min = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];

            }
            if(number[i] < min){
                min = number[i];
            }
        }
        for(int i = 0; i < number.length; i++){
            if (number[i] > secondmax && number[i] < max) {
                secondmax = number[i];
            }
        }
        System.out.println("max:" + max);
        System.out.println("maxes:" + secondmax);
        System.out.println("min:" + min);
    }

}
