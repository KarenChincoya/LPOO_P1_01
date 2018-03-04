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
public class Salary {
    
/*Weekly salary for an employee
	Pincipal*/
    Double payRate, regularHours, overHours, result;
    public Salary(Double payRate, Double regularHours, Double overHours){
        this.payRate = payRate;
        this.regularHours = regularHours;
        this.overHours = overHours;
    }
    public void principal(){
        Double result;
        result = totalSalary();
        System.out.println("The week salary is: $"+result);

    }
//method 
    private Double totalSalary(){
	return (payRate*regularHours+(payRate*overHours*1.5));
    }  
}
