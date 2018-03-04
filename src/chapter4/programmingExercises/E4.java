/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4.programmingExercises;

import ejerciciosTodos.BloodData;
import ejerciciosTodos.Patient;
import java.util.Scanner;

/**
 *
 * @author Karen Velasco
 */
public class E4 {
    public static void main(String args[]){
        //test patient
      Patient p = new Patient();
      Integer ID;
      Integer age;
      BloodData bd = new BloodData();
      String bloodType;
      String rhFactor;
      
      Scanner input = new Scanner(System.in);

      System.out.println("Input the required data: ");
      System.out.print("ID: ");
      ID = input.nextInt();
      System.out.print("Age: ");
      age = input.nextInt();
      System.out.print("Blood Type: ");
      bloodType = input.next();
      System.out.print("Rh Factor: ");
      rhFactor = input.next();
      
      p.setID(ID);
      p.setAge(age);
      p.setBloodData(bloodType, rhFactor);

      bd.displayData();
        
      System.out.println("\n***************************************\n");
      //Test blood data  
      BloodData bd2 = new BloodData();
      String bloodType2;
      String rhFactor2;
      System.out.println("Input the required data: ");
      System.out.print("Blood type: ");
      bloodType2 = input.next();
      System.out.print("Rh Factor: ");
      rhFactor2 = input.next();
      bd2.setBloodType(bloodType2);
      bd2.setRhFactor(rhFactor2);
      System.out.println("Blood type: "+bd2.getBloodType());
      System.out.println("Rh Factor: "+bd2.getRhFactor());
      
      
  }
}
