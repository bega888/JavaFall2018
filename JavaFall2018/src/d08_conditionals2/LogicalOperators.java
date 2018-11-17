package d08_conditionals2;

public class LogicalOperators {
	public static void main(String[] args) {
		/*
		 * AND ->  &&
		 * 
		 * true && true -> true
		 * true && false -> false
		 * false && true -> false
		 * false && false -> false
		 * 
		 * OR  ->  ||
		 * 
		 * true && true -> true
		 * true && false -> true
		 * false && true -> true
		 * false && false -> false
		 * 
		 * NOT ->  !  
		 * 
		 * true -> false
		 * false -> true
		 * 
		 */
		
		boolean goodBrand=true;
		boolean onSale=false;
		if(goodBrand && onSale) {     
			System.out.println("Lets buy it");   
		}
		boolean goodQuality=true;
		boolean cheap=false;
		if(goodQuality || cheap) {
			System.out.println("We have to buy this");
		}
		
		int a=10, b=20;
		if (!(a==b)) {
			System.out.println("they are equal");
		}
		
		
		int pincode = 4404;
		if (!(pincode>0)) {
			System.out.println("Pincode cannot be 0 or negative number");
		}else {
			System.out.println("welcome");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
