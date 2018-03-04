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
public class SammysRentalPrice {
    public static void calculatePrice() {
        int hours, minutes;
        Scanner input = new Scanner(System.in);
        System.out.println("You'll be asked the number of hours and minutes you rented a piece of sports equipment");
        System.out.println("Input the number of hours: ");
        hours = input.nextInt();
        System.out.println("Input the number of minutes: ");
        minutes = input.nextInt();
        Rent e = new Rent(hours, minutes);
        e.getMotto();
        e.getTotal();
    } 
}
