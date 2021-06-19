package practice;

public class StringPermutation {
    static int count =0;
	public static void main(String[] args) {
		String str = "1234";
		permutation(str);
		

	}
	public static void permutation(String str) { 
		count = 0;
	    permutation("", str); 
	    System.out.println(count);
	}

	private static void permutation(String prefix, String str) {
		System.out.println("prefix: "+prefix+ " str: "+str);
	    int n = str.length();
	    if (n == 0) {
	    	System.out.println(prefix);
	    	System.out.println();
	    	count++;
	    }
	    else {
	        for (int i = 0; i < n; i++)
	        	//
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}

}
