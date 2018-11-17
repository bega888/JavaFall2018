package d29_MultiDimentional;

import java.util.Arrays;
import java.util.Random;

public class ILcRandomNums {
	public static void main(String[] args) {
		Random random=new Random();
		// System.out.println(random.nextInt(50)); //give me any random number under 50.
		
		
		
		int[][] nums = new int[4][];
		nums[0]=new int[5];
		nums[1]=new int[3];
		nums[2]=new int[7];
		nums[3]=new int[7];
		
		
		
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				nums[i][j]=random.nextInt(100);
			}
		}
		for(int i=0; i<nums.length; i++) {
			System.out.println(Arrays.toString(nums[i]));
		}
		
		
		
		
	}

}
