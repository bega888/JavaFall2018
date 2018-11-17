package d08_conditionals2;

public class IfWithNoCurlyBrace {
	public static void main(String[] args) {
		int kiwi=2;
		if(kiwi>0)
			System.out.println("I have Kiwies");  //if true, only one thing to do
		
		int carrot=2;
		if(carrot>0)
			System.out.println("I have Kiwies");  //if true/false, only one thing to do
		else
			System.out.println("I dont have any carrots");
		
		//================================================================================
		
		int banana=0;
		if(banana>0)
			System.out.println("I have Bananas");  //if more thing to do use always curly braces
			System.out.println("Do you want any?");
		
			
		System.out.println("==================================");
			
		int apple=0;
		if(apple>0)
				System.out.println("I have Apples");  //if more thing to do use always curly braces
		else
			System.out.println("I dont have any apples");
			System.out.println("Sure, here you go");  // this has nothing to do with IfElse
		
		
			// Using No Curly Braces have absolutely no benefit, so always USE CURLY BRACES !!!
		
		
	}

}
