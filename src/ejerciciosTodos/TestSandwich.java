/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosTodos;

import java.util.Scanner;

/**
 *
 * @author Karen Velasco
 */
public class TestSandwich {
    public static void prepare() {
        String mainIngredient, breadType;
        Double price;
        Scanner input = new Scanner(System.in);
        Sandwich mySandwich = new Sandwich();
        System.out.println("Input the main ingredient: ");
	mainIngredient = input.nextLine();
        System.out.println("Input the bread type: ");
	breadType = input.nextLine();
        System.out.println("Input the price: ");
	price = input.nextDouble();
        mySandwich.setMainIngredient(mainIngredient);
        mySandwich.setBreadType(breadType);
        mySandwich.setPrice(price);
        System.out.println("The sandwich was prepared with: ");
        System.out.println("Bread type: "+mySandwich.getBreadType());
        System.out.println("Main Ingredient: "+mySandwich.getMainIngredient());
        System.out.println("Price: "+mySandwich.getPrice());
     }   
}
