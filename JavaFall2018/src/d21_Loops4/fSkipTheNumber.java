package d21_Loops4;

public class fSkipTheNumber {
	public static void main(String[] args) {
	
		//if num divisible by 5, skip
		//if num divisible by 27, exit the loop
		
		for(int i=0; i<=50; i++) {
			
			if(i%5==0) {
			continue;
			}
			if(i%27==0) {
				break; 
			}System.out.print(i+", ");
			
			
		}
		
		
		
		
		
		
		
		
	}

}
