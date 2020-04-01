package qa.com.main;

public class TaxesCalc {
	
	public String taxBracketCalculator(int salary) {
		
		if (salary < 15000) {
			return "you are paying 0% Taxes: ";
		}
		
		if (salary <= 19999) {
			return "you are paying 10% Taxes: ";
		}
		
		if (salary <= 29999) {
			return "you are paying 15% Taxes: ";
		}
		
		if (salary <= 44999) {
			return "you are paying 20% Taxes: ";
		}
		
		else {
			return "you are paying 25% Taxes: ";
		}
	}
	
	public String taxedSalary(int salary) {
		
		if (salary < 15000) {
			return "0";
		}
		
		if (salary <= 19999) {
			return "$" + (salary * 0.1);
		}
		
		if (salary <= 29999) {
			return "$" + (salary * 0.15);
		}
		
		if (salary <= 44999) {
			return "$" + (salary * 0.2);
		}
		
		else {
			return "$" + (salary * 0.25);
		}
	}
}
