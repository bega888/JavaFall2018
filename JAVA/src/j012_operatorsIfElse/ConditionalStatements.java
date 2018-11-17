package j012_operatorsIfElse;
import java.util.Scanner;
public class ConditionalStatements {
public static void main(String[] args) {
	
	int apples=17;
	int bananas=18;
		if(bananas>apples) {
		System.out.println("We have more bananas than apples");}
	
	int ppl=15;
	int capasity=15;
		if(capasity>=ppl) {
		System.out.println("Everyone welcome");}
		if(capasity<=ppl) {
		System.out.println("Some of you need to kindly get out");}
		
	String lan="Java";
	if(lan.equals("java")) {
		System.out.println("Good job!");
	}else {
		System.out.println("You better code in Java!");
	}
	
Scanner intake=new Scanner(System.in);
System.out.println("Enter your age:");
int age=intake.nextInt();
if(age>=18) {
	System.out.println("You are eligible to vote");
	}else {
		System.out.println("Sorry, you are not eligible to vote");
	}

	
	
}
}
