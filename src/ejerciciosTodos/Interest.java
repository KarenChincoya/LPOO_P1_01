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
public class Interest {
    public static void calculate() {
        Double starting, ganancia;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the starting value of the investment: ");
	starting = input.nextDouble();
	YearInterest y = new YearInterest(starting);
        y.principal();
     }
}
