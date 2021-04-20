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
public class Salad {
    public int percRemaining= 100;
    public String name;
    public boolean containsNuts;
    public String lettuceType;
    public boolean vegetarian;
    
    public void eatSalad(int percEaten){
        percRemaining= percRemaining-percEaten;
    }//close method
    
    public void addMeat(){
        vegetarian=true;
    }//close method
}//close class
