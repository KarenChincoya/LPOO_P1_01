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
public class RentalCh4 {
    public final static Integer minutesInHour = 60;
    public final static Integer hourlyRate = 40;
    private String contractNumber;
    private Integer numberOfHours;
    private Integer minutesOverAnHour;
    private Integer price;
    //2 set, 4 get
    public RentalCh4(){
        setContractNumber("A000");
        setHoursAndMinutes(0);
    }
    public RentalCh4(String contractNumber, Integer minutes){
        setContractNumber(contractNumber);
        setHoursAndMinutes(minutes);
    }
    
    public String getContractNumber(){
        return contractNumber;
    }    
    public Integer getNumberOfHours(){
        return numberOfHours;
    }
    public Integer getMinutesOverAnHour(){
        return minutesOverAnHour;
    }
    public Integer getPrice(){
        return price;
    }
    public void setHoursAndMinutes(Integer minutes){
        this.minutesOverAnHour = minutes%minutesInHour;
        this.numberOfHours = (minutes-(minutesOverAnHour))/60;
        price = minutesOverAnHour + numberOfHours*40;
    }
    public void setContractNumber(String contractNumber){
        this.contractNumber = contractNumber;
    }
    
    public void displayData(){
        System.out.println("Contract number: "+ contractNumber);
        System.out.println("Number of hours: "+ numberOfHours);
        System.out.println("Minutes over an hour: "+ minutesOverAnHour);
        System.out.println("Price: "+ price);
    }
}
