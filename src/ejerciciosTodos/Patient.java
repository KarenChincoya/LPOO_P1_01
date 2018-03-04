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
public class Patient {
    // Patient
  private Integer ID;
  private Integer age;
  private BloodData bd;
  public Patient(){
    this.ID = 0;
    this.age = 0;
    this.bd = new BloodData("O"," +");
  }
  //getters and setters
  public void setID(Integer ID){
    this.ID = ID;
  }
  public Integer getID(){
    return ID;
  }
  public void setAge(Integer age){
    this.age = age;
  }
  public Integer getAge(){
    return age;
  }
  public void setBloodData(String bloodType, String rhFactor){
      bd.setBloodType(bloodType);
      bd.setRhFactor(rhFactor);
  }

}
