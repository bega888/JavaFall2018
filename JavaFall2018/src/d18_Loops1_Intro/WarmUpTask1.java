package d18_Loops1_Intro;

public class WarmUpTask1 {
	public static void main(String[] args) {
		// indexOf, substring
		String SMSmessage="Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";
		String sender, phoneNumber, message;
		
		int senderStart=SMSmessage.indexOf('<')+1;
		int senderEnd=SMSmessage.indexOf('>');
		sender=SMSmessage.substring(senderStart, senderEnd);
		
		int phoneNumberStart=SMSmessage.indexOf('[')+1;
		int phoneNumberEnd=SMSmessage.indexOf(']');
		phoneNumber=SMSmessage.substring(phoneNumberStart, phoneNumberEnd);
		
		int messageStart=SMSmessage.indexOf('{')+1;
		int messageEnd=SMSmessage.indexOf('}');
		message=SMSmessage.substring(messageStart, messageEnd);
		
		System.out.println(sender);
		System.out.println(phoneNumber);
		System.out.println(message);
		
		
		
		
	}

}
