class HospitalRunner{
	public static void main(String args[]){
	
	String patientName="Roza";
	int age=24;
	long phNo=8976890945L;
	String email="rozaroza@gmail.com";
	String disease="Cold";
	Hospital.checkUp(patientName,age,phNo,email,disease);
	System.out.println(patientName);
	System.out.println(age);
	System.out.println(phNo);
	System.out.println(email);
	System.out.println(disease);
	}
}