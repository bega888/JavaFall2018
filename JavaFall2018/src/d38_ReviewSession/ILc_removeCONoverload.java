package d38_ReviewSession;

public class ILc_removeCONoverload {
	public static void main(String[] args) {
		
	System.out.println(removeTarget("Begmyrat", "Myrat"));
		
		
				
		
	}

	
	public static String removeTarget(String word, String target) {
		word=word.toLowerCase().trim();
		target=target.toLowerCase().trim();
		if(word.contains(" ")) {            
			System.out.println("invalid data");
			return "";
		}else if(word.length()<target.length()) {                
			System.out.println("Invalid data");
			return "";
		}else if(word.contains(target)) {    //overload     
			StringBuilder sb=new StringBuilder(word);
			sb.delete(word.indexOf(target), word.indexOf(target)+target.length());
			return sb.toString();
		}else {
			return word;
		}
		
	}
		
		
	}
	
	
	
	
	// ask the difference between return and println 

