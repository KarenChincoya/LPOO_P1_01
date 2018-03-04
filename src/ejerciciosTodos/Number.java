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
public class Number {
    Integer x;
//pass each value to
    public Number(Integer x){
        this.x = x;
    }
    public void displayNumberPlus10(){
        System.out.println(x+" + 10 = "+ (x+10));
    }
    public void displayNumberPlus100(){
        System.out.println(x+" + 100 = "+ (x+100));
    }
    public void displayNumberPlus1000(){
        System.out.println(x+" + 1000 = "+ (x+1000));
    }  
}
