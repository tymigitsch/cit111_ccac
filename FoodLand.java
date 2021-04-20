/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects1;

/**
 *
 * @author Tyler
 */
public class FoodLand {
    public static void main(String[]args){
        
        Donut glazed;
        glazed= new Donut();
        glazed.name= "Glazed";
        
        Salad house;
        house= new Salad();
        house.name= "House";
        house.containsNuts= false;
        house.lettuceType= "Iceberg";
        house.vegetarian= false;
        
        Burger whopper;
        whopper= new Burger();
        whopper.name= "Whopper";
        whopper.temperature= "medium-well";
        whopper.numPatties= 2;
        whopper.includeSteakSauce= false;
        
        getDonutData(glazed);
        getSaladData(house);
        getBurgerData(whopper);
        
        glazed.simulateEating(25);
        glazed.getPercRemaining();
        
        house.eatSalad(40);
        house.addMeat();
        
        whopper.eatBurger(70);
        whopper.addSteakSauce();
        
        getDonutData(glazed);
        getSaladData(house);
        getBurgerData(whopper);
    }//close main method
    
    public static void getDonutData(Donut inputDonut){
        System.out.println("------STATS-------");
        System.out.println("Name: "+inputDonut.name);
        System.out.println("PercRemaining: "+inputDonut.percRemaining);
        System.out.println("------------------");
    }//close method
        public static void getSaladData(Salad inputSalad){
        System.out.println("------STATS-------");
        System.out.println("Name: "+inputSalad.name);
        System.out.println("PercRemaining: "+inputSalad.percRemaining);
        System.out.println("Contains Nuts: "+inputSalad.containsNuts);
        System.out.println("Lettuce Type: "+inputSalad.lettuceType);
        System.out.println("Vegetarian: "+inputSalad.vegetarian);
        System.out.println("------------------");
    }//close method
            public static void getBurgerData(Burger inputBurger){
        System.out.println("------STATS-------");
        System.out.println("Name: "+inputBurger.name);
        System.out.println("PercRemaining: "+inputBurger.percRemaining);
        System.out.println("Temperature: "+inputBurger.temperature);
        System.out.println("Number of Patties: "+inputBurger.numPatties);
        System.out.println("Steak Sauce Included: "+inputBurger.includeSteakSauce);
        System.out.println("------------------");
    }//close method
}//close class
