package j008_Void;
import java.util.Scanner;

public class Sum {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter three numbers:");
	int num1=in.nextInt();
	int num2=in.nextInt();
	int num3=in.nextInt();
	int total=num1+num2+num3;
	System.out.println("What do you think is the sum?");
	int num4=in.nextInt();
	boolean result=num4==total;
	System.out.println(result+", sum is "+total);
	
	
}
}
