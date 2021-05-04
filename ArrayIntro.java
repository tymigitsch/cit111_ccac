/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wk_05MAY21;
import java.util.Scanner;
/**
 *
 * @author Tyler
 */
public class ArrayIntro {
    public static void main(String[]args){
        Scanner inputScan= new Scanner(System.in);
        System.out.println("How many values would you like in the array?");
        int userNumberOfArray= inputScan.nextInt();
        
        String[] games= new String[userNumberOfArray];
        
        int arrayLength= games.length;
        
        for(int x=0; x<arrayLength; x=x+1){
            //new scanner object, would skip first array entry for some reason if using same scanner object
            Scanner ScanScan= new Scanner(System.in);
            System.out.println("Please enter the title for game "+(x+1));
            games[x]= ScanScan.nextLine();
            
        }//close for loop
        facilitateUserInteraction(games);
    }//close method
    public static void facilitateUserInteraction(String[] anArray){
        Scanner inputScan2= new Scanner(System.in);
        System.out.println("Please enter the array value you'd like to see");
        int userChoice= inputScan2.nextInt()-1;
        System.out.println(anArray[userChoice]);
    }//close method
}//close class
