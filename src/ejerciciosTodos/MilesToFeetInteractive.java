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
public class MilesToFeetInteractive {
     static final Double FEETS_IN_A_MILE = 5280.0;
    public static void calculate() {
        double distanceInMiles;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa la distancia entre tu casa y la de tu tio en millas: ");
        distanceInMiles = input.nextFloat();
        System.out.println("The distance to my uncle's house is "+ distanceInMiles +" miles or " + 8.5 * FEETS_IN_A_MILE +" feet. ");
    } 
}
