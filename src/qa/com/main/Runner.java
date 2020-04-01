package qa.com.main;

public class Runner {
	public static void main(String[] args) {
		
		TaxesCalc cal = new TaxesCalc();
		
		int x = 40000;
		
		System.out.println(cal.taxBracketCalculator(x) + cal.taxedSalary(x));
	}
}