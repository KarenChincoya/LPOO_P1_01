/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.programmingExercises;

import java.util.Scanner;

/**
 *
 * @author Karen Velasco
 */
public class E12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Input the ticket number: ");
        n = input.nextInt();
        System.out.println("Result: "+ ((((n-(n%10))/10)%7)==(n%10)?true:false));
    } 
}
