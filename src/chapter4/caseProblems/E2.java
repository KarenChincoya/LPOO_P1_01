/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4.caseProblems;

import ejerciciosTodos.RentalCh4;
import java.util.Scanner;

/**
 *
 * @author Karen Velasco
 */
public class E2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        RentalCh4 r1 = new RentalCh4();
        System.out.println("Input the contract number: ");
        String contractNumber = input.next();
        System.out.println("Input the minutes: ");
        Integer minutes = input.nextInt();
        RentalCh4 r2 = new RentalCh4(contractNumber, minutes);
        //display data
        r1.displayData();
        System.out.println("\n**************************************************\n");
        r2.displayData();
    }
}
