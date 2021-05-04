/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wk_05MAY21;

/**
 *
 * @author Tyler
 */
public class intArray {
    public static void main(String[]args){
        int totalInstruments;
        double averageInstruments;
        int[] instruments= new int[5];
        
       instruments[0]= 16;
       instruments[1]= 23;
       instruments[2]= 5;
       instruments[3]= 22;
       instruments[4]=15;
       
       totalInstruments=printNumericArrayManually(instruments);
       System.out.println("Total writing instruments: "+totalInstruments);
       
       averageInstruments= averageOfArray(instruments);
       System.out.println("The average amount of writing instruments is: "+
               averageInstruments);
       createAndAnalyzeFlasksArray();
    }//close method
    
    public static int printNumericArrayManually(int[] somethingArray){
        int runningTotal=0;
        int arrayLength= somethingArray.length;
        for(int x=0; x<arrayLength; x=x+1){
            System.out.println("Number of instruments in container "+(x+1)+": "+
                    somethingArray[x]);
            runningTotal= runningTotal+somethingArray[x];
        }//close for loop
        return runningTotal;
    }//close method
    public static double averageOfArray(int[] somethingArray){
        int totalAmount=0;
        int arrayLength= somethingArray.length;
        for(int x=0; x<arrayLength; x=x+1){
            totalAmount= totalAmount+ somethingArray[x];
        }//close for loop
        double arrayAverage= totalAmount/arrayLength;
        return arrayAverage;
    }//close method
    public static void createAndAnalyzeFlasksArray(){
        int[] flasks= new int[4];
        
        flasks[0]= 250;
        flasks[1]= 100;
        flasks[2]= 190;
        flasks[3]= 150;
        
        System.out.println("The total amount of fluid in the flasks is: "+
                printNumericArrayManually(flasks));
        System.out.println("The average amount of fluid in each flasks is: "+
                averageOfArray(flasks));
    }//close method
}//close class
