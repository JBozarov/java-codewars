In this Kata your task will be to return the count of pairs that have consecutive numbers as follows:

pairs([1,2,5,8,-4,-3,7,6,5]) = 3
The pairs are selected as follows [(1,2),(5,8),(-4,-3),(7,6),5]
--the first pair is (1,2) and the numbers in the pair are consecutive; Count = 1
--the second pair is (5,8) and are not consecutive
--the third pair is (-4,-3), consecutive. Count = 2
--the fourth pair is (7,6), also consecutive. Count = 3. 
--the last digit has no pair, so we ignore.




public class ConsecutivePairs {
    public static int solve(int [] arr){
        int count = 0;
        int length = arr.length%2 == 0 ? arr.length : arr.length - 1;
        for (int i = 0; i < length; i += 2 ) {
            if (arr[i]+1 == arr[i+1] || arr[i]-1 == arr[i+1]) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {21, 20, 22, 40, 39, -56, 30, -55, 95, 94};
        int[] arr2 = {1,2,5,8,-4,-3,7,6,5};
        System.out.println(solve(arr2)); //3
        System.out.println(solve(arr)); //2
    }
}
