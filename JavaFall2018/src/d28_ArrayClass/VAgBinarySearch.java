package d28_ArrayClass;

import java.util.Arrays;

public class VAgBinarySearch {   //Arrays have to be sorted before using this method
	public static void main(String[] args) {
		
		String[] words= {"cake", "tomato", "pizza", "cherry", "spoon", "plate"};
		Arrays.sort(words);
		System.out.println(Arrays.binarySearch(words,  "pizza"));//gives indexOx
		
		
		
		
		
	}

}
