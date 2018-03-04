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
public class BirdSighting {
    //data field
  private String birdSpeciesSighted;
  private Integer number;
  private Integer dayOfYear;
  public BirdSighting(){
    this.birdSpeciesSighted = "robin";
    this.number = 1;
    this.dayOfYear = 1;
  }
  public String getBirdSpeciesSighted(){
    return birdSpeciesSighted;
  }
  public Integer getNumber(){
    return number;
  }
  public Integer getDayOfYear(){
    return dayOfYear;
  }
     
}
