package d37_ArraylistMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class VAaWarmUp {
	public static void main(String[] args) {
		
		ArrayList<String> cities=new ArrayList<>();
		cities.add("Chicago");
		cities.add("Los Angeles");
		cities.add("New York");
		cities.add("Seattle");
		cities.add("Juneau");
		cities.add("Austin");
		cities.add("San Diego");
		cities.add("Rokford");
		cities.add("London");
		cities.add("Istanbul");
		System.out.println(cities.size());
		System.out.println(cities);				//println will still print in one line
		for(String city:cities) {
			System.out.print(city+" | ");  		//printing out using FOR EACH LOOP
		}
		System.out.println();
		for(int i=0; i<cities.size(); i++) {	// printing out using FOR LOOP
			System.out.print(cities.get(i)+" - ");
		}
		System.out.println("\n");
		
		ArrayList<String> longNames=new ArrayList<>();
		System.out.println(longNames.size());
		System.out.println("Is it empty? :"+longNames.isEmpty()+"\n");
		
		System.out.println("-------Long Names with FOR EACH LOOP----------\n");
		for(String city:cities) {
			if(city.length()>6) {
				longNames.add(city);
			}
		}System.out.print(longNames);
		
		System.out.println("\n\n-------Long Names with FOR LOOP----------\n");
		longNames.clear();
		for(int i=0; i<cities.size(); i++ ) {
			String s=cities.get(i);
			if(s.length()>6) {
			ArrayList<String> c1 = new ArrayList<String>(Arrays.asList(s.split(",")));
			longNames=c1;
			System.out.print(longNames);
			}
		}
		
		
		
	}

}
