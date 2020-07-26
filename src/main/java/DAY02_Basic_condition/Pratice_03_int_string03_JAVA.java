package DAY02_Basic_condition;

public class Pratice_03_int_string03_JAVA {
	
	public static void main(String[] args) {
		
	String preRequisite="Manual testing";
		int age = 27;
		
		
		if (age>=25 && preRequisite.equals("Manual testing")) {
			
			System.out.println("you are eligible to take this class, if you know " +preRequisite  );}
		
		else if (age>= 25 && preRequisite.equals("English")) {
			
			System.out.println("you are eligible to take this class2, if you know " +preRequisite );
			
		}
			 else {
			System.out.println("You are not eligible to take this class, if you know " +preRequisite);}
	}
	}
