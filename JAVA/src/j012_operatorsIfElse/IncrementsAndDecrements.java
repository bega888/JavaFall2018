package j012_operatorsIfElse;

public class IncrementsAndDecrements {
	public static void main(String[] args) {
		int ppl=3;
		System.out.println(ppl+"------Original Value");
		
		ppl++;     //increments by one
		++ppl;     //same as above, increments by one
		System.out.println(ppl+"------Pre Increment");
		
		int i=2;
		int j=3;
		int p=++i + ++j;  //both pre increment
		System.out.println(p); //3+4=7
		System.out.println(i); //3
		System.out.println(j); //4
		
		int k=3;
		int m=4;
		int t=k++ + m++;  //both post increment
		System.out.println(t); //3+4=7
		System.out.println(k); //4
		System.out.println(m); //5
		
		int x=4;
		int y=5;
		int z=++x + y++;  //pre and post increment
		System.out.println(z); //5+5=10
		System.out.println(x); //5
		System.out.println(y); //6
		
		//Decrements works the same way
		
		
		
		
		
		
	}

}
