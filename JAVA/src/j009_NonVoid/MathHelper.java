package j009_NonVoid;

public class MathHelper {
	
	public int addition(int x, int y) {return x+y;}
	public int subtraction(int x, int y) {return x-y;}
	public double division(double x, double y) {return x/y;}
	public double multiplication(double x, double y) {return x*y;}
//---------------------------------------------------
	public static void main(String[] args) {
	MathHelper oper=new MathHelper();
		
		int aR = oper.addition(12, 13);
		System.out.println("addition result is "+aR);
			
		int sR=oper.subtraction(34, 23);
		System.out.println("substraction result is "+sR);
			
		double dR = oper.division(35, 12);
		System.out.println("addition result is "+dR);
			
		double mR=oper.multiplication(4, 6.8);
		System.out.println("substraction result is "+mR);
			
			
		
		
	}
}
