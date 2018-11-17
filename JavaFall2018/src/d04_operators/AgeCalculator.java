package d04_operators;

public class AgeCalculator {
	public static void main(String[] agrs) {
		//program to calculate age for a given birth year
		int currentYear, yearOfBirth, age;
		currentYear=2018;
		yearOfBirth=1964;
		age=currentYear-yearOfBirth;
		System.out.println("Your age is: "+age);
		System.out.println("If you were born in "+yearOfBirth+" you are "+age+" years old.");
		
		String output="If you were born in "+yearOfBirth+" you are "+age+" years old.";
		System.out.println(output);
		
		
		
		
		
	}

}
