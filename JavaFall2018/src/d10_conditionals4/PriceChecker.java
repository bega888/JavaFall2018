package d10_conditionals4;

public class PriceChecker {
	public static void main(String[] args) {
		
		/*
		 * item  -> 1-50  "Cheap"
		 * 51-100  "Expensive"
		 * "Not buying"
		 */
		
		int itemCost=45;
		String status;
		if(itemCost>=1 && itemCost<=50) {
			status="Cheap";
		}else if(itemCost>50 && itemCost<=100) {
			status="Expensive";
		}else {
			status="Not buying";
		}
		System.out.println(status);
		
		//converting to TERNARY
		status=(itemCost>=1 && itemCost<=50)?"Cheap":(itemCost>50 && itemCost<=100)?"Expensive":"Not buying";
		System.out.println(status);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
