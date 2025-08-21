class Hospital{
	public static void checkUp(String patientName,int age,long phNo,String email,String disease){
		System.out.println("started with the checkup");
		System.out.println("Checkup is done...");
		Doctor.treatment(patientName,age,disease);
	}
}
