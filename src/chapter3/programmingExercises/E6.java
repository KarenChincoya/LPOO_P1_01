/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.programmingExercises;

import ejerciciosTodos.MetricNumber;
import java.util.Scanner;

/**
 *
 * @author Karen Velasco
 */
public class E6 {
    public static void main(String[] args) {
        Double x;
        Double y;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number of inches: ");
        x = input.nextDouble();
        System.out.println("Input the number of gallons: ");
        y = input.nextDouble();
        MetricNumber n = new MetricNumber(x,y);
        n.conversion(x,y);
    }  
}
