public class BillRunner{
	public static void main(String args[]){
		
		Bill firstBill=new Bill();
		
		firstBill.billId=1;
		firstBill.amount=200.00;
		firstBill.planType="Monthly";
		firstBill.billIssueDate="12/06/2025";
		firstBill.paymentMethod="Monthly";
		firstBill.billDueDate="18/06/2025";
		firstBill.isTaxInclusive=true;
		firstBill.isBillPaid=true;
		firstBill.isBillOverDue=true;
		
		System.out.println("Bill ID: "+firstBill.billId);
		System.out.println("Amount: "+firstBill.amount);
		System.out.println("Plan Type: "+firstBill.planType);
		System.out.println("Issue Date: "+firstBill.billIssueDate);
		System.out.println("Payment method: "+firstBill.paymentMethod);
		System.out.println("Is tx included:"+firstBill.isTaxInclusive);
		System.out.println("Is the bill paid "+firstBill.isBillPaid);
		System.out.println("The bill is over due: "+firstBill.isBillOverDue);
		
		Bill secondBill=new Bill();
		
		secondBill.billId=2;
		secondBill.amount=400.00;
		secondBill.planType="Quaterly";
		secondBill.billIssueDate="14/06/2025";
		secondBill.paymentMethod="online";
		secondBill.billDueDate="20/06/2025";
		secondBill.isTaxInclusive=false;
		secondBill.isBillPaid=true;
		secondBill.isBillOverDue=true;
		
		System.out.println("Bill Id :"+secondBill.billId);
		System.out.println("The amount: "+secondBill.amount);
		System.out.println("Plan Type: "+secondBill.planType);
		System.out.println("Issue Date:"+secondBill.billIssueDate);
		System.out.println("Payment method: "+secondBill.paymentMethod);
		System.out.println("is tax is paid :"+secondBill.isTaxInclusive);
		System.out.println("Is the bill paid :"+secondBill.isBillPaid);
		System.out.println("The bill is over :"+secondBill.isBillOverDue);
		
		Bill thirdBill=new Bill();
		
		thirdBill.billId=3;
		thirdBill.planType="yearly";
		thirdBill.amount=6000.00;
		thirdBill.paymentMethod="Offline";
		thirdBill.billIssueDate="15/06/2025";
		thirdBill.paymentMethod="online";
		thirdBill.isTaxInclusive=true;
		thirdBill.isBillPaid=true;
		thirdBill.isBillOverDue=true;
		
		System.out.println("Bill Id"+thirdBill.billId);
		System.out.println("The amont: "+thirdBill.amount);
		System.out.println("The plan type: "+thirdBill.paymentMethod);
		System.out.println("Issue date :"+thirdBill.billIssueDate);
		System.out.println("The payment method: "+thirdBill.paymentMethod);
		System.out.println("The tax is inclusive"+thirdBill.isTaxInclusive);
		System.out.println("the bill is paid "+thirdBill.isBillPaid);
		System.out.println("The bill is over "+thirdBill.isBillOverDue);
		
		Bill fourBill=new Bill();
		
		fourBill.billId=4;
		fourBill.planType="yearly";
		fourBill.amount=5669.00;
		fourBill.paymentMethod="online";
		fourBill.billIssueDate="15/06/2025";
		//fourBill.paymentMethod="online";
		fourBill.isTaxInclusive=true;
		fourBill.isBillPaid=true;
		fourBill.isBillOverDue=false;
		
		System.out.println("The bill id:"+fourBill.billId);
		System.out.println("the plan type :"+fourBill.planType);
		System.out.println("Issue date: "+fourBill.paymentMethod);
		System.out.println("The payment method: "+fourBill.billIssueDate);
		System.out.println("The tax is inclusive "+fourBill.paymentMethod);
		System.out.println("The bill is paid "+fourBill.isBillPaid);
		System.out.println("The bill is over "+fourBill.isBillOverDue);
		
		Bill fiveBill=new Bill();
		
		fiveBill.billId=5;
		fiveBill.planType="montly";
		fiveBill.amount=500.00;
		fiveBill.paymentMethod="offline";
		fiveBill.billIssueDate="17/06/2025";
		fiveBill.isTaxInclusive=true;
		fiveBill.isBillPaid=true;
		fiveBill.isBillOverDue=true;
		
		System.out.println("The bill ID:"+fiveBill.billId);
		System.out.println("the plan type "+fiveBill.planType);
		System.out.println("The issue date "+fiveBill.paymentMethod);
		System.out.println("The payment method "+fiveBill.billIssueDate);
		System.out.println("the tax inclusuve "+fiveBill.isTaxInclusive);
		System.out.println("The issue date"+fiveBill.billIssueDate);
		System.out.println("The bill is over "+fiveBill.isBillPaid);
		System.out.println("The bill is paid "+fiveBill.isBillOverDue);
		
		Bill sixBill=new Bill();
		
		sixBill.billId=6;
		sixBill.planType="Monthly";
		sixBill.amount=299.00;
		sixBill.paymentMethod="offline";
		sixBill.billIssueDate="12/06/2025";
		sixBill.isTaxInclusive=true;
		sixBill.isBillPaid=true;
		sixBill.isBillOverDue=true;
		
		System.out.println("The bill id "+sixBill.billId);
		System.out.println("the plan type "+sixBill.planType);
		System.out.println("The payment method "+sixBill.paymentMethod);
		System.out.println("The amount "+sixBill.amount);
		System.out.println("The tax inclusive"+sixBill.isTaxInclusive);
		System.out.println("The issue date "+sixBill.billIssueDate);
		System.out.println("The bill is paid "+sixBill.isBillPaid);
		System.out.println("The bill is over "+sixBill.isBillOverDue);
		
		Bill sevenBill=new Bill();
		
		sevenBill.billId=7;
		sevenBill.planType="3-month";
		sevenBill.amount=899;
		sevenBill.paymentMethod="offline";
		sevenBill.billIssueDate="12/2/2025";
		sevenBill.isTaxInclusive=true;
		sevenBill.isBillOverDue=true;
		sevenBill.isBillPaid=true;
		
		System.out.println("The bill id"+sevenBill.billId);
		System.out.println("the plan type "+sevenBill.planType);
		System.out.println("The payment method "+sevenBill.paymentMethod);
		System.out.println("The date of issue "+sevenBill.billIssueDate);
		System.out.println("The tax is inclusive "+sevenBill.isTaxInclusive);
		System.out.println("Amount"+sevenBill.amount);
		System.out.println("The bill is paid "+sevenBill.isBillPaid);
		System.out.println("the bill overdue "+sevenBill.isBillOverDue);
		
		Bill eightBill=new Bill();
		
		eightBill.billId=8;
		eightBill.planType="6-month";
		eightBill.amount=1299.89;
		eightBill.paymentMethod="online";
		eightBill.billIssueDate="15/06/2025";
		eightBill.isTaxInclusive=true;
		eightBill.isBillOverDue=true;
		eightBill.isBillPaid=false;
		
		System.out.println("The bill ID "+eightBill.billId);
		System.out.println("The plan type "+eightBill.planType);
		System.out.println("The payment method "+eightBill.paymentMethod);
		System.out.println("Amout "+eightBill.amount);
		System.out.println("The bill is paid "+eightBill.isBillOverDue);
		System.out.println("The bill is overdue "+eightBill.isBillPaid);
		System.out.println("Is the tax is inclusive: "+eightBill.isTaxInclusive);
		System.out.println("The issue date:"+eightBill.billIssueDate);
		
		Bill nineBill=new Bill();
		
		nineBill.billId=8;
		nineBill.planType="6-month";
		nineBill.amount=1299.89;
		nineBill.paymentMethod="online";
		nineBill.billIssueDate="15/06/2025";
		nineBill.isTaxInclusive=true;
		nineBill.isBillOverDue=true;
		nineBill.isBillPaid=false;
		
		System.out.println("The bill ID "+nineBill.billId);
		System.out.println("The plan type "+nineBill.planType);
		System.out.println("The payment method "+nineBill.paymentMethod);
		System.out.println("Amout "+nineBill.amount);
		System.out.println("The bill is paid "+nineBill.isBillOverDue);
		System.out.println("The bill is overdue "+nineBill.isBillPaid);
		System.out.println("Is the tax is inclusive: "+nineBill.isTaxInclusive);
		System.out.println("The issue date:"+nineBill.billIssueDate);
		
		Bill tenBill=new Bill();
		
		tenBill.billId=8;
		tenBill.planType="6-month";
		tenBill.amount=1299.89;
		tenBill.paymentMethod="online";
		tenBill.billIssueDate="15/06/2025";
		tenBill.isTaxInclusive=true;
		tenBill.isBillOverDue=true;
		tenBill.isBillPaid=false;
		
		System.out.println("The bill ID "+tenBill.billId);
		System.out.println("The plan type "+tenBill.planType);
		System.out.println("The payment method "+tenBill.paymentMethod);
		System.out.println("Amout "+tenBill.amount);
		System.out.println("The bill is paid "+tenBill.isBillOverDue);
		System.out.println("The bill is overdue "+tenBill.isBillPaid);
		System.out.println("Is the tax is inclusive: "+tenBill.isTaxInclusive);
		System.out.println("The issue date:"+tenBill.billIssueDate);
		
		Bill elevenBill=new Bill();
		
		elevenBill.billId=1;
		elevenBill.amount=200.00;
		elevenBill.planType="Monthly";
		elevenBill.billIssueDate="12/06/2025";
		elevenBill.paymentMethod="Monthly";
		elevenBill.billDueDate="18/06/2025";
		elevenBill.isTaxInclusive=true;
		elevenBill.isBillPaid=true;
		elevenBill.isBillOverDue=true;
		
		System.out.println("Bill ID: "+elevenBill.billId);
		System.out.println("Amount: "+elevenBill.amount);
		System.out.println("Plan Type: "+elevenBill.planType);
		System.out.println("Issue Date: "+elevenBill.billIssueDate);
		System.out.println("Payment method: "+elevenBill.paymentMethod);
		System.out.println("Is tx included:"+elevenBill.isTaxInclusive);
		System.out.println("Is the bill paid "+elevenBill.isBillPaid);
		System.out.println("The bill is over due: "+elevenBill.isBillOverDue);
		
		Bill twelveBill=new Bill();
		
		twelveBill.billId=2;
		twelveBill.amount=400.00;
		twelveBill.planType="Quaterly";
		twelveBill.billIssueDate="14/06/2025";
		twelveBill.paymentMethod="online";
		twelveBill.billDueDate="20/06/2025";
		twelveBill.isTaxInclusive=false;
		twelveBill.isBillPaid=true;
		twelveBill.isBillOverDue=true;
		
		System.out.println("Bill Id :"+twelveBill.billId);
		System.out.println("The amount: "+twelveBill.amount);
		System.out.println("Plan Type: "+twelveBill.planType);
		System.out.println("Issue Date:"+twelveBill.billIssueDate);
		System.out.println("Payment method: "+twelveBill.paymentMethod);
		System.out.println("is tax is paid :"+twelveBill.isTaxInclusive);
		System.out.println("Is the bill paid :"+twelveBill.isBillPaid);
		System.out.println("The bill is over :"+twelveBill.isBillOverDue);
		
		Bill thirteenBill=new Bill();
		
		thirteenBill.billId=3;
		thirteenBill.planType="yearly";
		thirteenBill.amount=6000.00;
		thirteenBill.paymentMethod="Offline";
		thirteenBill.billIssueDate="15/06/2025";
		thirteenBill.paymentMethod="online";
		thirteenBill.isTaxInclusive=true;
		thirteenBill.isBillPaid=true;
		thirteenBill.isBillOverDue=true;
		
		System.out.println("Bill Id"+thirteenBill.billId);
		System.out.println("The amont: "+thirteenBill.amount);
		System.out.println("The plan type: "+thirteenBill.paymentMethod);
		System.out.println("Issue date :"+thirteenBill.billIssueDate);
		System.out.println("The payment method: "+thirteenBill.paymentMethod);
		System.out.println("The tax is inclusive"+thirteenBill.isTaxInclusive);
		System.out.println("the bill is paid "+thirteenBill.isBillPaid);
		System.out.println("The bill is over "+thirteenBill.isBillOverDue);
		
		Bill fourteenBill=new Bill();
		
		fourteenBill.billId=4;
		fourteenBill.planType="yearly";
		fourteenBill.amount=5669.00;
		fourteenBill.paymentMethod="online";
		fourteenBill.billIssueDate="15/06/2025";
		//fourBill.paymentMethod="online";
		fourteenBill.isTaxInclusive=true;
		fourteenBill.isBillPaid=true;
		fourteenBill.isBillOverDue=false;
		
		System.out.println("The bill id:"+fourteenBill.billId);
		System.out.println("the plan type :"+fourteenBill.planType);
		System.out.println("Issue date: "+fourteenBill.paymentMethod);
		System.out.println("The payment method: "+fourteenBill.billIssueDate);
		System.out.println("The tax is inclusive "+fourteenBill.paymentMethod);
		System.out.println("The bill is paid "+fourteenBill.isBillPaid);
		System.out.println("The bill is over "+fourteenBill.isBillOverDue);
		
		Bill fifteenBill=new Bill();
		
		fifteenBill.billId=5;
		fifteenBill.planType="montly";
		fifteenBill.amount=500.00;
		fifteenBill.paymentMethod="offline";
		fifteenBill.billIssueDate="17/06/2025";
		fifteenBill.isTaxInclusive=true;
		fifteenBill.isBillPaid=true;
		fifteenBill.isBillOverDue=true;
		
		System.out.println("The bill ID:"+fifteenBill.billId);
		System.out.println("the plan type "+fifteenBill.planType);
		System.out.println("The issue date "+fifteenBill.paymentMethod);
		System.out.println("The payment method "+fifteenBill.billIssueDate);
		System.out.println("the tax inclusuve "+fifteenBill.isTaxInclusive);
		System.out.println("The issue date"+fifteenBill.billIssueDate);
		System.out.println("The bill is over "+fifteenBill.isBillPaid);
		System.out.println("The bill is paid "+fifteenBill.isBillOverDue);
		
		Bill sixteenBill=new Bill();
		
		sixteenBill.billId=6;
		sixteenBill.planType="Monthly";
		sixteenBill.amount=299.00;
		sixteenBill.paymentMethod="offline";
		sixteenBill.billIssueDate="12/06/2025";
		sixteenBill.isTaxInclusive=true;
		sixteenBill.isBillPaid=true;
		sixteenBill.isBillOverDue=true;
		
		System.out.println("The bill id "+sixteenBill.billId);
		System.out.println("the plan type "+sixteenBill.planType);
		System.out.println("The payment method "+sixteenBill.paymentMethod);
		System.out.println("The amount "+sixteenBill.amount);
		System.out.println("The tax inclusive"+sixteenBill.isTaxInclusive);
		System.out.println("The issue date "+sixteenBill.billIssueDate);
		System.out.println("The bill is paid "+sixteenBill.isBillPaid);
		System.out.println("The bill is over "+sixteenBill.isBillOverDue);
		
		Bill seventeenBill=new Bill();
		
		seventeenBill.billId=7;
		seventeenBill.planType="3-month";
		seventeenBill.amount=899;
		seventeenBill.paymentMethod="offline";
		seventeenBill.billIssueDate="12/2/2025";
		seventeenBill.isTaxInclusive=true;
		seventeenBill.isBillOverDue=true;
		seventeenBill.isBillPaid=true;
		
		System.out.println("The bill id"+seventeenBill.billId);
		System.out.println("the plan type "+seventeenBill.planType);
		System.out.println("The payment method "+seventeenBill.paymentMethod);
		System.out.println("The date of issue "+seventeenBill.billIssueDate);
		System.out.println("The tax is inclusive "+seventeenBill.isTaxInclusive);
		System.out.println("Amount"+seventeenBill.amount);
		System.out.println("The bill is paid "+seventeenBill.isBillPaid);
		System.out.println("the bill overdue "+seventeenBill.isBillOverDue);
		
		Bill eighteenBill=new Bill();
		
		eighteenBill.billId=8;
		eighteenBill.planType="6-month";
		eighteenBill.amount=1299.89;
		eighteenBill.paymentMethod="online";
		eighteenBill.billIssueDate="15/06/2025";
		eighteenBill.isTaxInclusive=true;
		eighteenBill.isBillOverDue=true;
		eighteenBill.isBillPaid=false;
		
		System.out.println("The bill ID "+eighteenBill.billId);
		System.out.println("The plan type "+eighteenBill.planType);
		System.out.println("The payment method "+eighteenBill.paymentMethod);
		System.out.println("Amout "+eighteenBill.amount);
		System.out.println("The bill is paid "+eighteenBill.isBillOverDue);
		System.out.println("The bill is overdue "+eighteenBill.isBillPaid);
		System.out.println("Is the tax is inclusive: "+eighteenBill.isTaxInclusive);
		System.out.println("The issue date:"+eighteenBill.billIssueDate);
		
		Bill ninteenBill=new Bill();
		
		ninteenBill.billId=8;
		ninteenBill.planType="6-month";
		ninteenBill.amount=1299.89;
		ninteenBill.paymentMethod="online";
		ninteenBill.billIssueDate="15/06/2025";
		ninteenBill.isTaxInclusive=true;
		ninteenBill.isBillOverDue=true;
		ninteenBill.isBillPaid=false;
		
		System.out.println("The bill ID "+ninteenBill.billId);
		System.out.println("The plan type "+ninteenBill.planType);
		System.out.println("The payment method "+ninteenBill.paymentMethod);
		System.out.println("Amout "+ninteenBill.amount);
		System.out.println("The bill is paid "+ninteenBill.isBillOverDue);
		System.out.println("The bill is overdue "+ninteenBill.isBillPaid);
		System.out.println("Is the tax is inclusive: "+ninteenBill.isTaxInclusive);
		System.out.println("The issue date:"+ninteenBill.billIssueDate);
		
		Bill twentyBill=new Bill();
		
		twentyBill.billId=8;
		twentyBill.planType="6-month";
		twentyBill.amount=1299.89;
		twentyBill.paymentMethod="online";
		twentyBill.billIssueDate="15/06/2025";
		twentyBill.isTaxInclusive=true;
		twentyBill.isBillOverDue=true;
		twentyBill.isBillPaid=false;
		
		System.out.println("The bill ID "+twentyBill.billId);
		System.out.println("The plan type "+twentyBill.planType);
		System.out.println("The payment method "+twentyBill.paymentMethod);
		System.out.println("Amout "+twentyBill.amount);
		System.out.println("The bill is paid "+twentyBill.isBillOverDue);
		System.out.println("The bill is overdue "+twentyBill.isBillPaid);
		System.out.println("Is the tax is inclusive: "+twentyBill.isTaxInclusive);
		System.out.println("The issue date:"+twentyBill.billIssueDate);
	}
}