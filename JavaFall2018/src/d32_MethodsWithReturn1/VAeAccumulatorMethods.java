package d32_MethodsWithReturn1;

public class VAeAccumulatorMethods {
	public static void main(String[] args) {
	
	//System.out.println(getStars(10));
	int[] nums= {1, 2, 3, 5, 6, 8, 4, 5, 6, 3, 5, 6};
	for(int n:nums) {
		System.out.println(getStars(n));
	}
	}

	public static String getStars(int count) {
		String stars="";
		for(int i=1; i<count; i++) {
			stars +="*";
		}return stars;
	}








}
