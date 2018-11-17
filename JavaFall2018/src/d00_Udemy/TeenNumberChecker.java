package d00_Udemy;
public class TeenNumberChecker {
   
	public static int getDurationString(int minutes, int seconds){
		if(!(minutes>=0 && seconds>=0 && seconds<=59)) {
			System.out.println("Invalid value");
			return -1;
		}else {
			int h=minutes/60;
			int m=minutes%60 +(seconds/60);
			int s=seconds%60;
			System.out.println(h+" hours, "+m+" minutes and "+s+" seconds.");
			return 1;
		}
	}
	
	public static int getDurationString(int seconds){
		if(!(seconds>=0)) {
			System.out.println("Invalid value");
			return -1;
		}else {
			int s=seconds%60;
			int minutes=seconds/60;
			int m=minutes%60;
			int hours=m/60;
			int h=hours%24;
			int d=h/24;
				
			System.out.println(h+" hours, "+m+" minutes and "+s+" seconds.");
			return 1;
		}
	}
	
	public static void main(String[] args) {
		
		
		getDurationString(36002);	
	}
 
}