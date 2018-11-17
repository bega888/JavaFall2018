package d11_conditionals5;

import java.util.Scanner;

public class WarmUpTask {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the day of the week:");
		int day=input.nextInt();
		String classAtSchool="", dayOfWeek="";
		
		if(day==1) {
			dayOfWeek="Monday";
			classAtSchool="Group Project";
		}else if(day==2) {
			dayOfWeek="Tuesday";
			classAtSchool="Java programming";
		}else if(day==3) {
			dayOfWeek="Wednesday";
			classAtSchool="Java programming";
		}else if(day==4) {
			dayOfWeek="Thursday";
			classAtSchool="SDLC/Manual QA Testing/Soft Skills";
		}else if(day==5) {
			dayOfWeek="Friday";
			classAtSchool="No Class";
		}else if(day==6) {
			dayOfWeek="Saturday";
			classAtSchool="Java programming";
		}else if(day==7) {
			dayOfWeek="Sunday";
			classAtSchool="Java programming";
		}else {
			System.out.println("ERROR: Invalid Day");
		}
		if(day>8);
		System.out.println("On "+dayOfWeek+" we have "+classAtSchool+" classes.");
		
		
		
		
	}
	
}
