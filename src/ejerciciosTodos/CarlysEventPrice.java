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
public class CarlysEventPrice {
    public static void calculate() {
        int guests, total;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number of guests: ");
        guests = input.nextInt();
        Event e = new Event(guests);
        e.getMotto();
        e.getTotal();
    } 
}
