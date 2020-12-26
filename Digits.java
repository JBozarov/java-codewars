package com.katas;

public class DecTools {
    
    public static void main(String[] args) {
        Digits(63272637l);
    }


    public static int Digits(long n) {
        String str = Long.toString(n);
        String[] arr = str.split("");

        for (int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        return 0;
    }
}
