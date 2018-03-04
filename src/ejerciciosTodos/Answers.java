/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosTodos;

/**
 *
 * @author Karen Velasco
 */
public class Answers {
    public static void displayData(){
        System.out.println("1. For each of the following Java identifiers, note whether it is legal or illegal:\n");
        System.out.println("a. budgetApproval -> Legal");
        System.out.println("b. German Shepherd -> Ilegal, the spaces aren't allow");
        System.out.println("c. static -> Ilegal, static is a reserved word");
        System.out.println("d. HELLO -> Legal");
        System.out.println("e. 212AreaCode -> Ilegal, it starts with a number");
        System.out.println("f. qhu6TRfg ->Legal");
        System.out.println("g. ssn# Ilegal, # can't be part of the identifier");
        System.out.println("h. 4999 -> Ilegal, it's a number");
        System.out.println("i. 17 ->Ilegal, it's a number");
        System.out.println("j. Accounts_Receivable -> Legal");
        System.out.println("k. 32MPG -> Ilegal");
        System.out.println("l. rulesOfOrder -> Legal");
    }
}
