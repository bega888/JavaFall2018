package j011_ClassStructure;

public class Arrays {
	public static void main(String[] args) {
		//array named number that can hold 3 ints
		int[] numbers=new int[3];
		numbers[0]=34;
		numbers[1]=23;
		numbers[2]=12;
		System.out.println(numbers[2]+numbers[1]);
		
		String[] CreditCards=new String[3];
		CreditCards[0]="Visa";
		CreditCards[1]="American Express";
		CreditCards[2]="Master Card";
		System.out.println(CreditCards[0]+", "+CreditCards[1]+", "+CreditCards[2]);
		
		String[] cuteAnimals=new String[10];
		cuteAnimals[0]="girafe"; 
		cuteAnimals[1]="crocodile";
		cuteAnimals[2]="puppy";
		cuteAnimals[3]="kitten";
		cuteAnimals[4]="duckling";
		cuteAnimals[5]="elephant";
		cuteAnimals[6]="pinguin";
		cuteAnimals[7]="panda";
		cuteAnimals[8]="cow";
		cuteAnimals[9]="donkey";
		System.out.println(cuteAnimals[0]);
	
	
	}

}
