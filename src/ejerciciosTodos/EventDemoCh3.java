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
public class EventDemoCh3 {
    public static void demo(){
        Scanner input = new Scanner(System.in);
        Integer guests;
        String event;
        EventCh3V2 e = new EventCh3V2();
        guests = e.readGuests();
        event = e.readEvent();
        e.setGuests(guests);
        e.displayMotto();
        e.ticket(e);
    }
}
