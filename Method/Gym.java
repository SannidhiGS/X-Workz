class Gym{
	public static void main(String args[]){
		fitness("Herculus Fitness Center",100, true);
	}
	public static void fitness(String Name,int pricePerMonth, boolean isItWorth){
		System.out.println("Name of the gym center is: "+Name);
		System.out.println("The cost of the gym per month: "+pricePerMonth);
		System.out.println("Is the worth to doing gym"+isItWorth);
	}
}