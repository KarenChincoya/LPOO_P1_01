/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4.programmingExercises;

import ejerciciosTodos.Bread;

/**
 *
 * @author Karen Velasco
 */
public class E5 {
    public static void main(String args[]){
    	Bread b1 = new Bread("rye", 45.0);
	Bread b2 = new Bread("Waffle", 150.0);
	Bread b3 = new Bread("Barrel", 90.0);
	System.out.println("Bread Type\tCalories");		
	System.out.println(b1.getBreadType()+"\t\t"+b1.getCalories());
	System.out.println(b2.getBreadType()+"\t\t"+b2.getCalories());
	System.out.println(b3.getBreadType()+"\t\t"+b3.getCalories());
  }
}
