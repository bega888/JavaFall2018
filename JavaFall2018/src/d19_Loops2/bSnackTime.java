package d19_Loops2;

public class bSnackTime {
	public static void main(String[] args) {
		boolean hungry=true;
		int apples=1;
		
		while(hungry) {
			System.out.println("Eating an apple");
				if(apples==5) {
				hungry=false;
				System.out.println("No more hungry");
			}
			apples++;
			
		}
		
		
		
	}

}
