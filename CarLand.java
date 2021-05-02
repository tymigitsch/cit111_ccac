/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wk_26APR21;
import java.util.Scanner;
import java.time.LocalDateTime;
/**
 *
 * @author Tyler
 */
public class CarLand {
    public static void main(String[]args){
        LocalDateTime localDate;
        localDate = LocalDateTime.now();
        
        Car deLorean= new Car();
        deLorean.year= 1983;
        deLorean.makeModel= "Delorean DMC-12";
        deLorean.presYear= localDate.getYear();
        deLorean.presMonth= localDate.getMonthValue();
        deLorean.presDay= localDate.getDayOfMonth();
        deLorean.presHour= localDate.getHour()*100;
        deLorean.presMin= localDate.getMinute();

        displayCarStats(deLorean);
        displayAllTimes(deLorean);
        
        chooseDestinationTime(deLorean);
        
        displayAllTimes(deLorean);
         chooseDestinationTime(deLorean);
        displayAllTimes(deLorean);
    }//close main
    
    public static void displayCarStats(Car anyCarObject){
        System.out.println("*******STATS*********");
        System.out.println(anyCarObject.year+" "+anyCarObject.makeModel);
        System.out.println("Engine running? "+ anyCarObject.checkEngineStatus());
        System.out.println("Current speed : "+ anyCarObject.getCurrentSpeed());
        System.out.println("Gear: "+anyCarObject.getCurrentGear());
    }//close method stats
    
    public static void displayPresentTime(Car anyCarObject){
        System.out.println("*****PRESENT TIME*******");
        System.out.println("Year : "+anyCarObject.presYear);
        System.out.println("Month: "+anyCarObject.presMonth);
        System.out.println("Day: "+anyCarObject.presDay);
        System.out.println("Hour: "+anyCarObject.presHour);
        System.out.println("Minute: "+anyCarObject.presMin);
    }
    
    public static void displayPreviousTime(Car anyCarObject){
        System.out.println("*****PREVIOUS TIME*******");
        System.out.println("Year : "+anyCarObject.prevYear);
        System.out.println("Month: "+anyCarObject.prevMonth);
        System.out.println("Day: "+anyCarObject.prevDay);
        System.out.println("Hour: "+anyCarObject.prevHour);
        System.out.println("Minute: "+anyCarObject.prevMin);
    }
    
    public static void displayDestinationTime(Car anyCarObject){
        System.out.println("*****DESTINATION TIME*******");
        System.out.println("Year : "+anyCarObject.destYear);
        System.out.println("Month: "+anyCarObject.destMonth);
        System.out.println("Day: "+anyCarObject.destDay);
        System.out.println("Hour: "+anyCarObject.destHour);
        System.out.println("Minute: "+anyCarObject.destMin);
    }
    
    public static void displayAllTimes(Car anyCarObject){
        displayDestinationTime(anyCarObject);
        displayPresentTime(anyCarObject);
        displayPreviousTime(anyCarObject);
    }
    
    public static void chooseDestinationTime(Car anyCarObject){
        chooseDestinationMonth(anyCarObject);
        chooseDestinationYear(anyCarObject);
        chooseDestinationDay(anyCarObject);
        chooseDestinationHour(anyCarObject);
        chooseDestinationMinute(anyCarObject);
    }
    
    public static int chooseDestinationYear(Car anyCarObject){
        Scanner timeScan= new Scanner(System.in);
        System.out.println("Please enter the destination year.");
        anyCarObject.prevYear= anyCarObject.presYear;
        anyCarObject.destYear= timeScan.nextInt();
        anyCarObject.presYear= anyCarObject.destYear;
        return anyCarObject.destYear;
    }//close method
    public static int chooseDestinationMonth(Car anyCarObject){
        Scanner timeScan= new Scanner(System.in);
        System.out.println("Please enter the destination month.(1-12, 1= Jan)");
        anyCarObject.prevMonth= anyCarObject.presMonth;
        anyCarObject.destMonth= timeScan.nextInt();
        anyCarObject.presMonth= anyCarObject.destMonth;
        return anyCarObject.destMonth;
    }//close method
    public static int chooseDestinationDay(Car anyCarObject){
        Scanner timeScan= new Scanner(System.in);
        System.out.println("Please enter the destination day of the month.(0-31)");
        anyCarObject.prevDay= anyCarObject.presDay;
        anyCarObject.destDay= timeScan.nextInt();
        anyCarObject.presDay= anyCarObject.destDay;
        return anyCarObject.destDay;
    }//close method
    public static int chooseDestinationHour(Car anyCarObject){
        Scanner timeScan= new Scanner(System.in);
        System.out.println("Please enter the destination hour of day(Military Time, 0000-2400).");
        anyCarObject.prevHour= anyCarObject.presHour;
        anyCarObject.destHour= timeScan.nextInt();
        anyCarObject.presHour= anyCarObject.destHour;
        return anyCarObject.destHour;
    }//close method
    public static int chooseDestinationMinute(Car anyCarObject){
        Scanner timeScan= new Scanner(System.in);
        System.out.println("Please enter the destination minute");
        anyCarObject.prevMin= anyCarObject.presMin;
        anyCarObject.destMin= timeScan.nextInt();
        anyCarObject.presMin= anyCarObject.destMin;
        return anyCarObject.destMin;
    }//close method
}//close class
