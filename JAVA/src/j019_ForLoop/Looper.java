package j019_ForLoop;

public class Looper {

	public void loopFromNumToNum(int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.print(i + " ");

		}
		System.out.println();
	}
	public int loopAndSum(int start, int end) {
		//return sum of all the numbers
		int total=0;
		for(int i=start; i<=end; i++) {
			total=total+i;
		}
		

		return total;
	}
}
