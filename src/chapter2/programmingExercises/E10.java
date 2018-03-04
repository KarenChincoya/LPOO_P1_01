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
public class E10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dollars,d, twenty=0, ten=0, five=0;
        System.out.println("Input the number of dollars: ");
        dollars = input.nextInt();
        d = dollars;
        twenty = (dollars-(dollars%20))/20;
        dollars = dollars - twenty*20;
        ten = (dollars-(dollars%10))/10;
        dollars = dollars - ten*10;
        five = (dollars-(dollars%5))/5;
        dollars = dollars - five*5;
        System.out.println(d +" dollars equals:\nCurrency\tTotal ");
        System.out.println(" $20\t\t"+twenty);
        System.out.println(" $10\t\t"+ten);
        System.out.println(" $5 \t\t"+five);
        System.out.println(" $1 \t\t"+dollars);
    } 
}
