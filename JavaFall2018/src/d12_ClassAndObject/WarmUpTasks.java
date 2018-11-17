package d12_ClassAndObject;

public class WarmUpTasks {
	public static void main(String[] args) {
		char start, end;
		start='A';
		end='D';
		//check if all valid
		if(!(start>='A' && start <='D' && end>='A' && end<='D')) {
			System.out.println("Invalid start or end");
		}else if(start==end) {
			System.out.println("Already there");
		
		}else if(start=='A') {
			if(end=='B') {
				System.out.println("Go right");	
			}else if(end=='C') {
				System.out.println("Go right -> Go down");	
			}if(end=='D') {
				System.out.println("Go right -> Go down -> Go left");	
			}
		}else if(start=='B') {
			if(end=='A') {
				System.out.println("Go down -> Go left -> Go up");	
			}else if(end=='C') {
				System.out.println("Go down");	
			}if(end=='D') {
				System.out.println("Go down -> Go left");	
			}
		}else if(start=='D') {
			if(end=='A') {
				System.out.println("Go up");	
			}else if(end=='B') {
				System.out.println("Go up -> Go righ");	
			}if(end=='C') {
				System.out.println("Go up -> Go right -> Go down");	
			}

		}
		
		
		
		
	}
}
		
		
		
		
