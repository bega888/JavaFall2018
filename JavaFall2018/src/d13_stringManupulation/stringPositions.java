package d13_stringManupulation;

public class stringPositions {
	public static void main(String[] args) {
		String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(alphabet.indexOf('A'));
		System.out.println(alphabet.indexOf('P'));
		int pPosition=alphabet.indexOf('P');
		System.out.println(pPosition);
		int hijPosition=alphabet.indexOf("HIJ");   //starting point of "H"->7
		System.out.println(hijPosition);
		
		String sentence="Today is Tuesday and tomorrow is Wednesday.";
		System.out.println(sentence.indexOf("tomorrow")); //21
		System.out.println(sentence.lastIndexOf('a')); //40
		System.out.println(sentence.length()); //43 
		
		if(sentence.indexOf("tomorrow") > 0){
			System.out.println("Word is there");
		}else {
			System.out.println("word is missing");
		}
		
		
		
		
	}

}
