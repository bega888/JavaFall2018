package d38_ReviewSession;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ILdRandomNums {
	public static void main(String[] args) {
		
	System.out.println(getRandomNumList(7, 50));
	System.out.println(getRandomNumList(5, 15));
		
	}

	public static List<Integer> getRandomNumList(int size, int bound){
		Random random=new Random();
		List<Integer> nums=new ArrayList<>();
		for(int i=0; i<size; i++) {
			nums.add(random.nextInt(bound));
			
		}
		return nums;
		
	}
	
	
	
	
}
