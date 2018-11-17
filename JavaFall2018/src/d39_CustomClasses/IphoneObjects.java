package d39_CustomClasses;

import java.util.ArrayList;
import java.util.List;

public class IphoneObjects {
	public static void main(String[] args) {
		
		Iphone esensPhone=new Iphone();
		esensPhone.model="Iphone 8 Plus";
		esensPhone.memory=64;
		esensPhone.color="Silver";
		
		Iphone kamilsPhone=new Iphone();
		kamilsPhone.model="Iphone Xs Max";
		kamilsPhone.memory=128;
		kamilsPhone.color="Gold";
		
//		esensPhone.color=kamilsPhone.color;
//		System.out.println(esensPhone.color);
		
		esensPhone.printPhoneInfo();
		kamilsPhone.printPhoneInfo();
		
		List<Iphone> phones=new ArrayList<>();
		phones.add(esensPhone);
		phones.add(kamilsPhone);
		
		for(Iphone i:phones ) {
			System.out.println(i.model);
		}
	}
	
}
