package d26_Arrays3;

public class cToCharArray {
	public static void main(String[] args) {
		
		String name="Begmyrat";
		char[] nameArray=name.toCharArray();
		for(char l:nameArray) {
			System.out.print(l+"-");
		}
		
		String gift="Diamond Ring";
		char[] giftArray=gift.toCharArray();
		for(int i=giftArray.length-1; i>=0; i--) {
			System.out.print(giftArray[i]+"-");
		}
		
		
		
		
		
		
	}

}
