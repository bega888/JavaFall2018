package d31_MethodsPractice;

public class ILcArrayMinMaxInt {
	public static void main(String[] args) {
		
		int[] nums= {34, 3435, 66, 6557, 2989, 545, 1232, 656, 878};
		int minNum=nums[0];
		int maxNum=nums[0];
		for(int i=0; i<nums.length; i++) {
			if(maxNum<nums[i]) {
				maxNum=nums[i];
			}
			if(minNum>nums[i]) {
				minNum=nums[i];
			}
		}
		System.out.println(minNum);
		System.out.println(maxNum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
