/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Tyler
 */
public class MysteryDoors {
    //The single job of this method is to be an introduction and to call other methods
    public static void main(String[]args){
        int userInput;
        int userAge;
        //introduction to game
        System.out.println("WELCOME TO THE GAME OF THE CENTURY");
        System.out.println("------GRAND PRIZE OR GOATS-------");
        System.out.println("Before we start, how old are you?");
        //creating scanner object
        Scanner inputScanner= new Scanner(System.in);
        userAge= inputScanner.nextInt();
        
        //ends the build if userAge is 0 or negative
        if(userAge<=0){
        System.out.println("Please enter your real age next time.");
        return;
    }//closes if
        //prompts user to enter a door number
        System.out.println("Enter the ONE DOOR number you'd like to open - 1, 2, or 3:");
        //stores user's input
        userInput= inputScanner.nextInt();
        
        switch(userInput){
            case 1:
                door1(userAge);//call door 1 method
                break;
            case 2:
                door2();//call door 2 method
                break;
            case 3:
                door3(userAge);//call door 3 method
                break;
            default:
                System.out.println("Please re-run the program and choose 1,2, or 3 next time!");

        }//closes switch
    }//closes method main
    
    public static void door1(int userAge){
        int attempts=0;
        int userSure;
        
        while(attempts<3){
            System.out.println("I don't think you want to open that door...");
            System.out.println("Maybe you should pick a different door...perhaps doors 2 or 3...");
            Scanner inputScanner= new Scanner(System.in);
            userSure= inputScanner.nextInt();
            if(userSure==1){
                attempts=attempts+1;
            }//closes if userSure=1
            
            else if(userSure==2){
                door2();
                break;
                
            }//closes else if userSure=2
            
            else if(userSure==3){
                door3(userAge);
                break;
                
            }//closes elseif userSure=3
            
            else{
                System.out.println("Next time please pick between doors 1,2, or 3.");
                break;
            }//closes else block
            
            if(attempts==3){
                System.out.println("Oh no! You've been trampled by a herd of goats!");
                System.out.println("Looks like you've been goated! Better luck next time!");
            }//closes if attempts=3
        }//closes while loop
    }//closes method door1 
    
    public static void door2(){
        //creates new random object
        Random r= new Random();
        //int variable to store a random number 0 or 1
        int randomInt= r.nextInt(2);
        //occurs if randomInt is 0
        if(randomInt==0){
            System.out.println("WOA that was close! You narrowly avoided being trampled by a herd of goats");
            System.out.println("Unfortunately you've lost, better luck next time!");
        }//closes if block
        
        //occurs when randomInt is 1
        else if(randomInt==1){
            System.out.println("Oh no! You've been trampled by a herd of goats!");
            System.out.println("Looks like you've been goated! Better luck next time!");
        }//closes elseif block
    }//closes method door2
    
    public static void door3(int userAge){
        System.out.println("Congratulations! You've avoided getting goated!");
        if(userAge<18){
            System.out.println("You've won a lifetime supply of Twix candybars!");
        }//closes if under 18
        if(userAge>=18){
            System.out.println("You've won a brand new Lamborghini Aventador!");
        }//closes if over 18
    }//closes method door3
}
