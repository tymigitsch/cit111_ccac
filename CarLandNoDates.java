/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wk_26APR21;

/**
 *
 * @author Tyler
 */
public class CarLandNoDates {
    public static void main(String[]args){
        
        Car deLorean= new Car();
        deLorean.year= 1983;
        deLorean.makeModel= "Delorean DMC-12";

        
        
        Car eagle= new Car();
        eagle.year= 1980;
        eagle.makeModel= "AMC Eagle";
        
        displayCarStats(deLorean);
        displayCarStats(eagle);
        
        System.out.println("deLorean");
        deLorean.startEngine();
        deLorean.accelerate(88);
        deLorean.decelerate(12);
        
        System.out.println("Eagle");
        eagle.startEngine();
        eagle.accelerate(50);
        eagle.decelerate(55);
        
        displayCarStats(deLorean);
        displayCarStats(eagle);
        eagle.stopEngine();
        deLorean.stopEngine();
        displayCarStats(deLorean);
        displayCarStats(eagle);
        

    }//close main
    
    public static void displayCarStats(Car anyCarObject){
        System.out.println("*******STATS*********");
        System.out.println(anyCarObject.year+" "+anyCarObject.makeModel);
        System.out.println("Engine running? "+ anyCarObject.checkEngineStatus());
        System.out.println("Current speed : "+ anyCarObject.getCurrentSpeed());
        System.out.println("Gear: "+anyCarObject.getCurrentGear());
    }//close method stats
    

}//close class
