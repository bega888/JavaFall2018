package d17_ReviewSession2;

public class fDynamicSubstring {
	public static void main(String[] args) {
		String sentence="We are learning Java programming";
		/*
		 * indexOf -> accepts a string and finds the position
		 */
		int beggining=sentence.indexOf("learning");
		beggining +="learning".length();
		int ending=sentence.indexOf("programming");
		
		String position=sentence.substring(beggining, ending);
		System.out.println(position.trim());
		
		
		
		//  REVIEW THIS CODES
		
		
	}

}
