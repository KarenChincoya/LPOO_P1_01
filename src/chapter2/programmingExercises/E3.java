/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.programmingExercises;

/**
 *
 * @author Karen Velasco
 */
public class E3 {
    public static void main(String[] args){
        System.out.println("3. Choose the best data type for each of the following so that any reasonable value "
            + "is accommodated but no memory storage is wasted. Give an example of a typical value that would be held by the variable, and explain why you chose the type you did. ");

        System.out.println("Data\t\t\t\t\t\t\ttype \t Eg of typical value\t\tWhy?");
        
        System.out.println("a. the number of siblings you have 			Byte		2,3,..., <128		Las familias no tienen tantos hijos");
        System.out.println("b. your final grade in this class			float		9.8, 8.6		La calificación se encuentra en el rango [0,10], con decimales");
        System.out.println("c. the population of Earth 				long 		7500 millones		La población crece de manera exponencial");
        System.out.println("d. the population of a U.S. county 			long		323 millones		Para asegurar la precisión");
        System.out.println("e. thenumberofpassengersonabus 				short		30,60,128,256		El autobús con mayor capacidad puede albergar 256 pasajeros");
        System.out.println("f. one player’s score in a Scrabble game		short 		50,100,300		El récord mundial es de 325 puntos ");
        System.out.println("g. one team’s score in a Major League Baseball game 	short		52,63,89,186		De acuerdo con los puntajes máximo obtenidos históricamente");
        System.out.println("h. the year an historical event occurred		short		1997, 2000, 20018	El rango comtempla hasta el 32,767 ");
        System.out.println("i. the number of legs on an animal			short		2,3,4,100,750		Considerando los animales con más patas en el mundo.");

    }
}
