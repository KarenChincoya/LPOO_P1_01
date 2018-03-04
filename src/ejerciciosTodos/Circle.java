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
public class Circle {
    Double radius;
    Double diameter;
    Double area;

    public Circle(){//constructor that set radius = 1
            this.radius = 1.0;
            this.diameter = 2.0*radius;
            area = Math.PI * Math.pow(radius,2);
    }

    public void setRadius(Double radius){
            this.radius = radius;
            this.diameter = 2*radius;
            area = Math.PI * Math.pow(radius,2);
    }

    public Double getRadius(){
            return radius;
    }
    public void displayData(){
        System.out.println("Radius: "+radius);
        System.out.println("Diameter: "+diameter);
        System.out.println("Area: "+area+"u^2");
    }
}
