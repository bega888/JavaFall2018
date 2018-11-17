package j012_operatorsIfElse;

public class Investment {
	public double calculateInvestmentValue(int amount, double rate, int years) {
		rate=rate/100;
		double interestAmount=amount*rate*years;
		double totalValue=interestAmount+amount;
		
		return totalValue;
		
		
	}
}
 