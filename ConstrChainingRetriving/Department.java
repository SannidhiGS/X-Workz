class Department{
	
	String departmentID;
	int noOfDepartments;
	
	Doctor doctor;
	
	Department(String departmentID,int noOfDepartments,Doctor doctor){
		this.departmentID=departmentID;
		this.noOfDepartments=noOfDepartments;
		
		this.doctor=doctor;
	}
	
	public void getDepartmentDetails(){
		System.out.println("The department id: "+departmentID);
		System.out.println("The no of departments: "+noOfDepartments);
		
		this.doctor.getDoctorDetails();
	
	}
}