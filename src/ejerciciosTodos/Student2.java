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
public class Student2 {
    /*	Student class 	*/
	Integer ID;
	Double hoursEarned;
	Double pointsEarned;
	Double gradeAverage;
	public Student2(){
		this.ID = 9999;
		this.hoursEarned = 12.0;
		this.pointsEarned = 3.0;
		this.gradeAverage = 4.0;
	}
	public void setID(Integer ID){
		this.ID = ID;
	}
	public void setHoursEarned(Double hoursEarned){
		this.hoursEarned = hoursEarned;
	}
	public void setPointEarned(Double pointsEarned){
		this.pointsEarned = pointsEarned;
	}
	public Integer getID(Integer ID){
		return ID;
	}
	public Double getHoursEarned(Double hoursEarned){
		return hoursEarned;
	}
	public Double getPointEarned(Double pointsEarned){
		return pointsEarned;
	}	
	public Double gradePointAverage(){
		return (pointsEarned/hoursEarned);	
	}
	public void displayData(){
		System.out.println("ID: "+ ID);
		System.out.println("Hours earned: "+ hoursEarned);
		System.out.println("Points Earned: "+pointsEarned);
		System.out.println("Grade points average: "+ gradeAverage);
	}
}
