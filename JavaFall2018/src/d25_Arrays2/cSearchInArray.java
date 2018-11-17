package d25_Arrays2;

public class cSearchInArray {
	public static void main(String[] args) {
		
		int[] nums= {23, 45, 56, 100, 78, 89, 87, 65, 43, 56};
		int lookfor=100;
		
		
		boolean found=false;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]==lookfor) {
				System.out.println(lookfor+" was found at index"+i);
				found=true;
				break;
			}
		}
		
		if (found==false){
			System.out.println(lookfor+" not found");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
