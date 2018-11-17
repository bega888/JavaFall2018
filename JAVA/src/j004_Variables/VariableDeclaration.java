package j004_Variables;
public class VariableDeclaration {
public static void main(String[] args) {
	byte a=5;				//                      -128 to 127
	short b=10;				//                   -32,768 to 32,767
	int c=15;				//            -2,147,483,648 to 2,147,483,647
	long d=20;				//-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
	long e=(a+b+c)-d;
	System.out.println("The sum of above numbers are equals to: "+e);		
	
	float f=1.99f; 			
	double g=29.99;
	double t=f+g;
	System.out.println("Your total is: "+t);
	
	char i='M';                     //single charachter
	System.out.println("What is the gender: "+i);
	
	boolean isMale;                  //gives true or false value
	

	
	
}
		
}
