package d15_stringManupMore;

public class warmUpTasks {
	public static void main(String[] args) {
		// onetwotwoone
		String w1="one", w2="two";
		String added=w1.concat(w2).concat(w2).concat(w1);
		System.out.println(added);
	//****************************************************
		// oneeight
		String wr1="one", wr2="eight";
		String wrAdd=wr1.concat(wr2);
		System.out.println(wrAdd);
	//****************************************************
		// oneight
		int length=wr1.length();
		char last=wr1.charAt(--length);
		char first=wr2.charAt(0);
		if(last==first) {
			System.out.println(wr1.concat(wr2.substring(1)));
		}else {
			System.out.println(wr1.concat(wr2));
		}
	//****************************************************
		//if the length is odd and equal or more than 3, print character in the middle)
		String word="aziza ";
		word=word.trim();        //it is good to trim, coz' some people tend to press space button before and after typing
		int lengthWord=word.length();  //get the length to see if it is odd || even.
		if(lengthWord%2!=0 && lengthWord>=3) {
			System.out.println(word.charAt(lengthWord/2));
		}else {
			System.out.println("Either word has less than 3 characters or it is devidable by 2");
		}
		//now check above example and if the word length is odd and > 3, print the middle 3 letters
		if(lengthWord%2!=0 && lengthWord>3) {
			System.out.println((word.charAt(lengthWord/2-1))+""+(word.charAt(lengthWord/2)+""+(word.charAt(lengthWord/2+1))));
		}else {
			System.out.println("Either word has less than 3 characters or it is devidable by 2");
		}
		
	}

}
