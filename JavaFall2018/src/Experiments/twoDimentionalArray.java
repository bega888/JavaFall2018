package Experiments;

import java.util.Arrays;
import java.util.Random;

public class twoDimentionalArray {
	public static void main(String[] args) {
		Random random=new Random();
		//System.out.println(random.nextInt(100));
		
		int [][] numbers=new int[4][];
		numbers [0] = new int[5];
		numbers [1] = new int[3];
		numbers [2] = new int[7];
		numbers [3] = new int[7];
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				numbers[i][j]=random.nextInt(100);
		}	
	}
		for(int i=0; i<numbers.length; i++) {
		System.out.println(Arrays.toString(numbers[i]));
		
		
		}	
	}

}
