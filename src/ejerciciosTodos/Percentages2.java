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
public class Percentages2 {
    public static void calculate(){
        Double x;
        Double y;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the numbers: ");
        x = input.nextDouble();
        y = input.nextDouble();
        PercentageNumber2 n = new PercentageNumber2(x,y);
        n.computePercent(x,y);
    } 
}
