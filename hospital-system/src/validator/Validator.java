package validator;

import patient.Patient;

public class Validator {

    Patient patient;

    public boolean getValidate(Patient patient){
        boolean isPatientId=false;
        if(patient.getPatientId()!=0 && patient.getPatientId()>0)
            isPatientId=true;
        else
            System.out.println("The patient id is not valid");

        boolean isPatientName=false;
        if(patient.getPatientName()!=null && !patient.getPatientName().isEmpty())
            isPatientName=true;
        else
            System.out.println("enter the valid patient name");
        boolean isPatientAge=false;
        if(patient.getAge()!=0 && patient.getAge()>0)
            isPatientAge=true;
        else
            System.out.println("Enter the valid age");
        boolean isPatientGender=false;
            if(patient.getGender()!=null && !patient.getGender().isEmpty())
                isPatientGender=true;
            else
                System.out.println("Enter the proper gender");
        boolean isPatientDisease=false;
        if(patient.getDisease()!=null && !patient.getDisease().isEmpty())
            isPatientDisease=true;
        else
            System.out.println("Provide the disease name");
        boolean isDoctorAssigned=false;
        if(patient.getDoctorAssigned()!=null && !patient.getDoctorAssigned().isEmpty())
            isDoctorAssigned=true;
        else
            System.out.println("No doctor assigned");

        boolean getValidate=false;
        if(isPatientId && isPatientName && isPatientAge && isPatientGender && isPatientDisease && isDoctorAssigned)
            getValidate=true;
        else
            System.out.println("The patient not validated");

    return getValidate;
    }
}
