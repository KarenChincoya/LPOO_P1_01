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
public class ArithmeticMethods {
    public static void calculate() {
        int x,y;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the first number: ");
        x = input.nextInt();
        System.out.println("Input the second number: ");
        y = input.nextInt();
        Number n1 = new Number(x);
        Number n2 = new Number(y);
        n1.displayNumberPlus10();
        n1.displayNumberPlus100();
        n1.displayNumberPlus1000();
        n2.displayNumberPlus10();
        n2.displayNumberPlus100();
        n2.displayNumberPlus1000();
    } 
}
