package d09_conditionals3;

public class RangeTests {
	public static void main(String [] args) {
		int students=20;
		
		if (5 < students && students < 30) {
			System.out.println("Let's do mentoring session");
		}else if(30 <= students && students < 60) {
			System.out.println("Let's do a lecture");
		}else if(students > 60) {
			System.out.println("How many students need to take class online");
		}else if (students < 5){
			System.out.println("Not enough students");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
