/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.programmingExercises;

import java.util.Scanner;

/**
 *
 * @author Karen Velasco
 */
public class E11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit, celsius;
        System.out.println("What's the temperature in Fahrenheit? ");
        fahrenheit = input.nextDouble();
        celsius = (fahrenheit-32.0)/1.8;
        System.out.print("The temperature in celsius is: "+celsius+"\n");
    } 
}
