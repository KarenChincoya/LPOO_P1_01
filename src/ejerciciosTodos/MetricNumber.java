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
public class MetricNumber {
    Double x;
    Double y;
    public MetricNumber(Double x, Double y){
        this.x = x;
        this.y = y;
    }
    public void conversion(Double x, Double y){
        System.out.println(x +" inches equals "+x*2.54+" cm.");
        System.out.println(y +" gallons equals "+y*3.7854+" liters.");
    }
}
