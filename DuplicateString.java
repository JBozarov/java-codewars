


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Solution{    
    
      public static String[] dup(String[] arr) {
        String[] result = new String[arr.length];
        for ( int k = 0; k < arr.length; k++ ) {
            List<String> stringList = Arrays.asList(arr[k].split("").clone());
            List<String> newWord = new ArrayList<>();

            for ( int i = 0; i < stringList.size() - 1; i++ ) {
                if ( !stringList.get(i).equals(stringList.get(i+1)) && i != stringList.size() -1) {
                    newWord.add(stringList.get(i));
                }
                if ( i == stringList.size() - 2 && stringList.get(i).equals(stringList.get(i+1)) ) {
                    newWord.add(stringList.get(i+1));
                }

            }
            String temp = String.join("", newWord);
            result[k] = temp;

        }
        return result;
    }
  
}
