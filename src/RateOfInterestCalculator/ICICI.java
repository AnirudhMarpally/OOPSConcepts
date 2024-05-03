package RateOfInterestCalculator;

public class ICICI implements Bank {
	private double rateOfInterest;
	private Customer customer1;
	public double getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public Customer getCustomer1() {
		return customer1;	
	}
	public void setCustomer1(Customer customer1) {
		this.customer1 = customer1;
	}
	public ICICI(double rateOfInterest, Customer customer1) {
		super();
		this.rateOfInterest = rateOfInterest;
		this.customer1 = customer1;
	}
	public ICICI() {
		super();
	}
	@Override
	public double calROI() {
		// TODO Auto-generated method stub
		return (customer1.getInvestment() * customer1.getTenure() * rateOfInterest)/100;
	}
	@Override
	public String toString() {
		return "ICICI [rateOfInterest=" + rateOfInterest + ", customer1=" + customer1 + ", calROI()=" + calROI() + "]";
	}
	

}
