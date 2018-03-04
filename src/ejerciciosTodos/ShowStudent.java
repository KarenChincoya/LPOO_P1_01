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
public class ShowStudent {
    public static void inputStudent(){
        Student Karen = new Student();
	Karen.setID(2354);
	Karen.setHoursEarned(25.0);
	Karen.setPointEarned(8.0);
	Karen.gradePointAverage();
	Karen.displayData();
    }
}
