package d17_ReviewSession2;

public class dStrings03 {
	public static void main(String[] args) {
		//country name abbreviation
		String country="Russia";
		String countryAbr=country.substring(0, 2).toUpperCase();
		System.out.println(countryAbr);
		
		//TERNARY condition using ? and :
		String status;
		status=(countryAbr.length()==2)?"2 chars detected":"2 chars were not found";
		System.out.println(status);
		
		String status2;
		status2=countryAbr.length()==2 ? countryAbr.charAt(0)=='U'?"Maybe USA":"Not USA for sure":"2 chars not found"; //NEED REVISION ON INNER TERNARY !!!!!!!
		System.out.println(status2);
		
		
		
		
		
		
		
		
	}

}
