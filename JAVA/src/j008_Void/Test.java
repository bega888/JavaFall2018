package j008_Void;
import java.util.Scanner;
public class Test {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("1. What is the SDLC stands for?");
	System.out.println(" ");
	String a="a) System Driver Life Cycle.";
	String b="b) Software Driver Limits Circle.";
	String c="c) Software Development Lyfe Cycle.";
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	String answer=in.next(); 
	boolean bln=answer==c;
	System.out.println(bln+" the answer is "+c);
	
	
	
}
}
