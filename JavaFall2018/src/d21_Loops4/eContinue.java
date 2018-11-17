package d21_Loops4;

public class eContinue {
	public static void main(String[] args) {
	/*
	 * BREAK
	 * CONTINUE	
	 */
	
	for(int i=1; i<5; i++) {
		System.out.println(i);
		break;  //-> runs and prints out 1 till it reaches break, and thats it
	}
		
	for(int b=2; b<7; b++) {
		break;     //it is not gonna run, compile error of Unreachable code
	//	System.out.println(b);
	}
	
	for(int k=0; k<=10; k++) {
		
		if(k==1 || k==2){
		continue;
		
		}System.out.println("Value of k "+k);
		
	} 
	
	}

}
