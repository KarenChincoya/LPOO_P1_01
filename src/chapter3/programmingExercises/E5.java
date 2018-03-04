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
import ejerciciosTodos.GasPrices;
import java.util.Scanner;
public class E5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input the price per barrel: ");
        Double price = input.nextDouble();
        GasPrices g = new GasPrices();
        g.main(price);
    }
}
