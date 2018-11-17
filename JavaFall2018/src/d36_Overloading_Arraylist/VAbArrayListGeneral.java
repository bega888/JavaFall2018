package d36_Overloading_Arraylist;

import java.util.ArrayList;

public class VAbArrayListGeneral {
	public static void main(String[] args) {
		
	//1) General(raw type) ArrayList that accepts any type, however creating in this way 
	//   is not controlled and will not be useful in %99 of the time
		ArrayList list=new ArrayList();
		list.add("java");
		list.add("selenium");
		list.add(123);
		list.add(23.7);
		list.add(true);
		list.add('#');
		System.out.println(list);
		System.out.println(list.get(1));
		System.out.println(list.size());
		
	//2) Restricted type, that can store only one type of a variable
		ArrayList<String> names=new ArrayList<>();
		names.add("Begmyrat");
		names.add("Khalili");
		names.add("Ali");
		names.add("Murodil");
		names.add("Esen");
		System.out.println(names);				//printing out the values
		System.out.println(names.size());		//length of ArrayList
		System.out.println(names.get(4));		//getting values
		names.remove(4);                      	//deleting values
		names.remove("Ali");					//deleting values
		names.set(0, "Dovlet");					//changing the values
		names.add(0, "Begmyrat"); 				//adding new values
		
		System.out.println(names);
		
		
		ArrayList<Integer> nums=new ArrayList<>();    //int vs Integer -> Wrapper Classes
		nums.add(123);
		nums.add(456);
		nums.add(5643);
		System.out.println(nums);
		for(int i:nums){System.out.println(i);}
		for(int j=0; j<=nums.size()-1; j++) {System.out.println(nums.get(j));} 
		
		ArrayList<Character> myChars=new ArrayList<>();
		myChars.add('&');
		
		
		names.addAll(list);						//adding two ArrayList values
		System.out.println(names);
		names.addAll(2, list);					//adding two ArrayList values giving add location
		System.out.println(names);
		
		names.add(names.size()-2, "Murat");
		System.out.println(names);
		
		
		
	}
	
}
