/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.programmingExercises;

/**
 *
 * @author Karen Velasco
 */
public class E2 {
    public static void main(String[] args){
        System.out.println("2. Suppose that a class named ClassA contains a private nonstatic integer named b,"
                + "a public nonstatic integer named c, and a public static integer named d. Which of the "
                + "following are legal statements in a class named ClassB that has instantiated an object as ClassA obA = new ClassA();? ");

        System.out.println("a. obA.b = 12;		Ilegal, it's private");
        System.out.println("b. obA.c = 5; 		Legal");
        System.out.println("c. obA.d = 23; 		Legal");
        System.out.println("d. ClassA.b = 4; 	Ilegal, it's private");
        System.out.println("e. ClassA.c = 33; 	Ilegal, it's nonstatic");
        System.out.println("f. ClassA.d = 99;	Legal");
    }
}
