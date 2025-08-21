class HospitalRunner{
	public static void main(String hos[]){
	
		Doctor doctor=new Doctor(24,"D101");
		Department department=new Department("Doc12",25,doctor);
		
		Hospital hospital=new Hospital(20,"Apollo",25,department);
		
		department.doctor=doctor;
		
		hospital.getHospitalDetails();
	
	}
}