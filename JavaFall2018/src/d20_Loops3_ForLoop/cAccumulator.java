package d20_Loops3_ForLoop;

public class cAccumulator {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=5; i++) {
			sum=sum+i;
		}System.out.println("Sum is "+sum);
		
		
		
		
		int sumOfOdds=0, sumOfEvens=0;
		
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				sumOfEvens=sumOfEvens+i;
			}else {
				sumOfOdds=sumOfOdds+i;
			}
		}
		
		
	}

}
