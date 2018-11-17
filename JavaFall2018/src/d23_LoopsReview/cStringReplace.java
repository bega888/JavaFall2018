package d23_LoopsReview;

public class cStringReplace {
	public static void main(String[] args) {
		
		String sentence="We are learning Java";
		System.out.println(sentence);
		sentence=sentence.replace("Java", "C#");
		System.out.println(sentence);
		
		sentence=sentence.replace("learning", "practicing");
		System.out.println(sentence);
		
		sentence=sentence.replaceAll("Python", "Java"); //no Python in the sentence, so skipped
		System.out.println(sentence);
		
		String result="123,456,001 results";
		result=result.replace(",", "").replace("results", "");
		System.out.println(result);
		
		
		
		
		
		
		
		
	}

}
