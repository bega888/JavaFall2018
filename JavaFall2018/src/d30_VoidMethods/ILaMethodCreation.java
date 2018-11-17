package d30_VoidMethods;

public class ILaMethodCreation {
	public static void main(String[] args) {
	printLastLetter("Hello");	
		
			
	}

	
	
	public static void printLastLetter(String word) {
		if(word.isEmpty()) {
			System.out.println("Your word is empty");
			return;
		}System.out.println(word.charAt(word.length()-1));
	}
	
	
	
	
}
