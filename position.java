   When provided with a letter, return its position in the alphabet.

           Input :: "a"

    Ouput :: "Position of alphabet: 1"

    This kata is meant for beginners. Rank and upvote to bring it out of beta


package com.katas;

public class Position {


    public static String position(char alphabet){
        String letters = "abcdefghijklmnopqrstuvwxyz";
        int temp = letters.indexOf(alphabet);
        System.out.println(temp);
        String result = String.valueOf(temp);
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        position('z'); // 25
    }
}
