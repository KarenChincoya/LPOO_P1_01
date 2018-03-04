/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4.programmingExercises;

import ejerciciosTodos.BirdSighting;
import ejerciciosTodos.BirdSighting2;
import java.util.Scanner;

/**
 *
 * @author Karen Velasco
 */
public class E3 {
    public static void main(String[] args){
            //to test
    BirdSighting b = new BirdSighting();
    System.out.println("Data:");
    System.out.println("Specie: "+b.getBirdSpeciesSighted());
    System.out.println("Number seen: "+b.getNumber());
    System.out.println("Current day of the year: "+b.getDayOfYear());
    
    //Segundo
    System.out.println("\n**************************************************\n");
    //to test
    Scanner input = new Scanner(System.in);
    String specie;
    Integer number;
    Integer dayOfYear;
    System.out.println("Input the data that is required: ");
    System.out.println("Specie: ");
    specie = input.nextLine();
    System.out.println("Number seen: ");
    number = input.nextInt();
    System.out.println("Number day of the year: ");
    dayOfYear = input.nextInt();
    BirdSighting2 b2 = new BirdSighting2( specie, number, dayOfYear );

    System.out.println("Data:");
    System.out.println("Specie: "+b2.getBirdSpeciesSighted());
    System.out.println("Number seen: "+b2.getNumber());
    System.out.println("Current day of the year: "+b2.getDayOfYear());
    
    }
}
