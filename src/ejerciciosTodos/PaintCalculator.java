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
public class PaintCalculator {
    public static void calculate() {
        Integer x0;
        Integer x1;
        Integer x2;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the length: ");
        x0 = input.nextInt();
        System.out.println("Input the width: ");
        x1 = input.nextInt();
        System.out.println("Input the wheight: ");
        x2 = input.nextInt();
        Paint p = new Paint(x0, x1, x2);
        p.wallArea();
    } 
}
