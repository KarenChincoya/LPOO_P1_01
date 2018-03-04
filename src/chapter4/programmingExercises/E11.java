/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4.programmingExercises;

import ejerciciosTodos.State;

/**
 *
 * @author Karen Velasco
 */
public class E11 {
    public static void main(String[] args){
        State s1 = new State("Washington",7288*1000000,"Seattled",704352,"Spokane",215973 );
        System.out.println("State data: ");
        System.out.println("State's name: "+s1.getStateName());
        System.out.println("State's population: "+s1.getStatePopulation());
        System.out.println("Capital's name: "+s1.getCapitalName());
        System.out.println("Capital's population: "+s1.getCapitalPopulation());
        System.out.println("Most populous city's name: "+s1.getMostPopulousName());
        System.out.println("Most populous city's population: "+s1.getMostPopulousPopulation());
    }
}
