class BankAccountRunner{
	public static void main(String args[]){
		System.out.println("The main started");
		
		double balance=1000.00;
		double cred;
		double debt;
		boolean check;
		
		BankAccount.credit(0.0,1000.0);
		
		BankAccount.debit(300.0,1000.0);
	}
}