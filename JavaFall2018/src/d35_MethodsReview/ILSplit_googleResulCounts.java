package d35_MethodsReview;

import java.util.Arrays;
import java.util.Scanner;

public class ILSplit_googleResulCounts {
	public static void main(String[] args) {
	String result="About 691, 000, 000 results (0.78 seconds)";	
	System.out.println(resultCount(result));	
		
		
		
	}
	
	public static String resultCount(String str) {
		String[] strSplit=str.split(" ");
		String resultwithComma=strSplit[1];
		String resultWithOutComma=strSplit[1].replaceAll(",", "");
		return resultWithOutComma;
	}	
	
	
	
	
		
}
