package d18_Loops1_Intro;

public class WarmUpTask2 {
	public static void main(String[] args) {
		String garage="Toyota, Nissan, Honda, BMW, Mazerati, Ford";
		//INTERVIEW QUESTION: how do you find one string within another string?  Answer:  .contains method  ||  indexOf>-1
		
		String lowerCase=garage.toLowerCase();
		
		if(garage.isEmpty( ));{
			System.out.println("No cars in garage");
		}
		
		if(garage.contains("toyota") || garage.contains("nissan")) {
			System.out.println("There is a Japanese car in garage");
		}else {
			System.out.println("There is no Japanese cars");
		}
		
		
		if(garage.indexOf("bmw")>-1) {
			System.out.println("There is a German car in garage");
		}else {
			System.out.println("There is no German cars");
		}
		
		
		
		
		
		
		
	}

}
