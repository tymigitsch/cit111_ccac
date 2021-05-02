/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wk_26APR21;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author Tyler
 */
public class Car {
    public int year;
    public String makeModel;
    
    public int destYear;
    public int presYear;
    public int prevYear;
    
    public int destMonth;
    public int presMonth;
    public int prevMonth;
    
    public int destDay;
    public int presDay;
    public int prevDay;
    
    public int destHour;
    public int presHour;
    public int prevHour;
    
    public int destMin;
    public int presMin;
    public int prevMin;
        
    private boolean isEngineRunning;
    private double speed;
    private int gear;

    
    public void startEngine(){
        isEngineRunning= true;
        System.out.println("...crank...crank...vroom!");
    }//close method start engine
    
    public void stopEngine(){
        isEngineRunning= false;
        System.out.println("...grbllllll....shldunk");
    }//close method
    
    public boolean checkEngineStatus(){
        return isEngineRunning;
    }//close method
    
    public double accelerate(int mphIncrease){
        speed= speed+ mphIncrease;
        if(speed>=15){
            gear=2;
            System.out.println("Shifting up to 2 at 15 mph");
        }
        if(speed>=35){
            gear=3;
            System.out.println("Shifting up to 3 at 35 mph");
        }
        return speed;
    }//close method
    
    public double decelerate(int mphDecrease){
        speed= speed- mphDecrease;
        if(speed<=0){
            speed=0;
        }
        if(speed<=15){
            gear=2;
            System.out.println("Downshifting to 2 at 15 mph");
        }
        if(speed<=10){
            gear=1;
            System.out.println("Downshifting to 1 at 10 mph");
        }
        return speed;
    }//close method
    
    public double getCurrentSpeed(){
        return speed;
    }//close method
    
    public int getCurrentGear(){
        return gear;
    }//close method
    

}//closes class car
