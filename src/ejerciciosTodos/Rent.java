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
public class Rent {
    int hours, minutes, total;
    
    public Rent(Integer hours, Integer minutes){
        this.hours = hours;
        this.minutes = minutes;
    }
    public void getMotto(){
        System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
        System.out.println("s\t\t\t\t\t\t S");
        System.out.println("S         Sammy’s makes it fun in the sun.       s");
        System.out.println("s\t\t\t\t\t\t S");
        System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
   }
    public void getTotal(){
        System.out.println("Hours\tMinutes\tTotal price");
        System.out.println("  "+hours+"\t"+minutes+"\t   "+hours*40+minutes);
    }
}
