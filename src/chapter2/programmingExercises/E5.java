/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.programmingExercises;

import ejerciciosTodos.ProjectedSales;
import ejerciciosTodos.ProjectedSalesInteractive;

/**
 *
 * @author Karen Velasco
 */
public class E5 {
    public static void main(String[] args){
        ProjectedSales p = new ProjectedSales();
        p.calculate();
        System.out.println("\n*********************************\n");
        ProjectedSalesInteractive p2 = new ProjectedSalesInteractive();
        p2.calculate();
    }
}
