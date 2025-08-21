class LaptopRunner{
	static String bName;
	static String processor;
	static String generation;
	public static void main(String args[]){
		System.out.println("The main started");
		System.out.println("The main ended");
		Laptop.laptop(bName,processor,generation);
	}
}