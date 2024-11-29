package org.apache.maven.archetypes.sorting;

public class SumOddArray {
    public static void main(String[] args) {
        int[] number = {6,9,10,1,4,3};
        int result = 0;

        for(int i : number){
            if(i % 2 != 0){
                result += i;
            }
        }
        System.out.println("result " + result);
    }
}
