package d08_conditionals2;

import java.util.Scanner;

public class WarmUpTasks {
	public static void main(String[] args) {
		/*write a program that asks a student what is their Batch number.
		 * if that is 10, say - we are classmates!
		 * if not, say something else
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("What is you batch number:");
		int batchNumber=input.nextInt();
		if(batchNumber==10) {
			System.out.println("We are classmates");
		}else {
			System.out.println("We are not classmates");
		}
		/*create a variable pincode and assign some number
		 * ask user to enter pincode, if it matches, say access granted
		 * if not, denied
		 */
		int pincode=4544;
		System.out.println("Enter your pincode:");
		int pincodeIn=input.nextInt();
		if(pincodeIn==pincode) {
			System.out.println("Access granted");
		}else {
			System.out.println("Access denied");
		}
		/*ask user to enter a number and check if it is odd or even.
		 * if even print "It is even number. else print it is odd number
		 */
		System.out.println("Enter a number");
		int number=input.nextInt();
		int evenOdd=number/2;
		if (evenOdd==0) {
			System.out.println("it is even number");
		}else {
			System.out.println("it is odd number");
		}
		
		
	}

}
