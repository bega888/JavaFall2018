package d28_ArrayClass;

public class VAaCountEvents {
	public static void main(String[] args) {
		//count even numbers in the array
		int[] nums= {2, 1, 2, 3, 4};
		int counter=0;
		for(int n:nums) {
			if(n%2==0) {
				counter++;
			}
		}System.out.println(counter);
		
		
		
	}

}
