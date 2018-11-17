package d09_conditionals3;

//import java.util.Scanner;

public class WarmUpTasks {
	public static void main(String[] args) {
		/*Scanner input=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int num1=input.nextInt();
		int num2=input.nextInt();
		int max;
		if(num1>num2) {
			max=num1;
			System.out.println("Max: "+max);
		}else {
			max=num2;
			System.out.println("Max: "+max);
		}*/
		
		
		//System.out.println("Enter three  numbers:");
//		num1=input.nextInt();      // num1, num2, max variables can be reused without declaration, 
//		num2=input.nextInt();      //     but their values will change
//		int num3=input.nextInt();  //we have a new variable, so we declare its type
//		
		int num1, num2, num3, max;
		num1=54;
		num2=54;
		num3=5;
		
		if(num1>num2 && num1>num3) {
			max=num1;
			System.out.println("Max: "+max);
		}else if(num2>num1 && num2>num3){
			max=num2;
			System.out.println("Max: "+max);
		}else if(num3>num1 && num3>num2){
			max=num3;
			System.out.println("Max: "+max);
		}else {
			System.out.println("");
		}
		
	/*  1. num1>num2>num3 PASS
		2. num1>num3>num2 PASS
		3. num2>num1>num3 PASS
		3. num2>num3>num1 PASS
		5. num3>num1>num2 PASS
		6. num3>num2>num1 PASS
		7. num1=num2>num3 FAIL ->BUG: expected value:54, actual result:5
		8. num1=num2<num3 PASS
		9. num2=num3>num1 PASS
		10 num2=num3<num1 PASS
		11 num3=num1>num2 PASS
		12 num3=num1<num2 PASS
	*/
		
		
		
		
		
	}
	
}
