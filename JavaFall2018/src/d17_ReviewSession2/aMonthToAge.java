package d17_ReviewSession2;

public class aMonthToAge {
	public static void main(String[] args) {
		/*	0-4 neonate
		 * 	1-12 infant
		 * 	12-36 toddler
		 * 	36-60 pre-school child
		 * 	6-12  school age child
		 * 	13-18 adolescent
		 * 	19-40 young adult
		 * 	41-65 middle age adult
		 * 	65+ older adult
		 */
	
	int monthOld=1134;
	if(0>=monthOld && monthOld>=1) {
		System.out.println("you are neonate");
	}else if(1<monthOld && monthOld<=12) {
		System.out.println("you are infant");
	}else if(12<monthOld && monthOld<=36) {
		System.out.println("you are toddler");
	}else if(36<monthOld && monthOld<=60) {
		System.out.println("you are pre-school child");
	}else if(60<monthOld && monthOld<=144) {
		System.out.println("you are school age child");
	}else if(144<monthOld && monthOld<=144+72) { 
		System.out.println("you are school age child");
	}else {
		System.out.println("I am tired of calculating");
	}
		
		
		
		
		
		
		
	}

}
