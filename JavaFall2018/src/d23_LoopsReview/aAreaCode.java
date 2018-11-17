package d23_LoopsReview;

import java.util.Scanner;

public class aAreaCode {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your phone number:");

		String phoneNum = input.next();
		String areaCode = "";
		String state = "";
		if (phoneNum.startsWith("(")) {
			areaCode = phoneNum.substring(1, 4);
		} else {
			areaCode = phoneNum.substring(0, 3);
		}
		System.out.println(areaCode);

		switch (areaCode) {
		case "202":
			state = "Washington DC";
			break;
		case "703":
			state = "Virginia";
			break;
		case "209":
			state = "California";
			break;
		case "312":
			state = "Illinois";
			break;
		case "347":
			state = "New York";
			break;
		default:
			System.out.println("That State is not in out database");
		}
		System.out.println(state);
	}

}
