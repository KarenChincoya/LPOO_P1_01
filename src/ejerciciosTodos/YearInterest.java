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
public class YearInterest {
     /*invested at 5% interest for one year
	principal*/
	Double starting, ganancia;
	public YearInterest(Double starting){
            this.starting = starting;
        }
        public void principal(){
           Double y;
           y = yearInterest();
           System.out.println("Amount of money that you'll have after one year: $"+y);
        }

/*Interest function*/
	private Double yearInterest(){
		return starting*1.05;
	} 
}
