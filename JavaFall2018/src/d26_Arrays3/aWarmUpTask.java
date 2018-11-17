package d26_Arrays3;

public class aWarmUpTask {
	public static void main(String[] args) {
		/*declare array nums and assign 1-9
		 * print all values in a single line separated by space
		 * using loop do the following:
		 * 	-if the value is even - double it and assign back
		 * 	-if the value is odd - triple it and assign back
		 * print out all values in single line separated by space
		 * result should be"3 4 9 8 15 12 21 16 27"
		 */
		
		int[] nums= {1, 2, 3, 4, 5, 6, 7, 8, 9};
		for(int n:nums) {
			if(n%2==0) {
				n=n*2;
			}else {
				n=n*3;
			}
			System.out.print(n+" ");
		}
		
		
			
			
		
		
	}

}
