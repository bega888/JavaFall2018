package d28_ArrayClass;

import java.util.Arrays;

public class VAiEquals {
	public static void main(String[] args) {
		
		int[] a= {1, 2, 3};
		int[] b= {1, 2, 3};
		int[] c= {1, 2, 3, 4};
		int[] d= {1, 2, 4, 3};
		System.out.println(Arrays.equals(a, b));  //use this 
		System.out.println(a==b);  //gives FALSE, doesn't check for values, 
		                           //checks for if they are pointing to the same value
		Arrays.sort(d);
		
	}
}
