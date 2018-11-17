package d35_MethodsReview;

import java.util.Arrays;
import java.util.Scanner;

public class ILcPolindromes {
	public static void main(String[] args) {
		
		String name="cimmkic";
		System.out.println(isPalindrome(name));
		
		
	}
	
	public static boolean isPalindrome(String iname) {
		String str="";
		for(int i=iname.length()-1; i>=0; i--) {
			str +=iname.charAt(i);
		}
		if(str.equals(iname)) {
			return true;
		}else {
			return false;
		}
		
	}
	
		
}
