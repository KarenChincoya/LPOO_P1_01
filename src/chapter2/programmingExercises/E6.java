/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.programmingExercises;

import ejerciciosTodos.InchesToFeet;
import ejerciciosTodos.InchesToFeetInteractive;

/**
 *
 * @author Karen Velasco
 */
public class E6 {
    public static void main(String[] args){
        InchesToFeet i = new InchesToFeet();
        i.calculate();
        
        System.out.println("\n*********************************\n");
        
        InchesToFeetInteractive i2 = new InchesToFeetInteractive();
        i2.calculate();
    }
}
