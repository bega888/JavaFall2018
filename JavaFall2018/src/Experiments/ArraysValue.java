package Experiments;
import java.util.*;

public class ArraysValue{
	public static void main(String[] args) {
		String [] names= {"james", "john", "Adam"};
		
		String myNames=Arrays.toString(names);  //will convert everything to one whole string without changing the look
		System.out.println(myNames);
		
		String [] names1= {"jameS", "johN", "AdaM"};
		System.out.println(names1.toString()); //will convert to one whole string but will change the apperance 
		
		
		
		
	}

}
