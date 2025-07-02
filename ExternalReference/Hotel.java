public class Hotel{
	public static void main(String args[]){
		String dosa="Dosa";
		String edli="Edli";
		String shavige="Shavige";
		String vada="Vada";
		String pavbaji="Pavbaji";
		String noodles="Noodles";
		String ricebath="Ricebath";
		String pulav="Pulav";
		String pulivogre="Pulivogre";
		String upma="Upma";
		String lemonRice="LemonRice";
		String chapati="Chapati";
		String poori="Poori";
	
	String menus[]={dosa,edli,shavige,vada,pavbaji,noodles,ricebath,pulav,pulivogre,upma,lemonRice,chapati,poori};
	System.out.println("The number of items in the menu is "+menus.length);
	//System.out.println(menus[0]+" "+menus[1]+" "+menus[2]+" "+menus[3]+" "+menus[4]+" "+menus[5]+" "+menus[6]+" "+menus[7]+" "+menus[8]+" "+menus[9]+" "+menus[10]+" "+menus[11]+" "+menus[12]+" "+menus[13]+" "+menus[14]+" "+menus[15]+" "+menus[16]+" "+menus[17]+" "+menus[18]+" "+menus[19]+" "+menus[20]+" "+menus[21]+" "+menus[22]+" "+menus[23]+" "+menus[24]);
		for(String menu:menus){
			System.out.println(menu);
		}
	}
}