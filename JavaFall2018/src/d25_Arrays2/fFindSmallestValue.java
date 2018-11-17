package d25_Arrays2;

public class fFindSmallestValue {
	public static void main(String[] args) {
		/*
		 * create array nums and assign several values
		 * print the smallest value in array
		 */
		int[] nums= {13, 6, 5, 12, 8, 76, 45, 5};
		int smallest=nums[0];
		for(int i : nums) {
			if(i<smallest) {
				smallest=i;
			}
		}System.out.println(smallest+" is the smallest number");
		
		
		
		
		
		
	}

}
