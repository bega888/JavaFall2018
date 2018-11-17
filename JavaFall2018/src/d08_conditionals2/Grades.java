package d08_conditionals2;

public class Grades {
	public static void main(String[] args) {
		/* A, B, C, D
		 * use char variable for grade
		 * if grade is A ->Excellent
		 * if grade is B ->Good
		 * if grade is C ->Acceptable
		 * if grade is D ->Poor, review all classes thoroughly 
		 */
		char grade='1';
		if (grade=='A') {
			System.out.println("Excellent");
		}else if(grade=='B'){
			System.out.println("Good");
		}else if(grade=='C'){
			System.out.println("Acceptable");
		}else if(grade=='D'){
			System.out.println("Poor, review all classes thoroughly");
		}else {
			System.out.println("Not a valid grade");
		}
		
		
		
	}

}
