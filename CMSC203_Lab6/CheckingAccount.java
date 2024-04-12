
public class CheckingAccount extends BankAccount {

	private final static double FEE = 0.15; //fee cost for clearing one check
	
	public CheckingAccount(String name, double initialAmount) {
		
		super(name, initialAmount);
		setAccountNumber(getAccountNumber() + "-10"); //initializes account number to their current account number  and links it with -10
	}
	
	@Override
	public boolean withdraw(double amount) {
		
		boolean completed = true;

		if (amount <= super.getBalance())
		{
			double amountFee = amount + FEE; //adds the fee to the amount being withdrawn
			return super.withdraw(amountFee); //returns the amount with the fee
		}
		else
		{
			completed = false;
		}
		return completed;
	}
	
}
