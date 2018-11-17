package d00_myNotes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_and_ArrayList {
	public static void main(String[] args) {
		
		/* ARRAY-single variable holding multiple value of same type. We don't have to create a new variable 
		 *       storing for each students/workers names.
		 * Represented by [] on declaration
		 * can hold multiple values of same type: primitives or objects
		 * fixed in size, cannot add more items or take out items
		 * values cannot be printed out directly, need to use Arrays.toString() method
		 * is ordered and can be accesses by index
		 * allows duplicate
		 * 
		 * SYNTAX: String, int, double, char -> created the same way
		 * import java.util.Arrays;		
		 * 		String[] beginnerStudents=new String[123];    pre-declaration has 123 students
		 * 		String[] beginnerStudents=new String[];       in one-dimentional Array, no need to pre-declare
		 * 		beginnerStudents[o]="Murat Sahedow";
		 * 		beginnerStudents[1]="Merjen Setdarova";
		 * 		beginnerStudents[2]="Batyr Gurbanow";
		 * 			or
		 * 		String[] beginnerStudents={Murat Sahedow, Merjen Setdarova, Batyr Gurbanow, ...}; 
		 * 
		 * METHODS:
		 * 		sout(beginnerStudents[1])									accessing Array elements
		 * 		Arrays.sort(beginnerStudents);								will sort in alphabetical order
		 * 		Arrays.binarySearch(beginnerStudents, "Batyr Gurbanow");	will give index/position if found
		 * 		Arrays.toString(beginnerStudents);							will print out the values/or use FOR Loop
		 * 
		 * 	Looping with FOR Loop
		 * 		for(int i=0; i<beginnerStudents.lenght(); i++){
		 * 			sout("names: "+beginnerStudents[i])
		 * 		}
		 * 	
		 * 	Looping with FOR EACH Loop
		 * 		for(String names : beginnerStudents){
		 * 			sout("names: "+names)
		 * 		}
		 * 
		 */
		
		//creating Array values
		String[] beginnerStudents= {"Murat Sahedow", "Merjen Setdarova", "Batyr Gurbanow"};
		
		//accessing Array elements
		System.out.println(beginnerStudents[1]);  // Merjen Setdarova
				
		//sorting Array elements
		System.out.print(Arrays.toString(beginnerStudents)+" -> initial unsorted value \n");   
		Arrays.sort(beginnerStudents);   //Batyr Gurbanow, Merjen Setdarova, Murat Sahedow 
		System.out.print(Arrays.toString(beginnerStudents)+" -> sorted value \n");   
		
		//finding the position of an element
		System.out.println(Arrays.binarySearch(beginnerStudents, "Merjen Setdarova"));  //1
		
		//printing out the values
		System.out.print(Arrays.toString(beginnerStudents)+"\n");  //gives Array representation format
		
		for(String names : beginnerStudents) {
			System.out.print(names+", ");                         //gives in a clean format
		}
		
		//EXERSISE-1   
		
		
		
		
		
		System.out.println("\n\n===============ARRAY LIST++++++++++++++\n");
		
		/* ARRAYLIST
		 * Represented <type> on declaration
		 * can hold only objects and storing any object type is possible, cannot store primitives
		 * unlike array its re-sizable
		 * values can be printed directly
		 * allows duplicate
		 * 
		 * SYNTAX 
		 * import java.util.ArrayList;
		 *     ArrayList<type> list1 = new ArrayList();  
		 * ex: ArrayList<String> list1 = new ArrayList();
		 * 	   List<type> list1 = new ArrayList<>(10);  -> modifiable predefined size
		 *     ArrayList list3 = new ArrayList(list2);
		 *     
		 *METHODS
		 *     add(Type element)     		adds the element to the end of its list
		 *     get(int index)				returns the element at the specified position
		 *     contains(Object element)		returns "true" if element is in its list, otherwise "false"
		 *     indexOf(Object element)		returns the index of the first occurrence of element in its list
		 *     clear()						removes all elements from its list
		 *     size()						returns the number of elements in its list (in Arrays we use get.lenght method)
		 *     remove(int index)			removes the element at the specified index of its list
		 *     isEmpty()					returns "true" if the list is empty, otherwise "false"
		 *     set(int index, Object element) overwrites the value at given index
		 *     
		 *     
		 */
		
		//creating ArrayList object
		ArrayList<String> list1=new ArrayList<>();
		List<String> list2=new ArrayList<>();
		//adding elements
		list1.add("Cybertek"); list1.add("Udemy");  
		list2.add("Google"); list2.add("Tesla"); list2.add("Amazon");
		System.out.println(list1);
		System.out.println(list2);
		//getting elements
		System.out.println("1st element: "+list1.get(0));
		//check of the item exists in the list
		System.out.println(list2.contains("Amazon"));  //=> case sensitive
		System.out.println(list2.contains("Cybertek")); //Cybertek in not in list2, so will return "false"
		//getting the index of item by value
		System.out.println(list2.indexOf("Tesla"));
		//how many items in the list
		System.out.println("size of list1: "+list1.size());
		//check if the list is empty
		System.out.println(list2.isEmpty());
		//setting the value for certain index
		list2.set(2, "Ebay");
		System.out.println(list2);
		//removing item by index
		list2.remove(1);
		System.out.println(list2);
		//removing all the items
		list2.clear();
		System.out.println(list2);
		System.out.println(list2.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
