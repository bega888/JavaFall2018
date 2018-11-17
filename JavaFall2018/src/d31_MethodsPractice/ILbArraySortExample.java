package d31_MethodsPractice;

import java.util.Arrays;

public class ILbArraySortExample {
	public static void main(String[] args) {
	
		String[] shows= {"Game of Thrones", "Friends", "Prison Break", "Doctor Who", "Greys Anatomy"};
		Arrays.sort(shows);
		System.out.println("Sorted list of top 5 shows:");
		for(int i=0; i<shows.length; i++) {
			System.out.println("#"+i+" "+shows[i]); //why shows[i]??
		}
		
		
		
		
		
		
		
	}

}
