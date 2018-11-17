package d31_MethodsPractice;

public class ILaArraysCarBrand {
	public static void main(String[] args) {
		
		String[] carBrands={"mercedes", "bmw", "toyota", "ferrari"};
		for(int i=0; i<carBrands.length; i++) {
		
			if(carBrands[i]=="mercedes") {
				System.out.println("mercedes: Luxury and Comfort");
			}else if(carBrands[i]=="bmw") {
				System.out.println("bmw: Luxury and Sport");
			}else if(carBrands[i]=="toyota") {
				System.out.println("toyota: reliable and cheap");
			}else if(carBrands[i]=="ferrari") {
				System.out.println("ferrrari: super car and super expensive");
			}else {
				System.out.println("");
			}
		}
		
		
		
		
		
		
	}

}
