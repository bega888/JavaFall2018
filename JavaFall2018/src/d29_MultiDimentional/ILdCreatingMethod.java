package d29_MultiDimentional;

import java.util.Arrays;

public class ILdCreatingMethod {
	public static void main(String[] args) {
	
	int [][] myNumbers= {{23232, 3234, 54545}, {5656, 545566, 54544}, {7676, 434, 676}};	
	int[]nums= {3, 4, 5,4, 3, 23, 453, 3};	
	String[] hello= {"Hello World, welcome to Java"};
	printDoubleArray(myNumbers);
	printIntArray(nums);	
	printStringArray(hello);	
		
		
	}
	public static void printDoubleArray(int [][] numbers) {
		for(int i=0; i<numbers.length; i++) {
			System.out.println(Arrays.toString(numbers[i]));
		}
			
	}
	public static void printIntArray(int []a) {  // can include multiple variable data
		System.out.println(Arrays.toString(a));
	}
	public static void printStringArray(String[] a) {
		System.out.println(Arrays.toString(a));
	}
	
	
	
	
	
	
	
}
