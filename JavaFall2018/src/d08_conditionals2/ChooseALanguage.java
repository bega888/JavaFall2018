package d08_conditionals2;

public class ChooseALanguage {
	public static void main(String[] args) {
	System.out.println("Please select: \n"+
										"English ->1 \n"+
										"Spanish ->2 \n"+
										"Turkish ->3 \n"+
										"Russian ->4 \n"+
										"Uygur ->5 \n"+
										"Uzbek ->6 \n"+
										"Kyrgyz ->7 \n"+
										"Tajik ->8");
		int language=1;
		String greeting = "";
		
		if(language==1) {
			greeting = "Hello, how are you?";
		}else if(language==2) {
			greeting = "Hola como estas?";
		}else if(language==3) {
			greeting = "Merhaba nasılsın?";
		}else if(language==4) {
			greeting = "Привет как дела?";
		}else if(language==5) {
			greeting = "Hello, how are you?";
		}else if(language==6) {
			greeting = "Salom qaleysan?";
		}else if(language==7) {
			greeting = "Салам Кандай�?ың?";
		}else if(language==8) {
			greeting = "Салом, шумо чӣ хел?";
		}else {
			System.out.println("I cannot speak that language");
		}
			
		System.out.println(greeting);
		 
		
		
		
		
		
	}

}
