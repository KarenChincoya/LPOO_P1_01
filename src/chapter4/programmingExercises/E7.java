/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4.programmingExercises;

/**
 *
 * @author Karen Velasco
 */
public class E7 {
    public static void main(String[] args){
	Double a = Math.sqrt(37);
	Double bSen = Math.sin(300);
	Double bCos = Math.cos(300);
	Double cFloor = Math.floor(22.8);
	Double cCeiling = Math.ceil(22.8);
        long cRound = Math.round(22.8);
        System.out.println(a);
        System.out.println(bSen);
        System.out.println(bCos);
        System.out.println(cFloor);
        System.out.println(cCeiling);
        System.out.println(cRound);
        int d = (int) 'D';
        String smaller;
        String larger;
        if(d>=71){
            larger = Integer.toString(d);
            smaller = Integer.toString(71);
        }else{
            larger = Integer.toString(17);
            smaller = Integer.toString(d);
        }
       System.out.println("The larger is: "+larger);
       System.out.println("The smaller is: "+smaller);
       Integer aleatorio = (int) Math.floor(Math.random()*21);
       System.out.println(aleatorio);
}
}
