/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosTodos;

import java.util.Scanner;

/**
 *
 * @author Karen Velasco
 */
public class RentCh3 {
    private Integer hours, minutes, total;
    public RentCh3(){
      this.hours = 0;
      this.minutes = 0;
    }
    public RentCh3(Integer hours, Integer minutes){
        this.hours = hours;
        this.minutes = minutes;
    }
    public void setHours(int hours){
      this.hours = hours;
    }
    public int getHours(){
      return hours;
    }
    public void setMinutes(int minutes){
      this.minutes = minutes;
    }
    public Integer getMinutes(){
      return minutes;
    }
    public void getMotto(){
        System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
        System.out.println("s\t\t\t\t\t\t S");
        System.out.println("S         Sammy�s makes it fun in the sun.       s");
        System.out.println("s\t\t\t\t\t\t S");
        System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
   }
    public void getTotal(Integer minutes){
        Integer hours;
        hours = (minutes-(minutes%60))/60;
        minutes = minutes%60;
        System.out.println("Hours\tMinutes\tTotal price");
        System.out.println("  "+hours+"\t"+minutes+"\t   "+hours*40+minutes);
    }
    public Integer readMinutes(){
      int minutes;
      Scanner input = new Scanner(System.in);

      System.out.println("You'll be asked the number of minutes you rented a piece of sports equipment");
      System.out.println("Input the number of minutes: ");
      minutes = input.nextInt();

      return minutes;
    }
}
