package j010_Recap;

public class Salary {
	int amount;
	int hours;
	boolean off;
	
	
	
	public void calculateWeeklySalary() {  //Void Method with no argument.
		int weeklySalary=amount*hours;
		System.out.println("Weekly salary is: $"+weeklySalary);		
	}
	
	public void calculateWeeklySalaryWithBonus(int bonus, String name) { //Void Method with two arguments.
		int weeklySalary=(amount*hours)+bonus;
		System.out.println(name+ "'s weekly salary with bonus is: $"+weeklySalary);		
	}
	//method that accepts overtime hours and return total weekly salary
	
	public int calculateWeeklyWithOvertime(int overtimeHours) {  //Non-Void
		int weeklySalary=amount*(hours+overtimeHours);
		return weeklySalary;
	}
	public int calculateWeeklySalaryWithoutTax(int taxAmount) {  //Non-Void
		int weeklySalaryTaxcut=amount*hours-taxAmount;
		return weeklySalaryTaxcut;
	}
	public String getSalaryInformation() {
		String amountHours=("Amount: "+amount+", Hours: "+hours);
		return amountHours;
	}
	
	
	
}
