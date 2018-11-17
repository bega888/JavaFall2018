package d11_conditionals5;

public class Calculator {
	public static void main(String[] args) {
		double num1, num2, result;
		char operator;
		
		num1=5;
		num2=3;
		operator='%';
		switch(operator) {
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
		case '%':
			result=num1%num2;
			break;
			default:
			System.out.println("Error");
			return; //means don't run the rest of the code, get out Switch right here
		}
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
