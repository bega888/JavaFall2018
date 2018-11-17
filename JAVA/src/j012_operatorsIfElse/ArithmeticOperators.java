package j012_operatorsIfElse;

public class ArithmeticOperators {
 public static void main(String[] args) {
	int n=10;
	int k=3;
	
	int add=n+k;
	int minus=n-k;
	int multiply=n*k;
	int divide=n/k;
	double divide1=n/k; //n&k are declared as int so it will give
	                    //us 3.0 instead of 3.333333
	int remainder=n%k;
	
	System.out.println("plus:"+add);
	System.out.println("minus:"+minus);
	System.out.println("multiply:"+multiply);
	System.out.println("divide:"+divide);
	System.out.println("divide:"+divide1);
	System.out.println("remainder:"+remainder);
	
	int evenOdd=n/k;
	boolean b=evenOdd==0;
	System.out.println("Is it even? "+b);
	
}
	
}
