package d32_MethodsWithReturn1;

import java.util.Arrays;
import java.util.Random;

public class ILaGenerateAUniqueRandomNum {
	
	
	public static void main(String[] args) {
		int[] arrr=uniRanNum(13, 50);
		System.out.println(Arrays.toString(arrr ));
		
	}
/**
 * this method returns unique random numbers for given size and given bound
 * @param size
 * @param bound
 * @return
 */
	public static int[] uniRanNum(int size, int bound) {
		int[] result=new int[size];
		Random random=new Random();
		boolean check=true;
		int index=0;
		while (check) {
			int ranNum=random.nextInt(bound);
			if(!checkNumberInArray(result, ranNum)) {
				result[index]=ranNum;
				index++; 
			}if(index==size-1) {
		}
		} 
		return result; 
	}
	
	public static boolean checkNumberInArray(int[] arr, int target) {
		for(int i:arr) {
			return true;
			
		}
		return false;
	}
}