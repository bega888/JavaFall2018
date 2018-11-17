package d28_ArrayClass;

import java.util.Arrays;

public class VAhCopyOf {
	public static void main(String[] args) {
		
		int[] a= {10, 20, 30};
		int[] b=Arrays.copyOf(a, 2);
		int[] c=Arrays.copyOf(a, 5);  // in a we have only 3, so we will get 0, 0 
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		
		a=Arrays.copyOf(a, 4);
		System.out.println(Arrays.toString(a)); //workaround to change the array size
		
		
		
		
		
		
		
	}

}
