package prob05;

public class Account {

	private String accountNo;
	private int balance;

	public Account(String string) {
		this.accountNo = string;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void save(int i) {
		this.balance += i; 
	}

	public void deposit(int i) {
		// TODO Auto-generated method stub
		this.balance -= i; 
	}

}
