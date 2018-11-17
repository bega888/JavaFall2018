package d24_Arrays_Intro;

public class bArrayIntro {
	public static void main(String[] args) {
		
		char[] grades1= {'A', 'B', 'C', 'D', 'E'};		
		
		char[] grades2= new char[]{'A', 'B', 'C', 'D', 'E'};		
		
		char[] grades3= new char[5];		
		grades3[0]='A';
		grades3[1]='B';
		grades3[2]='C';
		grades3[3]='D';
		grades3[4]='E';
		
		char grades4[];
		grades4=new char[4];
		grades4[0]='A';
		grades4[1]='B';
		grades4[2]='C';
		
		
		System.out.println(grades1[1]+""+grades2[2]+""+grades3[3]);
		
		
	}

}
