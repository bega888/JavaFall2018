package d32_MethodsWithReturn1;

public class VAbMethodsWithReturn {
	public static void main(String[] args) {
	giveme5$();	
	String president=getPresidentName();	
	System.out.println(president);	
		
		
	}
public static int giveme5$() {
	int amount=5;
	System.out.println(amount);
	return amount;
}
public static String getPresidentName()	{
	return "Trump";
}
	
	
	
}
