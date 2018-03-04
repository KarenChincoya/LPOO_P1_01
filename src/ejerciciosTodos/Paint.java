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
public class Paint {
    Integer length;
    Integer width;
    Integer height;

    public Paint(Integer length, Integer width, Integer height){
           this.length = length;
           this.width = width;
           this.height = height;
    }
    public void  wallArea(){
	Integer a, g, p;
	a = 2*(length*height)+2*(width*height);//total area
	g = gallons(a);
	System.out.println("Number of gallons needed:  " + g);
	//compute the price of $32 per gallon
	p = price(g);
	System.out.println("The cost to paint the room is: $"+p);
    }
    private Integer price(Integer p){
	return p*32;
    }
    private Integer gallons(Integer a){
	Integer total, resi;
	resi = a%350;
	total = a/350;
	if(resi>0)
		total++;
	return total; 
    }
}
