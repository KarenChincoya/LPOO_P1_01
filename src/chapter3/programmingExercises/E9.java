/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.programmingExercises;

import ejerciciosTodos.Salary;
import java.util.Scanner;

/**
 *
 * @author Karen Velasco
 */
public class E9 {
    public static void main(String[] args) {
        Double payRate, regularHours, overHours;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the hourly pay rate: ");
        payRate = input.nextDouble();
        System.out.println("Input your regular hours: ");
        regularHours = input.nextDouble();
        System.out.println("Input your overtime hours: ");
        overHours = input.nextDouble();
        Salary s = new Salary(payRate, regularHours, overHours);
        s.principal();
     }
}
