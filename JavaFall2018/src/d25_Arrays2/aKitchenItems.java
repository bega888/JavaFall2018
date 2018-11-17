package d25_Arrays2;

public class aKitchenItems {
public static void main(String[] args) {
	
	String [] kitchenItems= {"knife", "wooden Spoons  ", "plates", "cups", "forks", "pan", "pot", 
						"trash can", "fridge", "dishwasher"};
	
	for (String  items : kitchenItems) {
		switch(items.toLowerCase().trim()) {
		case "knife": 
			System.out.println("Knife is used for cutting veggies.");
			break;
		case "wooden spoons":
			System.out.println("Wooden spoons are used for teflon.");
			break;
		case "plates":
			System.out.println("Plates are used to put the food");
			break;
		case "cups":
			System.out.println("Cups are used to put drinks");
			break;
		case "forks":
			System.out.println("Forks are used to eat food");
			break;
		case "pan":
			System.out.println("Pan is used for cooking");
			break;
		case "pot":
			System.out.println("Pot is user for (I don't know)");
			break;
		case "trash can":
			System.out.println("Trash can is used to put trashes");
			break;
		case "fridge":
			System.out.println("Fridge is used to store food");
			break;
		case "dishwasher":
			System.out.println("Dishwasher is used to wash dishes");
			break;
		}
	}
	
	
	
	
	
	
	
}
}
