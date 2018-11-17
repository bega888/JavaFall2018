package d38_ReviewSession;

public class ILb_removeCON {
	public static void main(String[] args) {
		
	con("Conconully");
		
		
				
		
	}

	
	public static String con(String s) {
		s=s.toLowerCase().trim();
		
		if(s.contains(" ")) {            //is it only one word-Invalid Data
			System.out.println("invalid data");
		}else if(s.length()<3) {                //at least 3 character-Empty value
			System.out.println("");
		}else if(!(s.contains("con"))) {        //dosn't contain "con"-Original value
			System.out.println(s);
		}else if(s.contains("con")) {          //contains "con"-Remove all con's -> Conconully ->nully
			s=s.replace("con", "");
			System.out.println(s);
		}
		return s;
	}
		
		
	}
	
	/*
	 * else if(s.contains("con")){
	 * StringBuilder s1=new StringBuilder(word);
	 * s.delete(s.indexOf("con"), s.indexOf("con"+3));
	 * return s1.toString();
	 */
	
	
	// ask the difference between return and println 

