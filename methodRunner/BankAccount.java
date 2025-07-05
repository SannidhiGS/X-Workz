class BankAccount{
	public static void credit(double cred,double balance){
		System.out.println("Credit started: ");
		//boolean var=cred>0.0;
		//if(var)
		if(cred>0.0){
		balance=balance+cred;
		System.out.println("The balance is :"+balance);
		}
		else{
		System.out.println("Amount will be greater than 0");
		}
		System.out.println("Credit ended: ");
	}
	
	public static void debit(double debt,double balance){
		System.out.println("Debit started: ");
		balance=balance-debt;
		System.out.println("The balance is :"+balance);
		System.out.println("Debit ended: ");
	}
}
	
		