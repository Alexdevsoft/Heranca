package entities;

public class SanvingsAccount extends Account {

	private Double interestRate;
	
	public SanvingsAccount() {
		super();
	}

	public SanvingsAccount(Integer number, String holder, Double balace, Double interestRate) {
		super(number, holder, balace);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalace() {
		balace += balace * interestRate;
	}
	
}
