package patient;

public class Patient {
    private int patientId;

    public void setPatientId(int patientId){
        this.patientId=patientId;
    }
    public int getPatientId(){
        return patientId;
    }


    private String patientName;

    public void  setPatientName(String patientName){
        this.patientName=patientName;
    }
    public String getPatientName(){
        return patientName;
    }

    private int age;
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    private String gender;

    public void setGender(String gender){
        this.gender=gender;
    }
    public String getGender(){
        return gender;
    }

    private String disease;

    public void setDisease(String disease){
        this.disease=disease;
    }
    public String getDisease(){
        return disease;
    }

    private String doctorAssigned;
    public void setDoctorAssigned(String doctorAssigned){
        this.doctorAssigned=doctorAssigned;
    }
    public String getDoctorAssigned(){
        return doctorAssigned;

    }


}
