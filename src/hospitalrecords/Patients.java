/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalrecords;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Arrays;

/**
 *
 * @author tony
 */
public class Patients {
 
    private String patientId;
    private String name;
    private String checkInDate;
    private String assignedMedicalPersonnel;
    
    public Patients (String patientId, String name, String checkInDate, 
        String assignedMedicalPersonnel){
        this.patientId = patientId;
        this.name = name;
        this.checkInDate = checkInDate;
        this.assignedMedicalPersonnel = assignedMedicalPersonnel;
    }// end of public Method HospitalRecords

        @Override
    public String toString(){
        return "Patients Details:\nPatientId: " + patientId + "\nPatients Name: " 
        + name + "\nPatients Check In Date: " + checkInDate + 
        "\nPatients Assigned Medical Personnel: " + assignedMedicalPersonnel; 
    }//end of String toString

    
    
    
    //ObtainRecords Method to access ListOfPatients
    public static void obtainRecords(){
     String path = "C:\\Users\\tony\\Documents\\NetBeansProjects"
        + "\\HospitalRecords\\src\\hospitalrecords\\ListOfPatients.txt";
        //Use path to the ListOfPatients.txt here
        LineNumberReader lr = null;        
        //allows to read information from the file line by line
        String[] oneRecord = new String[4];
        //an array to store info about one patient
        Patients patients;
        
        try {
        //using try-catch for exception handling to catch
        //possible errors with i/o operations
        FileReader inputStream = new FileReader(path);
        //FileReader reads the file’s contents
        lr = new LineNumberReader(inputStream);
        String str;
        while((str = lr.readLine())!= null) {
        //while the next line exists
        oneRecord = str.split(",");
        System.out.println(Arrays.toString(oneRecord)); 
        
        //dividing one file line by commas and assigning to array
        patients = new Patients(oneRecord[0], oneRecord[1],
        oneRecord[2], oneRecord[3]);
        patientsArrayList.add(patients);
    }//end of While loop
            
    }// end of try
       
        catch(IOException ioe){
        System.out.println("IOExcception occured");
    }//end of IOException
}//end of obtainRecords Method
    
}//end of Class Patients
 

