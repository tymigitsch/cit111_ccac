/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT111_final_fishtank;
import java.util.Random;
/**
 *
 * @author Tyler Migitsch
 */
public class Fish {
    //declaring and initializing variables
    public String name="";
    public String type="";
    private String color="";
    private int fishFed=0;
    private boolean male=false;
    private boolean fishAlive=true;
    private boolean inTank=false;
    
    //new random object
    Random rand= new Random();
    
    //method randomizes fish colors between 4 colors
    public String generateColor(){
        //randomizing number 0-3 stored in x
        int x=rand.nextInt(4);
        switch (x) {
            case 0:
                color="Red";
                return color;

            case 1:
                color="Blue";
                return color;

            case 2:
                color="Yellow";
                return color;

            case 3:
                color="Green";
                return color;
            default:
                color="";
                return color;
        }//close switch
    }//close method generateColor
    //make method randomizes fish gender
    public boolean getGender(){
        //randomizes int 0-1, 0=female, 1=male
        int gender=rand.nextInt(2);
        if(gender==0){
            male=false;
            return male;
        }//close if
        else if(gender==1){
            male=true;
            return male;
        }//close if
        return male;
    }//close method
    //method checks if fish is alive then adds 1 to fishFed counter and has
    //various outputs depending on the counter value
    public void feedFish(){
        //checks if fish is alive to be fed
        if(fishAlive==true){
            //iterates counter
            fishFed= fishFed+1;
            System.out.println("Here fishy fishy...");
            //if name is empty or null runs this block
            if(name==null||name==""){
                //if counter is 0-3 displays this
                if(fishFed>0 &&fishFed<=3){
                System.out.println("You have fed this fish "+fishFed+" times.");
                }//close nested if
                //if counter =4 displays regular msg+ warning
                else if(fishFed==4){
                    System.out.println("You have fed this fish "+fishFed+" times.");
                    System.out.println("Maybe I should stop feeding this fish"
                            + "...it has eaten enough");
                }//close else if
                //if counter>=5 the fish dies and fishAlive=false
                else if(fishFed>=5){
                    System.out.println("OH NO!!!!\nThis fishy has died"
                            + " from overfeeding!");
                    fishAlive= false;
                }//close else if
            }//close if null or empty name
            //if name is not null or empty runs this block, same as
            //above but the fish's name is shown
            else if(name!=null||name!=""){
                if(fishFed>0 &&fishFed<=3){
                    System.out.println("You have fed "+name+" "+fishFed+" times.");
                }//close if
            else if(fishFed==4){
                System.out.println("You have fed "+name+" "+fishFed+" times.");
                System.out.println("Maybe I should stop feeding "+name
                        +"...has eaten enough");
            }//close else if
            else if(fishFed>=5){
                System.out.println("OH NO!!!!\n"+name+" has died from overfeeding!");
                fishAlive= false;
            }//close else if
            }//close if not null
        }//close if fishAlive
        //if the fish was already dead, display this msg
        else if(fishAlive==false){
            System.out.println("That fishy can't eat anymore...it's dead");
        }//close else if fishAlive
    }//close method feedFish
    
    //method to take fish on a walk
    public void walkFish(){
        //checks if fish is alive
        if(fishAlive==true){
            //if fish is in the tank run this block
            if(inTank==true){
                System.out.println("You can't walk it around in the tank!"
                        + " (try putting it in the bowl)");
            }//close if inTank=true
            //if fish is not in tank run this block
            else if(inTank==false){
                //if name isn't null or empty run this
                if(name!=null&&name!=""){
                    System.out.println("Taking "+name+" for a walk...\n"
                        + "phew... that was tiring");
                }//close nested if
                //if name is null or empty run this
                else if(name==null||name==""){
                    System.out.println("Taking fishy for a walk...\n"
                        + "phew...that was tiring");
                }//close nested else if
            }//close else if inTank=false
        }//close if fishAlive
        //if fish is dead runs this
        else if(fishAlive!=true){
                System.out.println("This fish has already walked its last walk..."
                    + "\n(the fishy is dead)");
        }//close if fishAlive
    }//close method walkFish
    
    //method to add fish to fish tank aka inTank true, different outputs if
    //the fish has a name or not
    public void putInTank(){
        //if fish not already in tank
        if(inTank==false){
            //if name not null/empty
            if(name!=null&&name!=""){
                System.out.println("Putting "+name+" in the tank...SPLASH");
                inTank=true;
            }//close nested if
            else{
                System.out.println("Putting the fishy in the tank...SPLASH");
                inTank=true;
            }//close else
        }//close if
        //if fish already in tank
        else if(inTank==true){
            //if name null or empty
            if(name==null||name==""){
                System.out.println("This fish is already in the tank");
            }//close if
            else{
                System.out.println(name+" is in the tank already");
            }//close else if
        }//close else
    }//close method
    
    //method to put fish in bowl aka inTank false, different outputs depending
    //on if the fish has a name or not
    public void takeOutOfTank(){
        //if not in tank and has no name
        if(inTank==false&&(name==null||name=="")){
                System.out.println("This fish is already in the bowl");
            }//close if
        //if not in tank and has name
        else if(inTank==false&&(name!=null||name=="")){
                System.out.println(name+" is already in the bowl");
            }//close if
        //if in tank and no name
        else if(inTank==true&&(name!=null||name=="")){
            System.out.println("Taking "+name+" out of the tank"
                + " and back into his bowl...SPLASH");
            inTank=false;
        }//closes if
        //if in tank and has name
        else if(inTank==true&&(name==null||name=="")){
            System.out.println("Taking the fishy out of the tank"
                    + "and back into his bowl...SPLASH");
            inTank=false;
        }//closes if
    }//closes method
    
    //the following methods are getters for private variables
    public boolean getFishAlive(){
        return fishAlive;
    }//close method
    public boolean getInTank(){
        return inTank;
    }//close method
    public int getFishFed(){
        return fishFed;
    }
    public boolean getMale(){
        return male;
    }
    public String getColor(){
        return color;
    }
}//close class Fish
