package com.xworkz.hospitalsystem.hospital;
import patient.Patient;

public class HospitalRunner {
    public static  void main(String args[]){
        Patient patient=new Patient();

        patient.setPatientId(1);
        patient.setPatientName("Steen");
        patient.setAge(21);
        patient.setGender("Male");
        patient.setDisease("Runny Nose");
        patient.setDoctorAssigned("Dr.Soorya");

        Hospital hospital=new Hospital();

        boolean details=hospital.getPatientData(patient);

        if(details==true){
            hospital.getPatientDetails();
        }
        else
            System.out.println("The user not registered");
    }
}





