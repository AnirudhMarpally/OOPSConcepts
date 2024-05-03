package RateOfInterestCalculator;

public class Customer {
	private int investment;
	private int tenure;
	public long getInvestment() {
		return investment;
	}
	public void setInvestment(int investment) {
		this.investment = investment;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(byte tenure) {
		this.tenure = tenure;
	}
	public Customer(int investment, int tenure) {
		super();
		this.investment = investment;
		this.tenure = tenure;
	}
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Customer [investment=" + investment + ", tenure=" + tenure + "]";
	}
	

}
