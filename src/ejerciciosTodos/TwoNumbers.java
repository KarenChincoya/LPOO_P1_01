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
public class TwoNumbers {
    Integer x;
    Integer y;
    public TwoNumbers(Integer x, Integer y){
        this.x = x;
        this.y = y;
    }
    public void displayNumberPlus10(Integer x, Integer y){
        System.out.println(x+" + 10 = "+ (x+10));
        System.out.println(y+" + 10 = "+ (y+10));
    }
    public void displayNumberPlus100(Integer x, Integer y){
        System.out.println(x+" + 100 = "+ (x+100));
        System.out.println(y+" + 100 = "+ (y+100));
    }
    public void displayNumberPlus1000(Integer x, Integer y){
        System.out.println(x+" + 1000 = "+ (x+1000));
        System.out.println(y+" + 1000 = "+ (y+1000));
    }  
}
