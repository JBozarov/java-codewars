public class Positive{

	public static int sum(int[] arr) {
	    int count = 0;
	    for (int i = 0; i < arr.length; i++) {
	      if (arr[i] > 0) {
	        count += arr[i];
	        System.out.println(arr[i]);
	      }
	    }
	    return count;
	  }
}
