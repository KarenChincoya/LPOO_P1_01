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
public class Student {
    /*	Student class 	*/
	private Integer ID;
	private Double hoursEarned;
	private Double pointsEarned;
	private Double gradeAverage;
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
	public Double getHoursEarned(){
		return hoursEarned;
	}
	public Double getPointEarned(){
		return pointsEarned;
	}
	public Double gradePointAverage(){
		return (pointsEarned/hoursEarned);
	}
        public void setGradeAverage(){
            this.gradeAverage = hoursEarned/pointsEarned;
        }
	public void displayData(){
		System.out.println("ID: "+ ID);
		System.out.println("Hours earned: "+ hoursEarned);
		System.out.println("Points Earned: "+pointsEarned);
                setGradeAverage();
		System.out.println("Grade points average: "+ gradeAverage);
	}
}
