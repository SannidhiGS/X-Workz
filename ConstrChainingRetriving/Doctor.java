class Doctor{

	int noOfDoctors;
	String doctorID;
	
	Doctor(int noOfDoctors,String doctorID){
		this.noOfDoctors=noOfDoctors;
		this.doctorID=doctorID;
	}
	
	public void getDoctorDetails(){
		
		System.out.println("No of doctors "+noOfDoctors);
		System.out.println("The doctor ID "+doctorID);
	}
}