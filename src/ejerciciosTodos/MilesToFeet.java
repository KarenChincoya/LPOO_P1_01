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
public class MilesToFeet {
    static final Double FEETS_IN_A_MILE = 5280.0;
    public static void calculate() {
        double distanceInMiles = 8.5;
        System.out.println("The distance to my uncle's house is "+ distanceInMiles +" miles or " + 8.5 * FEETS_IN_A_MILE +"feet. ");
    } 
}
