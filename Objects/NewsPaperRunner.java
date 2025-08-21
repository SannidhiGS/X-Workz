class NewsPaperRunner{
	
	public static void main(String args[]){
		System.out.println("The main started");
		
		NewsPaper paper1=new NewsPaper();
		
		System.out.println("The news paper id "+paper1.newsPaperId);
		System.out.println("The news paper company "+paper1.companyName);
		
		paper1.newsPaperId=1;
		paper1.companyName="Chalagara";
		
		System.out.println("The news paper id "+paper1.newsPaperId);
		System.out.println("The news paper company "+paper1.companyName);
		
	}
}