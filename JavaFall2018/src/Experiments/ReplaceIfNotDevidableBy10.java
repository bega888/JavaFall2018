package Experiments;

import java.util.Arrays;

public class ReplaceIfNotDevidableBy10 {
	public static void main(String[] args) {
		int [] numbers= {4, 16, 10, 3, 20, 14, 15};
		
		int replacement=10;
		System.out.println(Arrays.toString(numbers));
		
		for(int i=0; i<numbers.length; i++){
			if(numbers[i]%10 !=0) {
				numbers[i]=replacement;
			}else {
				replacement=numbers[i];
			}
		}
			System.out.println(Arrays.toString(numbers));
		
		
		
	}

}
