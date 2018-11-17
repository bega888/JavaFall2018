package j010_Recap;

public class Payroll {
public static void main(String[] args) {
	Salary MuratsSalary = new Salary();
	MuratsSalary.amount=55;
	MuratsSalary.hours=42;
	MuratsSalary.amount=65; // will change the original amount
	MuratsSalary.calculateWeeklySalary();
	
	Salary AltynbeksSalary = new Salary();
	AltynbeksSalary.amount=50;
	AltynbeksSalary.hours=40;
	AltynbeksSalary.calculateWeeklySalary();
	AltynbeksSalary.calculateWeeklySalaryWithBonus(800, "Altynbek");
	
	int totalWeeklySalary=AltynbeksSalary.calculateWeeklyWithOvertime(10);
	System.out.println("Weekly salary with overtime is: $"+totalWeeklySalary);

	Salary Omars$ = new Salary();
	Omars$.amount=85;
	Omars$.hours=40;
	
	int netWeeklySalary=MuratsSalary.calculateWeeklySalaryWithoutTax(850);
	System.out.println("Tax deducted net weekly salary is: $"+netWeeklySalary);

	String returnedSalaryInfo=Omars$.getSalaryInformation();
	System.out.println(returnedSalaryInfo.toUpperCase());
}



}
