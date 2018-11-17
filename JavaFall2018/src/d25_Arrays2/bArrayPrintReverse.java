package d25_Arrays2;

public class bArrayPrintReverse {
	public static void main(String[] args) {
		
		int[] points={23, 12, 67, 45, 78, 89, 92, 99, 57, 87};  //new int [] - before {} is optional
		//-------------------------
		if(points.length==10) {
			System.out.println("10 points found");
		}else {
			System.out.println("We need 10 points");
		}
		//-----------------------------------------
		for(int i=points.length-1; i>=0; i--) {
		System.out.print(points[i]+" ");
		}
		
		System.out.println("\n-------------while loop------------");
		
		int idx=points.length-1;
		while(idx>=0) {
			System.out.print(points[idx]+" ");
			idx--;
		}
		
		
		
		
	}

}
