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
public class State {
    //State
    String stateName;
    Integer statePopulation;
    String capitalName;
    Integer capitalPopulation;
    String mostPopulousName;
    Integer mostPopulousPopulation;

    public State(String name1, Integer population1, String name2, Integer population2, String name3, Integer population3 ){
        this.stateName = name1;
        this.statePopulation = population1;
        this.capitalName = name2;
        this.capitalPopulation = population2;
        this.mostPopulousName = name3;
        this.mostPopulousPopulation = population3;
    }
    public String getStateName(){
        return stateName;
    }
    public Integer getStatePopulation(){
        return statePopulation;
    }
    public String getCapitalName(){
        return capitalName;
    }
    public Integer getCapitalPopulation(){
        return capitalPopulation;
    }
    public String getMostPopulousName(){
        return mostPopulousName;
    }
    public Integer getMostPopulousPopulation(){
        return mostPopulousPopulation;
    }
    
    private class City{
        String cityName;
        String cityPopulation;
    }
}
