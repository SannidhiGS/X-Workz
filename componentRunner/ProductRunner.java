class ProductRunner{
	static String Pname;
	static int Price;
	static String Rating;
	public static void main(String args[]){
		System.out.println("The main started");
		System.out.println("The main ended ");
		Product.product(Pname,Price,Rating);
	}
}