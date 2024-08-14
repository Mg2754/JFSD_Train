package hands_on;

class BankAccount{
	int amount;
	int balance;
	
	BankAccount(int amount,int balance){
		this.balance = balance;
		this.amount = amount;
		
	}
	
	
	void deposit(int Amount) {
		balance  += amount;
		System.out.println(amount + "Deposited to your account!");
		System.out.println("Your Current Balance : "+balance);
	}
	void withdraw(int Amount) {
		balance  -= amount;
		System.out.println(amount + "Amount withdrawed from your account!");
		System.out.println("Your Current Balance : "+balance);
	}
}
class SavingsAccount extends BankAccount{
	SavingsAccount(int amount, int balance) {
		super(amount, balance);
		// TODO Auto-generated constructor stub
	}

	void widthdraw(int amount) {
		System.out.println("Your Account Balance Is too low. Please Deposit Money ");
	}
	
}

public class Q6 {
	public static void main(String args[]) {
		int amount = 200;
		int balance = 10;
		int width = 400;
		int depo = 1000;
		
		SavingsAccount saveacc = new SavingsAccount(amount,balance);
		BankAccount acc = new BankAccount(amount,balance);
		
		if(balance < 100) {
			saveacc.widthdraw(width);
		}
		else {
			acc.deposit(depo);
			acc.withdraw(width);
		}
		
	}

}
