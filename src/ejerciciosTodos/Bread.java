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
public class Bread {
    private String breadType;
	private Double calories;
	public Bread(String breadType, Double calories){
            this.breadType = breadType;
            this.calories = calories;
	}
	//get methods
	public String getBreadType(){
		return breadType;
	}
	public Double getCalories(){
		return calories;
	}
	public void Motto(){
		System.out.println("The staff of life.");
	}
}
