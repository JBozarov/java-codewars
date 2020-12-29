In this Kata, you will be given an array of unique elements, and your task is to rearrange the values so that the first max value is followed by the first 
minimum, followed by second max value then second min value, etc.

For example:

solve([15,11,10,7,12]) = [15,7,12,10,11]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMinArrays {
    public static void main(String[] args) {
        int[] arr = { 15,11,10,7,12 };
        System.out.println(Arrays.toString(solve(arr)));

    }

    public static int[] solve (int[] arr){
        int[] result = new int[arr.length];
        List<Integer> myList = new ArrayList<Integer>(arr.length);
        for (int i : arr) {
            myList.add(i);
        }

        for (int k = 0; k < arr.length; k++ ) {
            if (k%2 == 0) {
                int max = Collections.max(myList);
                result[k] = max;
                for (int g = 0; g<myList.size(); g++ ) {
                    if (myList.get(g) == max) {
                        myList.remove(g);
                    }
                }
            } else {
                int min = Collections.min(myList);
                result[k] = min;
                for (int g = 0; g<myList.size(); g++ ) {
                    if (myList.get(g) == min) {
                        myList.remove(g);
                    }
                }
            }
        }

        return result;
    }

}

