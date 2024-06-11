package modelo;

public class Account {

	private int number;
	public String holder;
	private double balance = 0.00;

	public Account(int number, String holder, double inDep) {
		this.number = number;
		this.holder = holder;
		deposit(inDep);
	}

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public int getNumber() {
		return this.number;
	}

	public String getHolder() {
		return this.holder;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double deposit(double value) {
		return balance += value;
	}

	public double withdraw(double value) {
		return balance = balance - value - 5.00;
	}

	public String toString() {
		return "Account " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
	}

}
