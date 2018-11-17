package j016_Switch;

public class DrinkOrder {
	public static void main(String[] args) {
		boolean hot=false;
		boolean cold=true;
		
		if(hot) {
			System.out.println("Do you want tea or coffee?");
			boolean tea=true;
			boolean coffee=false;
			if(tea) {
				System.out.println("You selected tea");
			}else if(coffee) {
				System.out.println("You selected coffee");
			}
		}else if(cold) {
			System.out.println("Do you want water or juice?");
			boolean water=true;
			boolean juice=false;
			if(water) {
				System.out.println("You selecter water");
			}else if(juice) {
				System.out.println("You selected juice");
			}else {
				System.out.println("Customer did not select drink");
			}
		}else {
			System.out.println("No drinks selected");
		}
		
	}

}
