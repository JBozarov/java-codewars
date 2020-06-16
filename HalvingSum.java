Task
Given a positive integer n, calculate the following sum:

n + n/2 + n/4 + n/8 + ...
All elements of the sum are the results of integer division.

Example
25  =>  25 + 12 + 6 + 3 + 1 = 47




public class HalvingSum {
  public static int halvingSum(int n) {
		int result = 0; 
		
		int temp = 1; 
		while (n>=temp) {
			result = result + n/temp; 
			temp *= 2; 
		}
		return result; 
	}
}
