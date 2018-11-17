package d00_myNotes;

public class convertStringToPrimitiveOrWrapper {
	public static void main(String[] args) {
		
		String bool="true";
		String num1="111";
		String num2="222";
		String num3="333";
		String num4="444";
		String num5="555.75";
		String num6="666.13";
		
		// .parse(str) to Primitive
		
		boolean ruOK=Boolean.parseBoolean(bool);
		//String to char cannot be converted
		Byte.parseByte(num1);
		Short.parseShort(num2);
		
		int n3=Integer.parseInt(num3); //we have to store it in a variable to use it
		long n4=Long.parseLong(num4);
		System.out.println(n3+n4); //will give 777 now
		
		float n5=Float.parseFloat(num5);
		double n6=Double.parseDouble(num6);
		System.out.println(n5+n6); 
		
		//  .valueOf(str)  to Wrapper class
		
		Boolean.valueOf(bool);
		//String to Character cannot be done
		Byte.valueOf(num1);
		System.out.println(num1);
		
		
	}

}
