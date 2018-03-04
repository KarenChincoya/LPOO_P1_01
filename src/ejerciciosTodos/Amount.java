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
public class Amount {
    Integer current;
    Integer birth;
    
    public Amount(Integer current, Integer birth){
        this.current = current;
        this.birth = birth;
    }
    public void principal(){
        Integer pa;
        System.out.println("Annual policy premiums");
        pa = premiumAmount();
        System.out.println("The premium amount is: "+ pa);
    }
    private Integer premiumAmount(){
        Integer age;
        age = this.current - this.birth;
        return (((age-(age%10))/10) + 15 )*20;
    }
}
