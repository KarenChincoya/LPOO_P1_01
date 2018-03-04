/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4.caseProblems;

import ejerciciosTodos.EventCh4;
import java.util.Scanner;

/**
 *
 * @author Karen Velasco
 */
public class E1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        EventCh4 e1 = new EventCh4(); //defaul values
        //display details of both objetct
        //event, guests
        System.out.println("Input the event ID: ");
        String event = input.next();
        System.out.println("Input the number of guests: ");
        Integer guests = input.nextInt();
        EventCh4 e2 = new EventCh4(event,guests);
        
        e1.displayData();
        System.out.println("\n**********************************************\n");
        e2.displayData();
    }
}
