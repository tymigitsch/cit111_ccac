/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT111_final_fishtank;
import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
/**
 *
 * @author Tyler Migitsch
 */
public class  FishTank {
    //new scanner object for whole class
    static Scanner fishScan= new Scanner(System.in);
    
    //variable later used to store fish choice
    private static int menuChoice;
    
    //main method used to run other methods and create fish objects
    public static void main(String[]args) throws IOException{
        //new fish objects
        Fish betta= new Fish();
        Fish goldfish= new Fish();
        Fish guppie= new Fish();
        Fish mollie= new Fish();
        Fish swordtail= new Fish();
        //runs various methods
        generateFishVariables(betta,goldfish,guppie, mollie, swordtail);
        introduction();
        menu();
        doMainOption(betta,goldfish,guppie,mollie,swordtail);
    }//close main method
    
    //method introduces program and prompts user for the fish tank size
    public static  void introduction(){
        System.out.println("*****Fish Tank Simulator*****");
        System.out.println("Welcome!\n"
                + "You have 1 of each type of fish, Betta, Goldfish,"
                + " Guppie, Mollie, and Swordtail.\n"
                + "All of them are currently in their own seperate bowls.");
    }//close introduction method
    
    //method to print main menu options
    public static void menu(){
        //new String array for menu options
        String [] options= new String[7];
        options[0]= "1: Interact with Betta fish\n";
        options[1]= "2: Interact with Goldfish\n";
        options[2]= "3: Interact with Guppie fish\n";
        options[3]= "4: Interact with Mollie fish\n";
        options[4]= "5: Interact with Swordtail fish\n";
        options[5]= "6: Check on all fish\n";
        options[6]= "7: Exit program";
        System.out.println("********Menu********");
        System.out.println("Please select an option 1-7 and hit enter.");
        System.out.println(options[0]+options[1]+options[2]+options[3]+
                options[4]+options[5]+options[6]);
    }//close menu method
    
    //method to print subMenu options
    public static void subMenu(){
        //new String array for subMenu options
        String [] subOptions= new String[7];
        subOptions[0]= "1: Name your fish\n";
        subOptions[1]= "2: Put fish in tank\n";
        subOptions[2]= "3: Put fish in personal bowl\n";
        subOptions[3]= "4: Feed fish\n";
        subOptions[4]= "5: Take fish for a walk\n";
        subOptions[5]= "6: Check on fish\n";
        subOptions[6]= "7: Return to main menu\n";
        System.out.println("********Sub Menu********");
        System.out.println("Please select an option 1-7 and hit enter.");
        System.out.println(subOptions[0]+subOptions[1]+subOptions[2]
                +subOptions[3]+subOptions[4]+subOptions[5]+subOptions[6]);
    }//close subMenu method

    //take user input at main menu and runs specified methods depending on input
    public static void doMainOption(Fish betta, Fish goldfish, Fish guppie,
            Fish mollie, Fish swordtail) throws IOException{
      //stores getInput("") value in userOption, then stores value in menuChoice
        int userOption=getInput("");
         FishTank.menuChoice=userOption;
        //switch statement runs whichever option is chosen
        switch(userOption){
            case 1:
            System.out.println("Interacting with betta");
            //opens subMenu and runs doSubOption
            subMenu();
                doSubOption(betta,goldfish,guppie,mollie,swordtail);
                break;
            case 2:
               System.out.println("Interacting with goldfish");
               subMenu();
                doSubOption(betta,goldfish,guppie,mollie,swordtail);
                break;
            case 3:
             System.out.println("Interacting with guppie");
             subMenu();
                doSubOption(betta,goldfish,guppie,mollie,swordtail);
                break;
            case 4:
             System.out.println("Interacting with mollie");
             subMenu();
                doSubOption(betta,goldfish,guppie,mollie,swordtail);
                break;
            case 5:
                System.out.println("Interacting with swordtail");
                subMenu();
                doSubOption(betta,goldfish,guppie,mollie,swordtail);
                break;
            case 6:
                //displays all fish statuses and reopens main menu
                allFishStatus(betta,goldfish,guppie,mollie,swordtail);
                menu();
                doMainOption(betta,goldfish,guppie,mollie,swordtail);
                break;
            case 7:
                //exits program
                break;
            default:
                //displays all statuses,then prints message
                allFishStatus(betta,goldfish,guppie,mollie,swordtail);
                System.out.println("If you were not finished, please follow the"
                        + " prompts next time");
                break;
        }//closes switch
    }//close doMainOption method
  
    //similar to doMainOption, but with subMenu and with specific fish
    //take user input at main menu and runs specified methods depending on input
    public static void doSubOption(Fish betta, Fish goldfish, Fish guppie,
            Fish mollie, Fish swordtail) throws IOException{
        int userOption=getInput("");
        //whichFish's value depends on what the user chose on the main menu
        String whichFish="";
        switch(menuChoice){
            case 1:
                whichFish="betta";
                break;
            case 2:
                whichFish="goldfish";
                break;
            case 3:
                whichFish="guppie";
                break;
            case 4:
                whichFish="mollie";
                break;
            case 5:
                whichFish="swordtail";
                break;
        }//close menuChoice switch
        //switch statement runs whichever option is chosen
        switch(userOption){
            case 1:
                System.out.println("What would you like to name your "+
                        whichFish+"?");
            //following switch to name specifc fish based on whichFish
            switch (whichFish) {
                case "betta":
                    betta.name=fishScan.next();
                    break;
            
                case "goldfish":
                    goldfish.name=fishScan.next();
                    break;
            
                case "guppie":
                    guppie.name=fishScan.next();
                    break;
            
                case "mollie":
                    mollie.name=fishScan.next();
                    break;
            
                case "swordtail":
                    swordtail.name=fishScan.next();
                    break;
                default:
                    break;
            }//close switch
                subMenu();
                doSubOption(betta,goldfish,guppie,mollie,swordtail);
                break;
            case 2:
                //puts chosen fish in tank and reopens submenu
            switch (whichFish) {
          
                case "betta":
                    betta.putInTank();
                    break;
            
                case "goldfish":
                    goldfish.putInTank();
                    break;
            
                case "guppie":
                    guppie.putInTank();
                    break;
            
                case "mollie":
                    mollie.putInTank();
                    break;
            
                case "swordtail":
                    swordtail.putInTank();
                    break;
                default:
                    break;
            }//close switch
                subMenu();
                doSubOption(betta,goldfish,guppie,mollie,swordtail);
                break;

            case 3:
            switch (whichFish) {
          //takes chosen fish out of tank
                case "betta":
                    betta.takeOutOfTank();
                    break;
            
                case "goldfish":
                    goldfish.takeOutOfTank();
                    break;
            
                case "guppie":
                    guppie.takeOutOfTank();
                    break;
            
                case "mollie":
                    mollie.takeOutOfTank();
                    break;
            
                case "swordtail":
                    swordtail.takeOutOfTank();
                    break;
                default:
                    break;
            }
                subMenu();
                doSubOption(betta,goldfish,guppie,mollie,swordtail);
                break;

            case 4:
            switch (whichFish) {
          //feeds chosen fish
                case "betta":
                    betta.feedFish();
                    break;
            
                case "goldfish":
                    goldfish.feedFish();
                    break;
            
                case "guppie":
                    guppie.feedFish();
                    break;
            
                case "mollie":
                    mollie.feedFish();
                    break;
            
                case "swordtail":
                    swordtail.feedFish();
                    break;
                default:
                    break;
            }
                subMenu();
                doSubOption(betta,goldfish,guppie,mollie,swordtail);
                break;

            case 5:
            switch (whichFish) {
          //attempts to walk chosen fish
                case "betta":
                    betta.walkFish();
                    break;
            
                case "goldfish":
                    goldfish.walkFish();
                    break;
            
                case "guppie":
                    guppie.walkFish();
                    break;
            
                case "mollie":
                    mollie.walkFish();
                    break;
            
                case "swordtail":
                    swordtail.walkFish();
                    break;
                default:
                    break;
            }
                subMenu();
                doSubOption(betta,goldfish,guppie,mollie,swordtail);
                break;

            case 6:
            switch (whichFish) {
            //gets chosen fish's status
                case "betta":
                    bettaFishStatus(betta);
                    break;
            
                case "goldfish":
                    goldfishFishStatus(goldfish);
                    break;
            
                case "guppie":
                    guppieFishStatus(guppie);
                    break;
            
                case "mollie":
                    mollieFishStatus(mollie);
                    break;
            
                case "swordtail":
                    swordtailFishStatus(swordtail);
                    break;
                default:
                    break;
            }
                subMenu();
                doSubOption(betta,goldfish,guppie,mollie,swordtail);
                break;
            //brings you back to main menu
            case 7:
                menu();
                doMainOption(betta,goldfish,guppie,mollie,swordtail);
                break;
            default:
                allFishStatus(betta,goldfish,guppie,mollie,swordtail);
                System.out.println("If you were not finished, please follow the"
                        + " prompts next time");
        }//closes switch
    }//close doSubOption method
    
    //method to print all fish objects' variables
    public static void allFishStatus(Fish betta, Fish goldfish, Fish guppie,
            Fish mollie, Fish swordtail){
        System.out.println("******Status******");
        System.out.println("***"+betta.name+" the betta's status***"
                + "\nBetta in tank: "+betta.getInTank()+"\nBetta alive: "
                +betta.getFishAlive()+"\nBetta's color: "+betta.getColor()
                +"\nThe Betta is male: "+betta.getMale()+"\nBetta has been fed "+
                betta.getFishFed()+" times");
        System.out.println("***"+goldfish.name+" the goldfish's status***"
                + "\nGoldfish in tank: "+goldfish.getInTank()+"\nGoldfish alive: "
                +goldfish.getFishAlive()+"\nGoldfish's color: "+goldfish.getColor()
                +"\nThe Goldfish is male: "+goldfish.getMale()+"\nGoldfish has been fed "+
                goldfish.getFishFed()+" times");
        System.out.println("***"+guppie.name+" the guppie's status***"
                + "\nGuppie in tank: "+guppie.getInTank()+"\nGuppie alive: "
                +guppie.getFishAlive()+"\nGuppie's color: "+guppie.getColor()
                +"\nThe Guppie is male: "+guppie.getMale()+"\nGuppie has been fed "+
                guppie.getFishFed()+" times");
        System.out.println("***"+mollie.name+" the mollie's status***"
                + "\nMollie in tank: "+mollie.getInTank()+"\nMollie alive: "
                +mollie.getFishAlive()+"\nMollie's color: "+mollie.getColor()
                +"\nThe Mollie is male: "+mollie.getMale()+"\nMollie has been fed "+
                mollie.getFishFed()+" times");
        System.out.println("***"+swordtail.name+" the swordtail's status***"
                + "\nSwordtail in tank: "+swordtail.getInTank()+"\nSwordtail alive: "
                +swordtail.getFishAlive()+"\nSwordtail's color: "+swordtail.getColor()
                +"\nThe Swordtail is male: "+swordtail.getMale()+"\nSwordtail has been fed "+
                swordtail.getFishFed()+" times");
        System.out.println("*********************");
    }//close method
    
    //method to print betta fish object's variables
        public static void bettaFishStatus(Fish betta){
        System.out.println("******Status******");
        System.out.println("***"+betta.name+" the betta's status***"
                + "\nBetta in tank: "+betta.getInTank()+"\nBetta alive: "
                +betta.getFishAlive()+"\nBetta's color: "+betta.getColor()
                +"\nThe Betta is male: "+betta.getMale()+"\nBetta has been fed "+
                betta.getFishFed()+" times");
        System.out.println("*********************");
    }//close method
            //method to print betta fish object's variables
        public static void goldfishFishStatus(Fish goldfish){
        System.out.println("******Status******");
        System.out.println("***"+goldfish.name+" the goldfish's status***"
                + "\nGoldfish in tank: "+goldfish.getInTank()+"\nGoldfish alive: "
                +goldfish.getFishAlive()+"\nGoldfish's color: "+goldfish.getColor()
                +"\nThe Goldfish is male: "+goldfish.getMale()+"\nGoldfish has been fed "+
                goldfish.getFishFed()+" times");
        System.out.println("*********************");

    }//close method        
            //method to print guppie fish object's variables
        public static void guppieFishStatus(Fish guppie){
        System.out.println("******Status******");
        System.out.println("***"+guppie.name+" the guppie's status***"
                + "\nGuppie in tank: "+guppie.getInTank()+"\nGuppie alive: "
                +guppie.getFishAlive()+"\nGuppie's color: "+guppie.getColor()
                +"\nThe Guppie is male: "+guppie.getMale()+"\nGuppie has been fed "+
                guppie.getFishFed()+" times");
        System.out.println("*********************");
    }//close method
            //method to print mollie fish object's variables
        public static void mollieFishStatus(Fish mollie){
        System.out.println("******Status******");
        System.out.println("***"+mollie.name+" the mollie's status***"
                + "\nMollie in tank: "+mollie.getInTank()+"\nMollie alive: "
                +mollie.getFishAlive()+"\nMollie's color: "+mollie.getColor()
                +"\nThe Mollie is male: "+mollie.getMale()+"\nMollie has been fed "+
                mollie.getFishFed()+" times");
        System.out.println("*********************");
    }//close method
        //method to print betta fish object's variables
        public static void swordtailFishStatus(Fish swordtail){
        System.out.println("******Status******");
        System.out.println("***"+swordtail.name+" the swordtail's status***"
                + "\nSwordtail in tank: "+swordtail.getInTank()+"\nSwordtail alive: "
                +swordtail.getFishAlive()+"\nSwordtail's color: "+swordtail.getColor()
                +"\nThe Swordtail is male: "+swordtail.getMale()+"\nSwordtail has been fed "+
                swordtail.getFishFed()+" times");
        System.out.println("*********************");
    }//close method
    
//method to get user input from the keyboard, inspired by Carey Brown's
    //comments on this forum https://coderanch.com/t/691813/java/Loop-program-user-input
    //also by sweet suman's response on this forum
    //https://stackoverflow.com/questions/58368886/how-to-stop-program-from-crashing
    //and this forum
    //https://www.dreamincode.net/forums/topic/334155-stop-my-program-from-crashing-when-wrong-input-string-instead-of-int/
    //prompts the user for input and checks if the input is an int, if not
    //an error message appears and the user is asked the prompt again
    private static int getInput(String prompt)throws IOException{
        int input = 0;
        boolean validInput=false;
        while(!validInput)
        {
            System.out.println(prompt);
            try{
            input= fishScan.nextInt();
            validInput=true;
            }//close try
            catch(InputMismatchException e){
                System.out.println("Input is not a number, please try again");
                fishScan.next();
            }//close catch
        }//close while
        return input;
    }//close method

    //method generates fish objects' colors and genders
    public static void generateFishVariables(Fish betta, Fish goldfish, Fish guppie,
            Fish mollie, Fish swordtail){
        betta.generateColor();
        betta.getGender();
        betta.type="betta";
        goldfish.generateColor();
        goldfish.getGender();
        goldfish.type="goldfish";
        guppie.generateColor();
        guppie.getGender();
        guppie.type="guppie";
        mollie.generateColor();
        mollie.getGender();
        mollie.type="mollie";
        swordtail.generateColor();
        swordtail.getGender();
        swordtail.type="swordtail";
    }//close generateFishVariables method
}//close class