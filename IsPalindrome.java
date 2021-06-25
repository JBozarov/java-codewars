/* Consider the string "adfa" and the following rules:

a) each character MUST be changed either to the one before or the one after in alphabet. 
b) "a" can only be changed to "b" and "z" to "y". 
From our string, we get:

"adfa" -> ["begb","beeb","bcgb","bceb"]

Here is another example: 
"bd" -> ["ae","ac","ce","cc"]

--We see that in each example, one of the outcomes is a palindrome. That is, "beeb" and "cc".
You will be given a lowercase string and your task is to return True if at least one of the outcomes is a palindrome or False otherwise.

More examples in test cases. Good luck!
*/ 



package com.company.katas;

import javax.xml.stream.StreamFilter;
import javax.xml.stream.events.Characters;
import java.util.*;
import java.util.stream.Collectors;

public class IsPalindrome {


    public static boolean solve(String st) {
        String tempString = st;
        String tempString2 = st;
        String[] arr = st.split("");
        List<Character> charList = new ArrayList<>();

        List<String> result = new ArrayList<>();

        for (String s : arr) {
            charList.add(st.charAt(st.indexOf(s)));
        }

        for (Character c : charList) {

            char temp = ' ';
            if (c.equals('a')) {
                temp = 'b';
            tempString = tempString.replace(st.charAt(st.indexOf(c)), temp);
            System.out.println("first " + tempString);
            }

            if (c.equals('z')) {
                temp = 'y';
                tempString = tempString.replace(st.charAt(st.indexOf(c)), temp);
                System.out.println("second " + tempString);
            }

            if (!c.equals('a') && !c.equals('z')) {
                int i = c;
                temp = (char) (i + 1);
                System.out.println("temp " + temp);
                tempString = tempString.replace(st.charAt(st.indexOf(c)), temp);
                System.out.println("third " + tempString);
            }

            result.add(tempString);
        }

        for (Character c : charList) {

            char temp = ' ';
            if (c.equals('a')) {
                temp = 'b';
                tempString2 = tempString2.replace(st.charAt(st.indexOf(c)), temp);
                System.out.println("first " + tempString2);
            }

            if (c.equals('z')) {
                temp = 'y';
                tempString2 = tempString2.replace(st.charAt(st.indexOf(c)), temp);
                System.out.println("second " + tempString2);
            }

            if (!c.equals('a') && !c.equals('z')) {
                int i = c;
                temp = (char) (i - 1);
                System.out.println("temp " + temp);
                tempString2 = tempString2.replace(st.charAt(st.indexOf(c)), temp);
                System.out.println("third " + tempString2);
            }
            result.add(tempString2);
        }

        System.out.println(Arrays.toString(result.toArray()));
        List<String> filtered = result.stream().distinct().collect(Collectors.toList());
        System.out.println(Arrays.toString(filtered.toArray()));
        return true;
    }



    public static void main(String[] args) {
        solve("adfa");
    }
}
