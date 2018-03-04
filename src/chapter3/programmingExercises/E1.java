/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.programmingExercises;

/**
 *
 * @author Karen Velasco
 */
public class E1 {
    public static void main(String[] args){
        System.out.println("1. Suppose that you have created a program with only the following variables: ");
        
        int v = 4; 
        int w = 6; 
        double x = 2.2;

        System.out.println("Suppose that you also have a method with the following header: public static void calculate(int x, double y) Which of the following method calls are legal? ");
        System.out.println("a. calculate(v, w);		Ilegal");
        System.out.println("b. calculate(v, x); 		Legal");
        System.out.println("c. calculate(x, y); 		Ilegal, y doesn't have a value");
        System.out.println("d. calculate(18, x); 		Legal");
        System.out.println("e. calculate(1.1, 2.2); 	Ilegal");
        System.out.println("f. calculate(5, 7); 		Ilegal ");
    }
}
