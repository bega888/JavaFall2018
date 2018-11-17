package d24_Arrays_Intro;

public class dPrintArrayValues {
	public static void main(String[] args) {
		
		String []cars= new String []{"Moskvich", "Audi", "Porsche", "BMW", "Toyota", "Cooper",
									"Honda", "Tesla", "Dodge", "Kia", "Acura", "Fiat", "Ferrari "};
		System.out.println(cars.length); //gives number of cars
		
		int i=0;
		System.out.println(cars[i]);  //moskvich
		i++;
		System.out.println(cars[i]);
		
		 
		
		System.out.println("------------FOR LOOP------------");
		
		for (i=0; i< cars.length; i++) {
			System.out.println(cars[i]);  //printing all the values in array
		}
		
		
		System.out.println("---------FOR EACH LOOP-----------------------");
		
		for(String car: cars) {             // "String car"-declaring variable : array
			System.out.println(car);
		}
	}

}
