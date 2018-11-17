package d32_MethodsWithReturn1;

public class ILbGetHasLastName {
	public static void main(String[] args) {
	String[] name= {"Murat Koch", "Ali", "Deniz Hokhan", "Alev Kose", "Sena"};	
	getWithLastName(name);	
		
	}

	public static String[] getWithLastName(String[] nameList) {
		int count=0; 
		for(String name : nameList) {
			if(name.contains(" ")) { 
				count++;
			}
		}
		String[] result=new String[count];
		System.out.println("Count: "+count);
		return result;
	}
	
	
	
	
	
	
	
}
