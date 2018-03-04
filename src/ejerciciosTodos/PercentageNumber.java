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
public class PercentageNumber {
    Double x;
    Double y;
    public PercentageNumber(Double x, Double y){
        this.x = x;
        this.y = y;
    }
    public void computePercent(Double x, Double y){
    //displays the 2 values, the value of the 1st number as a percentage of the second
        double p;
        p = x*(100.0/y);
        System.out.println(x +" is "+p+" % of "+y);
    }
}
