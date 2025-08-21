class GardenRunner{
	static boolean isGardenClean;
	static int noOfTrees;
	static String pName;
	static double acres;
	static long noOfVisitor;
	static byte pHieght;
	static short mHieghtz;
	static char gSection;
	public static void main(String args[]){
		isGardenClean=Garden.cleanGarden();
		noOfTrees=Garden.tree();
		pName=Garden.name();
		acres=Garden.area();
		noOfVisitor=Garden.visit();
		pHieght=Garden.sHieght();
		mHieghtz=Garden.mHieght();
		gSection=Garden.section();
		System.out.println("The garden is clean "+isGardenClean);
		System.out.println("The number of trees "+noOfTrees);
		System.out.println("The name of the gaeden "+pName);
		System.out.println("The area of the garden "+acres);
		System.out.println("The number vistors "+noOfVisitor);
		System.out.println("The height of short plant "+pHieght);
		System.out.println("the hieght of the medium plant "+mHieghtz);
		System.out.println("the section of the garden "+gSection);
		
	}
}