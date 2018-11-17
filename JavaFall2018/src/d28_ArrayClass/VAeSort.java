package d28_ArrayClass;

import java.util.Arrays;

public class VAeSort {
	public static void main(String[] args) {
		
		int[] nums= {9, 4, 3, 0, -4, 5, 3, 10};
		for(int n:nums) {
			System.out.print(n+" ");
		}
		System.out.println("-----sorting-----");
		
		
		Arrays.sort(nums);  //sorting changes the order permanently
		for(int n:nums) {
		System.out.print(n+" ");
		}
		
		
		System.out.println();
		
		
		String[] names= {"Begmyrat", "Asel", "Ajara", "Aysun", "", "Sardar"};
		Arrays.sort(names, 0, 3); //", 0, 3"->for partial sorting
		for(String a:names) {
			System.out.print(a+"  ");
		}//orders id: numbers < upper case < lower case   based on ASCII representation
	}

}
