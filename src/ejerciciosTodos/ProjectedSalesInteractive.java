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
public class ProjectedSalesInteractive {
    static final double INCREMENT = 0.10;
    public static void calculate() {
        double salesNorth, salesSouth;
        Scanner input = new Scanner(System.in);
        System.out.print("Input the North division's sales of this year: ");
        salesNorth = input.nextFloat();
        System.out.print("Input the South division's sales of this year: ");
        salesSouth = input.nextFloat();
        System.out.println("The next year’s projected sales for North Division is " + (salesNorth*(1.0+INCREMENT)) +" dollars");
        System.out.println("The next year’s projected sales for South Division is " + (salesSouth*(1.0+INCREMENT)) +" dollars");
    } 
}
