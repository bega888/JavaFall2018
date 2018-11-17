package d25_Arrays2;

public class gSumOfArray {
	public static void main(String[] args) {
		/*
		 * create variable nums, assign several values
		 * using loop calculate the sum and print it
		 * Additional steps:
		 * -calculate sum of even numbers
		 * -calculate sum of odd numbers
		 */
		
		int[] nums= {657, 665, 353, 466, 272, 464, 363};
		int sum=0;
		int sumOfEvens=0;
		int sumOfOdds=0;
		for(int n:nums) {
			sum=sum+n;
			if(n%2==0) {
				sumOfEvens=sum+n;     ////NOT FINISHED watch from 3:35h
			}else {
				sumOfOdds=sum+n;
			}
			
			
			
		}System.out.println(sum);
		System.out.println(sumOfEvens);
		
		
	}

}
