In this Kata, you will be given two strings a and b and your task will be to return the characters that are not common in the two strings.

For example:

solve("xyab","xzca") = "ybzc" 
--The first string has 'yb' which is not in the second string. 
--The second string has 'zc' which is not in the first string. 
Notice also that you return the characters from the first string concatenated with those from the second string.

More examples in the tests cases.

Good luck!


class Solution{
    public static String solve(String a, String b){
        String result = "";
        for (int i = 0; i<a.length(); i++ ) {
            if (b.indexOf(a.charAt(i)) == -1) {
                result += a.charAt(i);
            }
        }

        for (int k = 0; k<b.length(); k++ ) {
            if (a.indexOf(b.charAt(k)) == -1 ) {
                result += b.charAt(k);
            }
        }
        return result;
    }
}
