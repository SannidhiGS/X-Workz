class BankAccount{
	public static boolean credit(double cred,double balance){
		System.out.println("Credit started: ");
		//boolean var=cred>0.0;
		//if(var)
		boolean check=cred>0.0;
		if(check){
		balance=balance+cred;
		System.out.println("The balance is :"+balance);
		}
		else{
		System.out.println("Amount will be greater than 0");
		}
		System.out.println("Credit ended: ");
		return check;
	}
	
	
	public static double debit(double debt,double balance){
		System.out.println("Debit started: ");
	    boolean check=debt<balance;
		if(check){
		balance=balance-debt;
		System.out.println("The balance is :"+balance);
		}
		else{
			System.out.println("The balance is not sufficient to debit");
		}
		System.out.println("Debit ended: ");
		return balance;
	}
}
	
		