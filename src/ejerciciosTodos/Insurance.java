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
public class Insurance {
    public static void calculate() {
        Integer current;
        Integer birth;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the current year: ");
        current = input.nextInt();
        System.out.println("Input your birth year: ");
        birth = input.nextInt();
        Amount a = new Amount(current, birth);
        a.principal();
    } 
}
