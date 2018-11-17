package d28_ArrayClass;

public class VAcPrintFirstAndLast {
	public static void main(String[] args) {
		String[] words= {"hello", "why", "by", "apple", "note", "water"};
		for(String word:words) {
			System.out.println(word.charAt(0)+""+word.charAt(word.length()-1));
		}
		
		
		System.out.println("------------using substring------------");
		for(String word:words) {
			System.out.println(word.substring(0,  1)+word.substring(word.length()-1));
			
		}
		
		System.out.println("--------------using for loop---------------");
		for(int i=0; i<words.length; i++) {
			System.out.println(words[i].substring(0, 1)+words[i].substring(words[i].length()-1 ));
		}
	}

}
