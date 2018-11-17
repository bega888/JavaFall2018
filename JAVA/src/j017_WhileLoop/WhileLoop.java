package j017_WhileLoop;

public class WhileLoop {
public static void main(String[] args) throws InterruptedException {
	
	
	int i=1;
	while(i<=5) {
		System.out.print(i+", ");
		i++;
	}
	
	while(i>=0) {
		System.out.println(i+", ");
		Thread.sleep(500);
		i--;
	}

}
}
