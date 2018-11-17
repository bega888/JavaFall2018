package d38_ReviewSession;

public class ILa_StringBuilder {
	public static void main(String[] args) {
		
		System.out.println("-----------IMMUTABLE---original value is not changable------cannot reverse-----");
		
		String s="James";
		System.out.println("location "+s.hashCode());   //original location
		System.out.println("Original value: "+s);
		
		s=s.substring(1,3);
		System.out.println("location "+s.hashCode());   //cannot change the value in original location, but creates a new location
		System.out.println("Substring value: "+s);
		
		
		
		System.out.println("-----------MUTABLE---original value is changeable------can reverse-----");
		
		StringBuilder sb=new StringBuilder("James");  
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.append(" Bond");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.reverse();
		sb.delete(2, 4);
		sb.insert(2, "Hello");
		System.out.println(sb);
		
		
		String s1="Adam";
		StringBuilder s2=new StringBuilder(s1);
		s2.reverse();
		s1=s2.toString();
		System.out.println(s1);
		
	}

}
