package d41_Constructors_Encapsulation;

public class FacebookUserObject {
	public static void main(String[] args) {
		
		FacebookUser user1=new FacebookUser("murat", "2015america");
		
		FacebookUser user2=new FacebookUser("merjen", "2019america");
		user2.age=32;
		user2.name="Merjen Setdarova";
		user2.numOfFriends=123;
		System.out.println(user2.name+" is "+user2.age+" years old and currently "
				+ "she has "+user2.numOfFriends+" facebook friends");
		
		//user2.sendFriednRequest("merjen");
		user2.userInfo();
		
		
	}

}


