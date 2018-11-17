package d28_ArrayClass;

import java.util.Scanner;

public class ILbHas55 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] nums= {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()}; 
		
		//check if the two 5's numbers next to each other
		
		boolean check=false;
		for(int i=0; i<nums.length-1; i++) {
			int first=nums[i];
			int second=nums[i+1];
			if(first==5 && second==5) {
				check=true;
				break;
			}
		}System.out.println(check);
		
		
		
		
		
		
	}

}
