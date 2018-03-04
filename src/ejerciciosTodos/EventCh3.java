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
public class EventCh3 {
    public final static Integer generalPrice = 35;
	public final static Integer largeEventCutoff = 50;
	private String event;
	private Integer guests;
	private Integer price;
	public void setEventNumber(String event){
		this.event = event;
	}
	public void setGuests(Integer guests){
		this.guests = guests;
		this.price = guests*generalPrice;
	}
	//Three get methods
	public String getEvent(){
		return event;
	}
	public Integer getGuests(){
		return guests;
	}
	public Integer getPrice(){
		return price;
	}
}
