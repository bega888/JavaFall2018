package d41_Constructors_Encapsulation;

public class FacebookUser {
	
	String username, name, password;
	int age, numOfFriends;
	
	public FacebookUser(String username, String password) {
		this.username=username;
		this.password=password;
	}
	
	public FacebookUser(String name, String username, String password) {
		this.name=name;
		this.username=username;
		
		if (!password.contains(username)) {
			this.password=password;
		}else {
			System.out.println("Password can't contain username. Please"
					+ "change password");
		}
	
	}public boolean sendFriednRequest(FacebookUser targetUser) {
		if(targetUser.numOfFriends<5000) {
			System.out.println("Friend Request sent to "+targetUser.username);
			return true;
		}else {
			System.out.println("To this person sent friedn request can be done!");
			return false;
		}
	}public void userInfo() {
		System.out.println("Name: "+name);
		System.out.println("Username: "+this.username);
		System.out.println("Age: "+this.age);
		System.out.println("Number of friends: "+numOfFriends);
		
		
		
		
	}
}
	

