package j019_ForLoop;

public class Counter {
public static void main(String[] args) {
	int n=1;
	while(n<11) {
		System.out.print(n+", ");
		n++;
	}
	
	System.out.println("");   //just to get a next line
	
	int k=10;                        //initialization
	do {
	System.out.print(k+", ");
	k--;                             //decrement || increment
	}while(k>=1);                    //termination
}
}
