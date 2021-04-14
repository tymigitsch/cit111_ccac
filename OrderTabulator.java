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
    //3 variables for total amounts
    private static int totalPizzasOrdered= 0;
    private static int totalHoagiesOrdered= 0;
    private static int totalBreadSticksOrdered=0;
    //3 variables for current totals
    private static int numPizzasOrdered=0;
    private static int numHoagiesOrdered=0;
    private static int numBreadSticksOrdered=0;
    //3 variables for remaining inventory
    private static int pizzaInStock=50;
    private static int hoagieInStock= 30;
    private static int breadSticksInStock= 20;
    
    //main method used to run other methods
    public static void main(String[]args){
        introduction();
        takeOrder();
    }//close main method
    //takeOrder method's job is to take the user's input and run specific methods depending on that input
    public static void takeOrder(){
        //new scanner object
        Scanner inputScanner= new Scanner(System.in);
        int userOrder= inputScanner.nextInt();
        //switch runs whichever option the user chooses
        switch(userOrder){
            case 1:
                //takes user inputted amount of pizzas ordered and runs the corrosponding methods
                System.out.println("How many pizzas would you like to order?");
                int userPizzaOrdered= inputScanner.nextInt();
                orderPizza(userPizzaOrdered);
                printOrders();
                introduction();
                takeOrder();
                break;
                
            case 2:
                //takes user inputted amount of hoagies ordered and runs the corrosponding methods
                System.out.println("How many hoagies would you like to order?");
                int userHoagieOrdered= inputScanner.nextInt();
                orderHoagie(userHoagieOrdered);
                printOrders();
                introduction();
                takeOrder();
                break;

            case 3:
                //takes user inputted amount of bread sticks ordered and runs the corrosponding methods
                System.out.println("How many orders of bread sticks would you like to order?");
                int userBreadSticksOrdered= inputScanner.nextInt();
                orderBreadStick(userBreadSticksOrdered);
                printOrders();
                introduction();
                takeOrder();
                break;
            case 4:
                //prints the current inventory
                printInventory();
                introduction();
                takeOrder();
                break;
            case 5:
                //shows the old order's totals, then sets current order variables to 0
                newOrder();
                introduction();
                takeOrder();
                break;
            case 6:
                //shows total amount ordered
                printTotalOrders();
                introduction();
                takeOrder();
                break;
            case 7:
                //shows current order amounts
                printOrders();
                introduction();
                takeOrder();
                break;
            default:
                //shows final order's amounts, what is left in inventory, and total amount ordered this session
                System.out.println("If more orders needed to be entered, please follow the prompts next time");
                System.out.println("********FINAL ORDER**********");
                printOrders();
                System.out.println("********FINAL INVENTORY********");
                printInventory();
                printTotalOrders();
        }//close switch
    }//close takeOrder method
    //introduction method's job is to print the user's input choices
    public static void introduction(){
        //prompts user for input
        System.out.println("Press 1 then enter to order pizza.");
        System.out.println("Press 2 then enter to order hoagies.");
        System.out.println("Press 3 then enter to order bread sticks.");
        System.out.println("Press 4 to see inventory.");
        System.out.println("Press 5 then enter if you are finished with your order and wish to start a new order.");
        System.out.println("Press 6 to see total amount ordered.");
        System.out.println("Press 7 to see the current order amounts.");
        System.out.println("Press 8 then enter to exit.");
    }//close introduction method
    //newOrder method's job is to run printOrders and set the current order class variables to 0
    public static void newOrder(){
        System.out.println("***********Order Complete**********");
        printOrders();
        numPizzasOrdered=0;
        numHoagiesOrdered=0;
        numBreadSticksOrdered=0;
        System.out.println("***********Begin New Order*********");
    }//close newOrder method
    //printOrders method's job is to show the current items for the current order
    public static void printOrders(){
        System.out.println("*********Current Order**********");
        System.out.println("Current pizzas ordered: "+numPizzasOrdered);
        System.out.println("Current Hoagies ordered: "+numHoagiesOrdered);
        System.out.println("Current orders of Bread sticks ordered: "+numBreadSticksOrdered);
        System.out.println("********************************");
    }//close printOrders method
    //printTotalOrders method's job is to print the total amount of items ordered so far
    public static void printTotalOrders(){
        System.out.println("*********Total Ordered**********");
        System.out.println("Total pizzas ordered: "+totalPizzasOrdered);
        System.out.println("Total Hoagies ordered: "+totalHoagiesOrdered);
        System.out.println("Total Bread sticks ordered: "+totalBreadSticksOrdered);
        System.out.println("********************************");
    }
    //printInventory method's job is to print the remaining amount of items in inventory
    public static void printInventory(){
        System.out.println("*********Inventory Totals**********");
        System.out.println("Total pizzas in stock: "+pizzaInStock);
        System.out.println("Total Hoagies in stock: "+hoagieInStock);
        System.out.println("Total Bread sticks in stock: "+breadSticksInStock);
        System.out.println("********************************");
    }//close printOrders method
    //orderPizza method's job is to determine if the amount ordered is possible compared to the remaining inventory
    //and then add to the current and total order variables while subtracting from inventory if it's possible
    //if not possible it will simply print a warning message
    public static void orderPizza(int pizzasOrdered){
        //if the amount left after subtracting what is ordered equals 0 or higher the order can be completed
        if(pizzaInStock-pizzasOrdered>=0){
        System.out.println(pizzasOrdered+ " pizzas coming right up!");
        numPizzasOrdered= numPizzasOrdered+pizzasOrdered;
        totalPizzasOrdered= totalPizzasOrdered+pizzasOrdered;
        pizzaInStock= pizzaInStock-pizzasOrdered;
        }//close if
        //if the amount of inventory is below 0 after subtracting the amount from the order, the order can not be fulfilled
        else if(pizzaInStock-pizzasOrdered<0){
            System.out.println("This order can not be completed!\nThere are only "+pizzaInStock+" pizzas remaining");
        }//close else if
    }//close orderPizza method
    //orderHoagie method's job is the same as orderPizza, but with hoagies
    public static void orderHoagie(int hoagiesOrdered){
        //if the amount left after subtracting what is ordered equals 0 or higher the order can be completed
        if(hoagieInStock-hoagiesOrdered>=0){
        System.out.println(hoagiesOrdered+" hoagies coming right up!");
        numHoagiesOrdered= numHoagiesOrdered+ hoagiesOrdered;
        totalHoagiesOrdered= totalHoagiesOrdered+ hoagiesOrdered;
        hoagieInStock= hoagieInStock-hoagiesOrdered;
        }//close if
        //if the amount of inventory is below 0 after subtracting the amount from the order, the order can not be fulfilled
        else if(hoagieInStock-hoagiesOrdered<0){
            System.out.println("This order can not be completed!\nThere are only "+hoagieInStock+" hoagies remaining.");
        }//close else if
    }//close orderHoagie method
    //orderBreadStick method's job is the same as orderPizza and orderHoagie, but with bread sticks
    public static void orderBreadStick(int breadSticksOrdered){
        
        //if the amount left after subtracting what is ordered equals 0 or higher the order can be completed
        if(breadSticksInStock-breadSticksOrdered>=0){
            System.out.println(breadSticksOrdered+" orders of bread sticks coming right up!");
            numBreadSticksOrdered= numBreadSticksOrdered+ breadSticksOrdered;
            totalBreadSticksOrdered= totalBreadSticksOrdered+ breadSticksOrdered;
            breadSticksInStock= breadSticksInStock-breadSticksOrdered;
        }//close if
        //if the amount of inventory is below 0 after subtracting the amount from the order, the order can not be fulfilled
        else if(breadSticksInStock-breadSticksOrdered<0){
            System.out.println("This order can not be completed!\nThere are only "+breadSticksInStock+" orders of bread sticks remaining.");
        }//close else if
    }//close orderBreadStick method
}//close class
