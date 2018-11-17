package d25_Arrays2;

public class dCountMatcjes {
	public static void main(String[] args) {
		double[] prices= {2.99, 5.87, 3.79, 27.98, 49.99, 56.76, 53.87, 29.89, 38.45};
		int count=0;
		for(double price:prices) {
			if(price>20) {
				count++;				
			}
		}
		if(count==0) {
			System.out.println("No items for more than $20");
		}else {
		System.out.println(count+" items more than $20");
		}
		
		
		
		
		
		
		
		
	}

}
