package d07_conditionals;

public class IfStatement {
	public static void main(String[] args) {
	
		if(10>5) {
			System.out.println("it is true");
		}
		
		int chairs=75;
		if(chairs==75) {
			System.out.println("We have 75 chairs");
		}
		
		//=========================
		//  if(condition){
		//      do this
		//  }else{
		//      do this}
		 
//		double coffePrice=2.75;
//		if (coffePrice<3.50) {
//			System.out.println("I will buy a coffee");
//		}else {
//			System.out.println("Too expensive, I will pass ");
//		}
//		
//		double accountBalance = 450.50;
//		double price = 700;
//		if (accountBalance > price) {
//			System.out.println("Buy the item");
//		}else {
//			System.out.println("Not enough balance");
//		}
		
		int speedLimit=55;
		int currentSpeed=76;
		if (currentSpeed>speedLimit+20) {
			System.out.println("Getting a speeding ticket");
		}else {
			System.out.println("Keep driving");
		}
		
		boolean isPrime=false;
		if(isPrime) {
			System.out.println("Shipping cost is 0.0");
		}else {
			System.out.println("Shipping cost is 7.99");
		}
		
		
		
	}

}
