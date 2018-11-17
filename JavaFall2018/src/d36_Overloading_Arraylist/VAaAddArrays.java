package d36_Overloading_Arraylist;

import java.util.Arrays;

public class VAaAddArrays {
	public static void main(String[] args) {
		
	int[] x= {3, 4, 2, 6, 7};
	int[] y= {6, 7, 3, 9, 1};
	int[] z= addElements(x, y);
	System.out.println(Arrays.toString(z));
		
		
	}

	
	public static int[] addElements(int[] a, int [] b) {
		int[] c=new int[a.length];
		for(int i=0; i<a.length; i++) {
			c[i]=a[i]+b[i];
		}
		return c;
	}
	
	
	
}
