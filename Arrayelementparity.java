In this Kata, you will be given an array of integers whose elements have both a negative and a positive value, except for one integer that is either only 
negative or only positive. Your task will be to find that integer.

Examples:

[1, -1, 2, -2, 3] => 3

3 has no matching negative appearance

[-3, 1, 2, 3, -1, -4, -2] => -4

-4 has no matching positive appearance

[1, -1, 2, -2, 3, 3] => 3

(the only-positive or only-negative integer may appear more than once)



package com.example;

import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Arrayelementparity {

    public static int solve(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> positives = list.stream().filter(val -> val > 0).sorted().collect(Collectors.toList());
        List<Integer> negatives = list.stream().filter(val -> val < 0).map(v -> v*-1).sorted().collect(Collectors.toList());

        int result = looper(positives, negatives);

        if (result == 0 ) {
            result = looper(negatives, positives)*-1;
        }
        return result;

    }

    public static int looper (List<Integer> pList, List<Integer> nList) {
        for (Integer integer : pList) {
            if (!nList.contains(integer)) {
                return integer;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {-110,110,-38,-38,-62,62,-38,-38,-38};
        System.out.println(solve(nums));
    }

}
