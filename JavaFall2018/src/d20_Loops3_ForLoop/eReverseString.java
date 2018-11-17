package d20_Loops3_ForLoop;

public class eReverseString {
	public static void main(String[] args) {
		// JAVA -> AVAJ, or BEGMYRAT -> TARYMGEB   use For Loop
		String name="BEGMYRAT";
		String reversed="";
		
		for(int idx=name.length()-1; idx>=0; idx--) {
			reversed=reversed+name.charAt(idx);
		}System.out.println(reversed);
		
		
		
		
		
		
		
	}

}
