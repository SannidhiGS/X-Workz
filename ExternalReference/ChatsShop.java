class ChatsShop{
	public static void main(String chat[]){
	String pani="Panipuri";
	String gol="Golgappa";
	String masal="Masalapoori";
	String tikki="Tikki Poori";
	String khara="Khara Mandakki";
	String nipal="Nipat Masala";
	String bhel="Bhel Poori";
	String pot="Potato Twister";
	String gobi="Gobi Manchuri";
	String dahi="Dahi Poori";
	String chats[]={pani,gol,masal,tikki,khara,nipal,bhel,pot,gobi,dahi};
	
	System.out.println("The number of chats "+chats.length);
	//System.out.println(chats[0]+" "+chats[1]+" "+chats[2]+" "+chats[3]+" "+chats[4]+" "+chats[5]+" "+chats[6]+" "+chats[7]+" "+chats[8]+" "+chats[9]);
	for(String chatz:chats){
		System.out.println(chatz);
	}
	}
}