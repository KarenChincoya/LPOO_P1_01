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
public class SandwichFilling {
    private String type;
	  private Double calories;
	  public SandwichFilling(String type, Double calories){
		  this.type = type;
		  this.calories = calories;
	  }
	  public String getType(){
		  return type;
	  }
	  public Double getCalories(){
		  return calories;
	  }
}
