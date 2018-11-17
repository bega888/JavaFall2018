package d00_myNotes;

public class ConstructorSetGetObject {
	public static void main(String[] args) {
		
	
	ConstructorSetGet Object1=new ConstructorSetGet();
	ConstructorSetGet Object2=new ConstructorSetGet(5);
	ConstructorSetGet Object3=new ConstructorSetGet(5, 13);
	ConstructorSetGet Object4=new ConstructorSetGet(5, 13, 43);
	
	System.out.printf("%s\n", Object1.toMilitary());
	System.out.printf("%s\n", Object2.toMilitary());
	System.out.printf("%s\n", Object3.toMilitary());
	System.out.printf("%s\n", Object4.toMilitary());
	
	
	
	
	
	
	
	
	}
}