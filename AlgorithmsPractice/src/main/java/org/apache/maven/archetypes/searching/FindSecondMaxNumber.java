package org.apache.maven.archetypes.searching;


public class FindSecondMaxNumber {
    public static void main(String[] args) {
        int[] number = {2, 7, 7, 3};
        if (number.length != 0) {
            int max = Integer.MIN_VALUE;
            int secondmax = Integer.MIN_VALUE;
            boolean foundSecond = false;
            for (int i = 0; i < number.length; i++) {
                if (number[i] > max) {
                    max = number[i];
                }
            }
            for (int i = 0; i < number.length; i++) {
                if (number[i] == max) {
                    continue;
                }
                if (number[i] > secondmax && number[i] < max) {
                    secondmax = number[i];
                    foundSecond = true;
                    continue;
                }

            }
            if(foundSecond){
                System.out.println("null");
            }
            System.out.println("second:" + secondmax);
        }

    }

}

