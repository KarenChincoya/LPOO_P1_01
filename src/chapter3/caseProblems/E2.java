/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.caseProblems;

import ejerciciosTodos.RentCh3;
import java.util.Scanner;

/**
 *
 * @author Karen Velasco
 */
public class E2 {
    public static void main(String args[]){
        Integer hours, minutes;
        Scanner input = new Scanner(System.in);
        /*1st executable statement: calls a method that prompts the user for
            the rerntal time*/
        RentCh3 e = new RentCh3();
        minutes = e.readMinutes();
        /* 2nd statement: calls the method that displays the company motto*/
        e.getMotto();
        /*The last statement, using the minutes */
        e.getTotal(minutes);
    }
}
