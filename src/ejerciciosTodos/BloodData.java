/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosTodos;

/**
 *
 * @author Karen Velasco
 */
public class BloodData {
    //blood data
  private String bloodType;
  private String rhFactor;
  public BloodData(){
    this.bloodType = "O";
    this.rhFactor = "+";
  }
  public BloodData(String bloodType, String rhFactor){
    this.bloodType = bloodType;
    this.rhFactor = rhFactor;
  }
  //include getters and setters
  public void setBloodType(String bloodType){
    this.bloodType = bloodType;
  }
  public String getBloodType(){
    return bloodType;
  }
  public void setRhFactor(String rhFactor){
    this.rhFactor = rhFactor;
  }
  public String getRhFactor(){
    return rhFactor;
  }
  public void displayData(){
      System.out.println("Blood Type: "+bloodType);
      System.out.println("rhFactor: "+rhFactor);
  }
}
