package d29_MultiDimentional;

public class VAcCarsMultiDArray {
	public static void main(String[] args) {
		
		/*
		 * 1-japanese
		 * 2-german
		 * 3-american
		 * 4-italian
		 */
		
		String [][] cars= {	{"Toyota", "Lexus", "Honda", "Acura", "Mazda", "Nissan", "Subaru"}, 
							{"Audi", "Opel", "BMW", "Porsche", "VW", "Mercedes Bens"}, 
							{"Ford", "GMC", "Dodge", "Jeep", "Tesla", "Lincon", "Chevrolet"}, 
							{"Ferrari", "Fiat", "Maserati", "Lamborghini", "Alfa romeo"}};
		
		
		System.out.println("-----------FOR LOOP--------");
		
		for(int i=0; i<cars.length; i++) {
			/*switch(i) {
			case 0:
				System.out.println("Japanese:");
				break;
			case 1:
				System.out.println("German:");
				break;
			case 2:
				System.out.println("American:");
				break;
			case 3:
				System.out.println("Italian:");
				break;
			default:
				System.out.println("No Japanese, German, American or Italian cars");
			}*/
			
			for(int j=0; j<cars[i].length; j++) {
				
				System.out.print(cars[i][j]+"  ");
			}System.out.println();
		}
	
		
		
		System.out.println("-----------FOR EACH/ENHANSED LOOP--------");
		
		for(String[] carGrps:cars) {
			for(String car:carGrps) {
				
				System.out.print(car+"  ");
			}System.out.println();
		}
		
		
		
	}

}
