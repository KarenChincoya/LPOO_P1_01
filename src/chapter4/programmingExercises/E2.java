/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4.programmingExercises;

import ejerciciosTodos.Billing;

/**
 *
 * @author Karen Velasco
 */
public class E2 {
    public static void main(String[] args){
        Double price = 100.0;
        Double quantityOrdered = 5.0;
        Double couponValue = 2.0;
        Billing b = new Billing();
        System.out.println("Price: "+b.computeBill(price));
        System.out.println("Price with quantity ordered: "+b.computeBill(price, quantityOrdered));
        System.out.println("Price with quantity ordere and coupon value: "+ b.computeBill(price, quantityOrdered, couponValue));
    }
}
