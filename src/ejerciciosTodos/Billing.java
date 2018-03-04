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
public class Billing {
    public Double computeBill(Double price){
        return price*1.08;
    }
    public Double computeBill(Double price, Double quantityOrdered){
      return (price*quantityOrdered)*1.08;
    }
    public Double computeBill(Double price, Double quantityOrdered, Double couponValue){
      return ((price*quantityOrdered)-couponValue)*1.08;
    }

}
