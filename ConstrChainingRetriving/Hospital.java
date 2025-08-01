class Hospital{
	
	int hospitalID;
	String hospitalName;
	int noOfDoctors;
	
	Department department;
	
	Hospital(int hospitalID,String hospitalName,int noOfDoctors,Department department){
		this.hospitalID=hospitalID;
		this.hospitalName=hospitalName;
		this.noOfDoctors=noOfDoctors;
		this.department=department;
	}
	
	public void getHospitalDetails(){
		System.out.println("The hospitalID "+hospitalID);
		System.out.println("The hospital name "+hospitalName);
		System.out.println("The no of doctors "+noOfDoctors);
		
		this.department.getDepartmentDetails();
	}
	

}