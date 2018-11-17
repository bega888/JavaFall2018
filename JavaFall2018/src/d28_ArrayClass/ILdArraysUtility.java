package d28_ArrayClass;

public class ILdArraysUtility {
	public static void main(String[] args) {
		
		String[] students=new String[70];
		
		for(String s:students) {
			if(s.equals("James")) {
				System.out.println("True");
				break;  //this is not a good code. Imagine using this on creation of gmail account, and if the code
			}           //has to tell you if your email name is already taken or not searching/looping among millions of gmail users.
		}
		//Arrays.binarySearch(a, key)  a->array variable name, key->what you are looking for
		// to use binarySeach arrays need to be sorted first
		
		
		 
		
		
		
		
		
	}

}
