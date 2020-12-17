Number is a palindrome if it is equal to the number with digits in reversed order. For example, 5, 44, 171, 4884 are palindromes, and 43, 194, 4773 are not.

Write a function which takes a positive integer and returns the number of special steps needed to obtain a palindrome. The special step is: "reverse the 
digits, and add to the original number". If the resulting number is not a palindrome, repeat the procedure with the sum until the resulting number is a palindrome.

If the input number is already a palindrome, the number of steps is 0.

All inputs are guaranteed to have a final palindrome which does not overflow long.

Example
For example, start with 87:

  87 +   78 =  165     - step 1, not a palindrome
 165 +  561 =  726     - step 2, not a palindrome
 726 +  627 = 1353     - step 3, not a palindrome
1353 + 3531 = 4884     - step 4, palindrome!


public static int palindromeChainLength (long n) {
        int result = 0;
        return doRecursive(n, result);
    }

    public static long reverseNumber(long n) {
        String str1 = String.valueOf(n);
        StringBuilder builder = new StringBuilder();
        builder.append(str1);
        builder = builder.reverse();
        String str2 = builder.toString();
        long n2 = Long.parseLong(str2);
        return n2;
    }

    public static int doRecursive(long n, int result) {
        if (n == reverseNumber(n)) {
            System.out.println(n == reverseNumber(n));
            return result;
        } else {
            result += 1;
            long n3 = reverseNumber(n) + n;
            return doRecursive(n3, result);
        }
    }
