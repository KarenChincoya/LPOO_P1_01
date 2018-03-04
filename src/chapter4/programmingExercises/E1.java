/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4.programmingExercises;

import ejerciciosTodos.FormLetterWriter;

/**
 *
 * @author Karen Velasco
 */
public class E1 {
    
    public static void main(String[] args){
        FormLetterWriter f = new FormLetterWriter();
        String firstName = "Karen";
        String lastName = "Velasco";
        f.displaySalutation(lastName);
        f.displaySalutation(firstName, lastName);
    }
   
}
