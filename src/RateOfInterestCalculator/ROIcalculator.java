package RateOfInterestCalculator;

public class ROIcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1 = new Customer(20000,5);
		SBI account1 = new SBI(6.0, customer1);
		ICICI account2 = new ICICI(5.0,customer1);
		System.out.println("ROI with SBI" +account1.calROI());
		System.out.println(account1);
		System.out.println(account2);
		System.out.println("ROI with ICICI" +account2.calROI());
		System.out.println(account1.getCustomer1().getInvestment());
		

	}

}
