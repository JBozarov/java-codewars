public class Kata
 {
  public static int squareSum(int[] n){ 
     int count = 0; 
     for ( int i = 0; i<n.length; i++ ) {
     count += n[i]*n[i]; 
  }
  return count; 
 }
 
 }
