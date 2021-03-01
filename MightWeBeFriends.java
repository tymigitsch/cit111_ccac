/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;
import java.util.Scanner;
/**
 *This program will ask the user questions and add/subtract from an int var
 * depending on the user's response. If the user scores above a set amount
 * they win.
 * @author Tyler
 */
public class MightWeBeFriends {
    public static void main(String[]args){
        //initializing variables
        int userScore =0;
        int userAnswer;
        String userName;
        
        //calling scanner
        Scanner userInputScanner= new Scanner(System.in);
        System.out.println("Hi there, what's your name?");
        
        //stores user's name in userName
        userName= userInputScanner.next();
        
        System.out.println("Maybe we can be friends. For the following questions enter 1 for yes or 0 for no.");
        System.out.println("Do you like videogames?");
        
        //storing the user's answer
        userAnswer= userInputScanner.nextInt();
        //message if user inputs something other than 0 or 1
        if(userAnswer!=1 && userAnswer!=0){
            System.out.println("Sorry "+userName+" rerun the program and answer with either 1 for yes or 0 for no.");
            return;//returns to calling function, used this instead of System.exit, both stop the program in this situation
        }//closes error if block
        
        //if answer is yes then do this
        if (userAnswer==1){
        userScore= userScore+10;
        System.out.println("Great! Do you play World of Warcraft?\nYour score is "+userScore);
        userAnswer= userInputScanner.nextInt();
        
                if(userAnswer!=1 && userAnswer!=0){
            System.out.println("Sorry "+userName+" rerun the program and answer with either 1 for yes or 0 for no.");
            return;//returns to calling function, used this instead of System.exit, both stop the program in this situation
        }//closes error if block
                
        //nested Q1 if block
        if (userAnswer==1){
            userScore= userScore+20;
            System.out.println("Awesome! Me too!\nYour score is "+userScore);
        }//closes Q1 followup yes if block
        
        if (userAnswer==0){
            System.out.println("No? That's ok.\nYour score is "+userScore);
        }//closes Q1 followup no if block
        }//closes Q1 yes if block
        if (userAnswer==0){
            userScore= userScore-20;
        }//closes Q1 no if block
        
        //start of Q2
        System.out.println("Do you play paintball?");
        userAnswer= userInputScanner.nextInt();
                if(userAnswer!=1 && userAnswer!=0){
            System.out.println("Sorry "+userName+" rerun the program and answer with either 1 for yes or 0 for no.");
            return;//returns to calling function, used this instead of System.exit, both stop the program in this situation
        }//closes error if block
                
        if (userAnswer==1){
            userScore= userScore+10;
            System.out.println("Great!\nYour score is "+userScore);
        }//closes Q2 yes if block
        
        //start of Q3
        System.out.println("Do you like hockey?");
        userAnswer= userInputScanner.nextInt();
                if(userAnswer!=1 && userAnswer!=0){
            System.out.println("Sorry "+userName+" rerun the program and answer with either 1 for yes or 0 for no.");
            return;//returns to calling function, used this instead of System.exit, both stop the program in this situation
        }//closes error if block
                
        if (userAnswer==1){
            userScore= userScore+10;
            System.out.println("Let's go Pens!\nYour score is "+userScore);
        }//closes Q3 yes if block
        
        //start of Q4
        System.out.println("Do you like dogs?");
        userAnswer= userInputScanner.nextInt();
                if(userAnswer!=1 && userAnswer!=0){
            System.out.println("Sorry "+userName+" rerun the program and answer with either 1 for yes or 0 for no.");
            return;//returns to calling function, used this instead of System.exit, both stop the program in this situation
        }//closes error if block
                
        if (userAnswer==1){
            userScore= userScore+10;
            System.out.println("Maybe you can meet my dog. His name is Ash.\nYour score is "+userScore);
        }//closes Q4 yes if block
        if (userAnswer==0){
            userScore= userScore-10;
        }//closes Q4 no if block
        
        //start of Q5
        System.out.println("Do you like cats?");
        userAnswer= userInputScanner.nextInt();
                if(userAnswer!=1 && userAnswer!=0){
            System.out.println("Sorry "+userName+" rerun the program and answer with either 1 for yes or 0 for no.");
            return;//returns to calling function, used this instead of System.exit, both stop the program in this situation
        }//closes error if block
                
        if(userAnswer==1){
            userScore= userScore+10;
            System.out.println("I like dogs and cats.\nYour score is "+userScore);
        }//closes Q5 yes if block
        
        //start of Q6
        System.out.println("Do you do drugs other than marijuana?");
        userAnswer= userInputScanner.nextInt();
                if(userAnswer!=1 && userAnswer!=0){
            System.out.println("Sorry "+userName+" rerun the program and answer with either 1 for yes or 0 for no.");
            return;//returns to calling function, used this instead of System.exit, both stop the program in this situation
        }//closes error if block
                
        if(userAnswer==1){
            userScore= userScore-1000;
            System.out.println("Sorry "+userName+", we can't be friends.");
            return;
        }//closes Q6 yes if block
        
        // final result header
        System.out.println("**************************");
        System.out.println("FINAL FRIEND DETERMINATION");
        System.out.println("**************************");
        
        //if we can be friends score>=40
        if(userScore>=40){
            System.out.println("I think we can be friends.\nYour final score is "+userScore);
        }//closes score>=40 if block
        
        //if we can't be friends score<40
        if(userScore<40){
            System.out.println("Sorry "+userName+", I don't think we can be friends.\nYour final score is "+userScore);
        }//closes score<40 if block
    }//closes main method
}//closes MightWeBeFriends class
