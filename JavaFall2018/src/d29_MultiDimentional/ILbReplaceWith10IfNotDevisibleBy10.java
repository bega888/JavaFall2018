package d29_MultiDimentional;

import java.util.Arrays;

public class ILbReplaceWith10IfNotDevisibleBy10 {
	public static void main(String[] args) {
		
		int[] nums= {4, 9, 12, 30, 45, 60, 40};
		System.out.println(Arrays.toString(nums));
		
		int replacement=10;
		for(int i:nums) {
			if(i%10!=0) {
				i=replacement;
				System.out.print(i+" ");
			}else {
				replacement=i;
				System.out.print(i+" ");
			}
		}
		
		
		
		
		
		
		
		
	}

}
