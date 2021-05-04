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
            //new scanner object, would skip first array entry for some reason
            //if using same scanner object. to replicate change ScanScan to inputScan on line 27
            Scanner ScanScan= new Scanner(System.in);
            System.out.println("Please enter the title for game "+(x+1));
            games[x]= ScanScan.nextLine();
            
        }//close for loop
               //
        facilitateUserInteraction(games);
        
        //this was in this class until it was updated in exercise 4, commented it out
        /*
        String [] games= new String[7];
        
        games[0]= "Total War: Warhammer II";
        games[1]= "Counter-Strike: Global Offensive";
        games[2]= "Darkest Dungeon";
        games[3]= "Divinity: Original Sin 2";
        games[4]= "Squad";
        games[5]= "Rising Storm 2: Vietnam";
        games[6]= "Dark Souls III";
        
        for(int x=0; x<=6; x=x+1){
            String selectedGame= games[x];
            System.out.println("Selected game: "+selectedGame);
        */
    }//close method
    public static void facilitateUserInteraction(String[] anArray){
        Scanner inputScan2= new Scanner(System.in);
        System.out.println("Please enter the array value you'd like to see");
        int userChoice= inputScan2.nextInt()-1;
        System.out.println(anArray[userChoice]);
    }//close method
}//close class
