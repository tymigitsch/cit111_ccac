/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8_methods2;
import java.util.Scanner;
/**
 *
 * @author Tyler
 */
public class UnitConverter {
    public static void main(String[]args){
        System.out.println("****The Amazing Unit Converter****");
        System.out.println("Enter the number of miles to convert to inches:");
        
        Scanner inputScanner= new Scanner(System.in);
        double userMiles= inputScanner.nextDouble();
        //call convertMilesToInches with userMiles as argument
        double returnedInches= convertMilesToInches(userMiles);
        System.out.println(userMiles+" miles equals "+returnedInches+" inches");
        System.out.println("***************************");
        System.out.println("Enter the number of feet to convert to kilometers:");
        double userFeet= inputScanner.nextDouble();
        double returnedKilometers= convertFeetToKilometers(userFeet);
        System.out.println(userFeet+" feet equals "+returnedKilometers+" kilometers");
        System.out.println("***************************");
        System.out.println("Enter the degrees in Fahrenheit to convert to Celsius");
        double userFahrenheit= inputScanner.nextDouble();
        double returnedCelsius= convertFahrenheitToCelsius(userFahrenheit);
        System.out.println(userFahrenheit+" degrees Fahrenheit equals "+returnedCelsius+" degrees Celsius");
        System.out.println("*************Come Back Soon!*****************");
    }//close main method
    public static double convertMilesToInches(double userMiles){
        double inches= userMiles*63360;
        return inches;
    }//close method convertMilesToInches
    public static double convertFeetToKilometers(double userFeet){
        double kilometers= userFeet/3280.84;
        return kilometers;
    }//close method convertFeetToKilometers
    public static double convertFahrenheitToCelsius(double userFahrenheit){
        double celsius= (userFahrenheit-32)/1.8;
        return celsius;
    }//close method convertFahrenheitToCelsius
}//close class
