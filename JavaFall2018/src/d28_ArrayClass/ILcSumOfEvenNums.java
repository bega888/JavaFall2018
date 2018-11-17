package d28_ArrayClass;

import java.util.Scanner;

public class ILcSumOfEvenNums {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int[] nums= {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()}; 
		
		int counter=0;
		for(int i:nums) {
			if(i%2==0) {
				counter++;
			}
			
		}System.out.println("Evens: "+counter);
		
		
		
		
		
		
		
		
		
		
		
	}

}
