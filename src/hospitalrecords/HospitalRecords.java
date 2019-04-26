/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalrecords;

import java.util.ArrayList;

/**
 *
 * @author tony
 */
public class HospitalRecords {
   
    public static ArrayList<Patients> objectList = new ArrayList();
    
    public static void main(String[] args){
   
    Patients patient1 = new Patients("0143309293", "New Zealand: 8 Classic Tales of Aotearoa", "Peter Gossage", "2016");
    Patients patient2 = new Patients("9781869503499", "Legends of Aotearoa", "Chris Winitana", "2001");
    Patients patient3 = new Patients("0947506268", "Apple steve Jobs", "Robyn Kahukiwa", "2017");
    Patients patient4 = new Patients("0143309293", "IBM the early years: 8 Classic Tales of Aotearoa", "Peter Gossage", "2016");
    Patients patient5 = new Patients("9781869503499", "Legends of Aotearoa", "Chris Winitana", "2001");
    Patients patient6 = new Patients("0947506268", "Computers of the 90s", "Robyn Kahukiwa", "2017");
          
    objectList.add(patient1);
    objectList.add(patient2);
    objectList.add(patient3);
    objectList.add(patient4);
    objectList.add(patient5);
    objectList.add(patient6);

    printList(objectList);
        
    }//end of main String Method
    
    public static void printList(ArrayList list){
        for (Object o: list){
            System.out.println(o + "\n");
        }//end of for loop
        
       
 }//end of Method printList
  
}// end of Class HospitalRecords 
    
      