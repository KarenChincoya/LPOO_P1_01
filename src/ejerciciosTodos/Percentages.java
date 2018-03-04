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
public class Percentages {
    public static void calculate() {
        Double x;
        Double y;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the first number: ");
        x = input.nextDouble();
        System.out.println("Input the second number: ");
        y = input.nextDouble();
        PercentageNumber n = new PercentageNumber(x,y);
        n.computePercent(x,y);
    } 
}
