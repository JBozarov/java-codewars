package com.company.katas;

import java.util.Arrays;

public class MaxMinArrays {
    public static void main(String[] args) {
        int[] arr = { 15,11,10,7,12 };
        System.out.println(Arrays.toString(solve(arr)));
    }

    public static int[] solve (int[] arr){
        int[] result = new int[arr.length];
        int[] arrCopy = new int[arr.length];
        for (int i = 0; i < arr.length; i++ ) {
            arrCopy[i] = arr[i];
        }

        for (int k = 0; k < arr.length; k++ ) {
            int max = Arrays.stream(arrCopy).max().orElse(0);
            Arrays.stream(arrCopy).filter(val -> val != max);
            System.out.println(max);
        }
        System.out.println(Arrays.toString(arrCopy));

        return arrCopy;
    }

    public static int[] minMaxFinder(int[] arr) {
        int[] res = new int[2];
        int max = Arrays.stream(arr).max().orElse(0); 
        int min = Arrays.stream(arr).min().orElse(0); 
        res[0] = max; 
        res[1] = min; 
        return res; 
    }
}
