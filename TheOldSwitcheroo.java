package com.company.katas;



public class TheOldSwitcheroo {

    public static void main(String[] args) {
        String  result = vowel2Index("this is my string");
        System.out.println(result);
    }



    public static String vowel2Index(String s) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        String lowerCased = s.toLowerCase(); 
        for (int i = 0; i<lowerCased.length(); i++ ) {

            for (int k = 0; k<vowels.length; k++ ) {
                if (vowels[k] == lowerCased.charAt(i)) {
                    System.out.println(i+1);
                    char ch = (char) (i + '1');
                    System.out.println(ch);
                    s = s.replace(s.charAt(i), ch);
                    System.out.println(s);
                }
            }
        }

        return s;
    }
}
