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
public class Sandwich {
    private String mainIngredient;
    private String breadType;
    private Double price;
    
        public void setMainIngredient(String mainIngredient){
		this.mainIngredient = mainIngredient;
	}
	public String getMainIngredient(){
		return mainIngredient;
	}
        public void setBreadType(String breadType){
		this.breadType = breadType;
	}
	public String getBreadType(){
		return breadType;
	}
        public void setMainIngredient(Double price){
		this.price = price;
	}
	public Double getPrice(){
		return price;
        }
        public void setPrice(Double price){
            this.price = price;
        }
}
