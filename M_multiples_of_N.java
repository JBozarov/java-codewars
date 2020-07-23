Implement a function, multiples(m, n), which returns an array of the first m multiples of the real number n. Assume that m is a positive integer.

public class Kata {
    public static int[] multiples(int m, int n) {
        int[] arr = new int[m];
        int num = 1;
        for (int i = 0; i < m; i++) {
            arr[i] = n * num;
            num++;
        }
        return arr;
    }
}
