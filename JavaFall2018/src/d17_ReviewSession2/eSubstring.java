package d17_ReviewSession2;

public class eSubstring {
	public static void main(String[] args) {
		String diceResults="1-30 0f 1,367 positions";
		System.out.println(diceResults.substring(8, 13));		
		
		String languages=new String("Java, Fortrun, English, Cobol, Ruby, C#");
		String lan1, lan2, lan3, lan4, lan5, lan6;
		//use Substring and assing in each language
		//for the last language pass just one number to Substring
		
		lan1=languages.substring(0, 4);
		lan2=languages.substring(6, 13);
		lan3=languages.substring(15, 22);
		lan4=languages.substring(24, 29);
		lan5=languages.substring(31, 35);
		lan6=languages.substring(37);
		
		int position=languages.indexOf("C"); //can be used to find the positions of each word, case sensitive
		System.out.println(position);
		
		System.out.println(lan1);
		System.out.println(lan2);
		System.out.println(lan3);
		System.out.println(lan4);
		System.out.println(lan5);
		System.out.println(lan6);
		
		
	}

}
