public class Account {
	private double balance; // saldo
	
	public Account(double initialBalance) {
		if (initialBalance > 0)
			balance = initialBalance;
	}

	public void credit(double amount) { // adiciona 'amount' ao saldo
		balance = balance + amount;	
	}

	public double getBalance() {
		return balance;
	}
}