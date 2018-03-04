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
public class Event {
    int guests, total;
    
    public Event(Integer guests){
        this.guests = guests;
    }
    
    public void setGuests(Integer guests){//getter
        this.guests = guests;
    }
    public void getMotto(){
            System.out.println("*************************************************");
            System.out.println("*\t\t\t\t\t\t*");
            System.out.println("* Carly’s makes the food that makes it a party. *");
            System.out.println("*\t\t\t\t\t\t*");
            System.out.println("*************************************************");
    }
    public void getTotal(){
        System.out.println("Number of guests  Price per guest  Total price");
        System.out.println("\t"+ guests+"\t\t$35\t\t"+guests*35);
        System.out.println((guests>=50)?"The job is a large event": "The event IS NOT a large event.");   
    }
}
