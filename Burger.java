/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects1;

/**
 *
 * @author Tyler
 */
public class Burger {
    public int percRemaining=100;
    public String name;
    public String temperature;
    public int numPatties;
    public boolean includeSteakSauce;
    
    public void eatBurger(int percEaten){
        percRemaining= percRemaining-percEaten;
    }//close method
    
    public void addSteakSauce(){
        includeSteakSauce=true;
    }
}
