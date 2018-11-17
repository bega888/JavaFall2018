package d27_Arrays4;

public class aArrayTasks {
	public static void main(String[] args) {
		String[] arr=new String[] {"apples", "banana", "kiwi", "cherries", "watermelon"};
		
		
		
		System.out.println("-----------FOR EACH LOOP-----------");
		
		for (String fruit:arr) {
			System.out.println(fruit.substring(0, 3));
		}
		
		
		
		
		System.out.println("-----------FOR LOOP----------");
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i].substring(0, 3));
		}
		
		
		
		
	}

}
 