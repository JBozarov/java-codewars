public class ShortestWord {

	public static void main(String[] args) {
		int a = findShort("bitcoin take over the world maybe who knows perhaps"); 
		System.out.println(a);
		

	}

	 public static int findShort(String s) {
	        String[] words = s.split(" "); 
	        String w = words[0];
	        for ( int i = 0; i<words.length-1; i++ ) {
	        	if (words[i].length()>words[i+1].length()){
	        		w = words[i+1];
	        	}
	        }
	        return w.length(); 
	 }
}
