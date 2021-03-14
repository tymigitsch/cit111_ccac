/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;
import java.util.Scanner;
/**
 *
 * @author Tyler
 */
public class MathQuiz {
    public static void main(String[]args){
        //new scanner object
        Scanner inputScanner= new Scanner(System.in);
        //hard coding math problem and answer
        String question= "Compute the value of (10%3)*2:";
        final int cAnswer= 2;
        //variable to store user's answer and another for # of attempts
        int uAnswer;
        int attempts=0;
        
        //displaying header and prompting question
        System.out.println("**Math Checker**");
        System.out.println(question);
        //making uAnswer= user input
        uAnswer= inputScanner.nextInt();
        while(uAnswer!=cAnswer && attempts<2){
            
            if(uAnswer>cAnswer){
                System.out.println("Sorry, Incorrect\n(Your answer is too high)\n****\n"+question);
                uAnswer= inputScanner.nextInt();
            }//closes if
            else if(uAnswer<cAnswer){
                System.out.println("Sorry, Incorrect\n(Your answer is too low)\n****\n"+question);
                uAnswer= inputScanner.nextInt();
            }//closes else if
            //adding 1 to attempt variable;
            attempts= attempts+1;
        }//closes while block
        
        //happens if answer is correct
        if(uAnswer==cAnswer){
        System.out.println("Correct! Nice work\nSolution: (10%3)*2 = 1*2 = 2");
        }//closes if
        
        //happens if incorrect after 3 attempts and answer too high
        else if( uAnswer>cAnswer){
            System.out.println("Sorry, Incorrect\n(Your answer is too high)\n****\nSolution: (10%3)*2 = 1*2 = 2");
        }//closes else if
        //happens if incorrect after 3 attempts and answer too low
        else if( uAnswer<cAnswer){
            System.out.println("Sorry, Incorrect\n(Your answer is too low)\n****\nSolution: (10%3)*2 = 1*2 = 2");
        }//closes else if
    }//closes main method
}//closes MathQuiz class
