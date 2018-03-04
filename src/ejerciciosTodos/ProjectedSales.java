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
public class ProjectedSales {
    static final double INCREMENT = 0.10;
    public static void calculate() {
        double salesNorth=4000, salesSouth=5500;
        System.out.println("The next year’s projected sales for North Division is " + (salesNorth*(1.0+INCREMENT)) +" dollars");
        System.out.println("The next year’s projected sales for South Division is " + (salesSouth*(1.0+INCREMENT)) +" dollars");
    } 
}
