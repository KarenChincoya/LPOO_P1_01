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
public class FormLetterWriter {
    public void displaySalutation(String lastName){
        System.out.println("Dear Mr. or Ms. "+ lastName);
        System.out.println("Thank you for your recent order.");
    }
    public void displaySalutation(String firstName, String lastName){
        System.out.println("Dear "+firstName+" "+lastName);
        System.out.println("Thank you for your recent order.");
    }
}
