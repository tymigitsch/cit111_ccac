/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls3_classStructure;
import java.util.Scanner;
/**
 *
 * @author Tyler
 */
public class OrderTabulator {
    //class variables
    private static int totalPizzasOrdered= 0;
    private static int totalHoagiesOrdered= 0;
    private static int totalBreadSticksOrdered=0;
    
    private static int numPizzasOrdered=0;
    private static int numHoagiesOrdered=0;
    private static int numBreadSticksOrdered=0;
    
    private static int pizzaInStock=50;
    private static int hoagieInStock= 30;
    private static int breadSticksInStock= 20;
    
    public static void main(String[]args){
        introduction();
        takeOrder();
    }//close main method
    
    public static void takeOrder(){
        Scanner inputScanner= new Scanner(System.in);
        int userOrder= inputScanner.nextInt();
        switch(userOrder){
            case 1:
                System.out.println("How many pizzas would you like to order?");
                int userPizzaOrdered= inputScanner.nextInt();
                orderPizza(userPizzaOrdered);
                printOrders();
                introduction();
                takeOrder();
                break;
            case 2:
                System.out.println("How many hoagies would you like to order?");
                int userHoagieOrdered= inputScanner.nextInt();
                orderHoagie(userHoagieOrdered);
                printOrders();
                introduction();
                takeOrder();
                break;
            case 3:
                System.out.println("How many orders of bread sticks would you like to order?");
                int userBreadSticksOrdered= inputScanner.nextInt();
                orderBreadStick(userBreadSticksOrdered);
                printOrders();
                introduction();
                takeOrder();
                break;
            case 4:
                printInventory();
                introduction();
                takeOrder();
                break;
            case 5:
                newOrder();
                introduction();
                takeOrder();
                break;
            case 6:
                printTotalOrders();
                introduction();
                takeOrder();
                break;
            case 7:
                printOrders();
                introduction();
                takeOrder();
                break;
            default:
                System.out.println("If more orders needed to be entered, please follow the prompts next time");
                System.out.println("********FINAL ORDER**********");
                printOrders();
                System.out.println("********FINAL INVENTORY********");
                printInventory();
        }//close switch
    }//close takeOrder method
    
    public static void introduction(){
        System.out.println("Press 1 then enter to order pizza.");
        System.out.println("Press 2 then enter to order hoagies.");
        System.out.println("Press 3 then enter to order bread sticks.");
        System.out.println("Press 4 to see inventory.");
        System.out.println("Press 5 then enter if you are finished with your order and wish to start a new order.");
        System.out.println("Press 6 to see total amount ordered.");
        System.out.println("Press 7 to see the current order amounts.");
        System.out.println("Press 8 then enter to exit.");
    }//close introduction method
    
    public static void newOrder(){
        System.out.println("***********Order Complete**********");
        printOrders();
        numPizzasOrdered=0;
        numHoagiesOrdered=0;
        numBreadSticksOrdered=0;
        System.out.println("***********Begin New Order*********");
    }//close newOrder method
    
    public static void printOrders(){
        System.out.println("*********Current Order**********");
        System.out.println("Current pizzas ordered: "+numPizzasOrdered);
        System.out.println("Current Hoagies ordered: "+numHoagiesOrdered);
        System.out.println("Current orders of Bread sticks ordered: "+numBreadSticksOrdered);
        System.out.println("********************************");
    }//close printOrders method
    
    public static void printTotalOrders(){
        System.out.println("*********Total Ordered**********");
        System.out.println("Total pizzas ordered: "+totalPizzasOrdered);
        System.out.println("Total Hoagies ordered: "+totalHoagiesOrdered);
        System.out.println("Total Bread sticks ordered: "+totalBreadSticksOrdered);
        System.out.println("********************************");
    }
    
        public static void printInventory(){
        System.out.println("*********Inventory Totals**********");
        System.out.println("Total pizzas in stock: "+pizzaInStock);
        System.out.println("Total Hoagies in stock: "+hoagieInStock);
        System.out.println("Total Bread sticks in stock: "+breadSticksInStock);
        System.out.println("********************************");
    }//close printOrders method
    
    public static void orderPizza(int pizzasOrdered){
        if(pizzaInStock-pizzasOrdered>=0){
        System.out.println(pizzasOrdered+ " pizzas coming right up!");
        numPizzasOrdered= numPizzasOrdered+pizzasOrdered;
        totalPizzasOrdered= totalPizzasOrdered+pizzasOrdered;
        pizzaInStock= pizzaInStock-pizzasOrdered;
        }//close if
        else if(pizzaInStock-pizzasOrdered<0){
            System.out.println("This order can not be completed!\nThere are only "+pizzaInStock+" pizzas remaining");
        }//close else if
    }//close orderPizza method
    
    public static void orderHoagie(int hoagiesOrdered){
        if(hoagieInStock-hoagiesOrdered>=0){
        System.out.println(hoagiesOrdered+" hoagies coming right up!");
        numHoagiesOrdered= numHoagiesOrdered+ hoagiesOrdered;
        totalHoagiesOrdered= totalHoagiesOrdered+ hoagiesOrdered;
        hoagieInStock= hoagieInStock-hoagiesOrdered;
        }//close if
        else if(hoagieInStock-hoagiesOrdered<0){
            System.out.println("This order can not be completed!\nThere are only "+hoagieInStock+" hoagies remaining.");
        }//close else if
    }//close orderHoagie method
    
    public static void orderBreadStick(int breadSticksOrdered){
        
        
        if(breadSticksInStock-breadSticksOrdered>=0){
            System.out.println(breadSticksOrdered+" orders of bread sticks coming right up!");
            numBreadSticksOrdered= numBreadSticksOrdered+ breadSticksOrdered;
            totalBreadSticksOrdered= totalBreadSticksOrdered+ breadSticksOrdered;
            breadSticksInStock= breadSticksInStock-breadSticksOrdered;
        }//close if
        else if(breadSticksInStock-breadSticksOrdered<0){
            System.out.println("This order can not be completed!\nThere are only "+breadSticksInStock+" orders of bread sticks remaining.");
        }//close else if
    }//close orderBreadStick method
}//close class
