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
public class InchesToFeetInteractive {
    public static void calculate() {
        Scanner input = new Scanner(System.in);
        int inches;
        System.out.println("How many inches do you want to convert? ");
        inches = input.nextInt();
        System.out.println(inches + " inches becomes "+ (inches/12) + " feet and "+ (inches%12) + " inches");
    } 
}
