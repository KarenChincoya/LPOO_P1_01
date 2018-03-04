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
public class E9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pounds, days,cost;
        System.out.println("What's the dog's weight (in pounds)? ");
        pounds = input.nextDouble();
        System.out.println("How many days will the dog board? ");
        days = input.nextDouble();
        cost = 0.5 * pounds * days;
        System.out.print("The total price for boarding is: " + cost +" dollars.\n");
    } 
}
