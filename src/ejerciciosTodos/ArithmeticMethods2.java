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
public class ArithmeticMethods2 {
    public static void calculate(){
        int x,y;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the first number: ");
        x = input.nextInt();
        System.out.println("Input the second number: ");
        y = input.nextInt();
        TwoNumbers n = new TwoNumbers(x,y);
        n.displayNumberPlus10(x,y);
        n.displayNumberPlus100(x,y);
        n.displayNumberPlus1000(x,y);
    } 
}
