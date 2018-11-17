package d16_ReviewSession1;

public class eBooleanWithAndWithoutIf {
	public static void main(String[] args) {
		/*
		 * 	<, <=, >, >=, ==, !=
		 *	&&, ||, !, ^, (&, |)  &-will check both conditions even 1st one is false, &&-will check 1st condition, if-true then will check 2nd condition
		 */
	
		double budget = 40;
		
		double phone = 250;
		double watch = 105.5;
		double bag = 80;
		
		if(budget>=(phone+watch+bag)) {
			System.out.println("You can buy everything");
		}else if((phone+watch+bag)>budget && budget>=(phone+watch)) {
			System.out.println("You can buy 'phone and watch' or 'phone and bag' or 'watch and bag'");
		}else if(phone+watch>budget && budget>=watch+bag) {
			System.out.println("You can buy 'watch and bag'");
		}else if(watch+bag>budget && budget>=bag) {
			System.out.println("You can buy only bag");
		}else {
			System.out.println("You are broke, get out of this store!");
		}
		
		
		
		
		
	}

}
