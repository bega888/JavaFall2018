package d22_Loops5_Nested;

public class bNestedLoopExample {
	public static void main(String[] args) {
		/*
		 * Loop inside the loop, (Outer and Inner Loops)
		 * 
		 * write a program that prints numbers from 1-10 in the same line separated 
		 * by space. Use FOR LOOP
		 * 
		 * Add one more FOR LOOP and everything above. Needs to Loop 5 times
		 */
		
		
		for(int j=1; j<=5; j++) {
			
			for(int i=1; i<=10; i++) {
				System.out.print(i+" ");
			}System.out.println();
		
		}
		
		/*modify above code to print  
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 * 123456
		 * 1234567
		 * 12345678
		 * 123456789
		 * 12345678910
		 */
		
		
		for(int j=1; j<=10; j++) {
			
			for(int i=1; i<=j; i++) {
				System.out.print(i+" ");
			}System.out.println();
		
		}
		
		//different patters
		
		for(int j=10; j>=1; j--) {
			
			for(int i=1; i<=j; i++) {
				System.out.print(i+" ");
			}System.out.println();
		
		}
		
	}
	
}
