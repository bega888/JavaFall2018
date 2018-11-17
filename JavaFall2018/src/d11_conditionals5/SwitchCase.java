package d11_conditionals5;

public class SwitchCase {      // only can handle "==", not others like "<=", ">=", "!=", "||", "&&"
	public static void main(String[] args) {   // "||"-instead we can use case2 before println.
		//1-Lobby, 2-Google, 3-Cybertek, 4-Apple
		int floor=3;
		switch (floor) {
		case 1:
			System.out.println("Lobby");
			break;
		case 2:
			System.out.println("Google");
			break;
		case 3:
			System.out.println("Cybertek");
			break;
		case 4:
			System.out.println("Apple");
			break;
		default:
			System.out.println("No Such floor");	
		}
		
		char grade='C';
		switch (grade) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Acceptable");
			break;
		case 'D':
			System.out.println("Poor");
			break;
		default:
			System.out.println("ERROR: Invalid grade");	
		}
				
		
		
		
		
		
		
	}

}
