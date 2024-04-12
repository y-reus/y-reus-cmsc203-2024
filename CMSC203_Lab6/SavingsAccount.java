
public class SavingsAccount extends BankAccount {

	private final static double rate = 0.025; // annual interest rate
	private int savingsNumber = 0;
	private String accountNumber;

	public SavingsAccount(String name, double initialBalance) {

		super(name, initialBalance);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber; // initializes accountNumber from superclass and
																		// links with savings number
	}

	public void postInterest() {

		double oneMonthInterest = (getBalance() * rate) / 12.0; // gets balance then multiplies by annual rate then
																// divides by 12
		deposit(oneMonthInterest); // deposits the one months interest into account
	}

	@Override
	public String getAccountNumber() {

		return accountNumber;
	}

	public SavingsAccount(SavingsAccount originalSavings, double initialBalance) {

		super(originalSavings, initialBalance);
		savingsNumber = originalSavings.savingsNumber + 1; // adds 1 to the original savings number
		accountNumber = super.getAccountNumber() + "-" + savingsNumber; // initializes accountNumber from superclass and
																		// links with savings number of the new savings
																		// number account
	}

}
