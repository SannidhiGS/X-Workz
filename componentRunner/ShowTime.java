class ShowTime{
	public static void shows(int durationz,int interval){
		System.out.println("The movie show time"+" "+durationz+" "+"hours");
		System.out.println("The movie interval time"+interval+"mins");
		int amount=150;
		int seatNo=30;
		Ticket.ticks(amount,seatNo);
	}
}