package d21_Loops4;

public class dNeighbours {
	public static void main(String[] args) {
	//find two same characters side by side
	
	//  1) using charAt	
		String word="heelddhhdhdhdhhkliuiyyyiuysaa,mlo";
		for(int n=0; n<word.length()-1; n++) {
			if(word.charAt(n) == word.charAt(n+1)) {
				System.out.println("Beep - "+word.charAt(n));
			}
		}
		
	//	2) using substring
		for(int n=0; n<word.length()-1; n++) {
			if(word.substring(n,  n+1).equals(word.substring(n+1, n+2))) {
				System.out.println("Beep  -  "+word.substring(n, n+1));
			}
		}
	
	
	
	
	
	
	
}
}
