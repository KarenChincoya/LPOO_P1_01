/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4.programmingExercises;

import ejerciciosTodos.Circle;

/**
 *
 * @author Karen Velasco
 */
public class E6 {
    public static void main(String[] args){
	Circle c1 = new Circle();
	Circle c2 = new Circle();
	Circle c3 = new Circle();
	c1.setRadius(0.5);
	c2.setRadius(805.63);
	System.out.println("Circle 1 data: ");
        c1.displayData();
	System.out.println("Circle 2 data: ");
        c2.displayData();
        System.out.println("Circle 3 data: ");
        c3.displayData();
    }
}
