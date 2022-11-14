package entities;

public class Account {
	
	private Integer number;
	private String holder;
	protected Double balace;
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balace) {
		this.number = number;
		this.holder = holder;
		this.balace = balace;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalace() {
		return balace;
	}
	
	public void withdraw(double amount) {
		balace -= amount;
	}
	
	public void deposit(double amount) {
		balace += amount;
	}
	
	

}
