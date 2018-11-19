import java.util.*;
public class Cat {
    String name;
    double weight;
    String[] nameList = {"Garfield", "Fat kitty cat", "Lasaga", "Sylvester","Absolute Unit", "Real Chonker", "His arrival was inevitable", "Tom", "Rita"}; 

    String getName(){ //gets the cat's name
        return name;
    }

    void userSetName(){ //lets the user set the cat's name
        Scanner input = new Scanner(System.in);
        System.out.print("Would you like to come up with a name for this cat?");
        String userAnswer = input.nextLine();
        //If the user says something like yea, yee, yes, etc it will let them name
        if (userAnswer.toLowerCase().contains("ye")){
            System.out.println("Alright, what would you like to name him?");
            name = input.nextLine(); //Name becomes user input
        }
        else if (userAnswer.toLowerCase().contains("n")){
            System.out.println("Gotchya, I'll name it myself.");
            //randomly picks name from nameList array
            name = nameList[(int)(Math.random()*9)];
        }
        else{
            System.out.println("I didn't get that, so I'll assume you don't want to");
            //Same as no, but with different text
            name = nameList[(int)(Math.random()*9)];
        }
    }

    double getWeight(){ //gets the cat's weight
        return weight;
    }

    void setWeight(double newWeight){ //sets the cat's weight
        weight = newWeight;
    }

    //empty cat constructor
    Cat(){        
    }
    //overloaded cat constructor to assign name
    Cat(String newName){
        name = newName;
    }

    void meow(){
        //(int) casts it to an integer, meowChance can be 1, 2, 3, or 4
        int meowChance = (int)(Math.random() * 4) + 1;
        //One in four chance to do the new code
        if (meowChance == 4){
            System.out.println("Bork");
        }
        else {
            //Only does the weight-meow if the weight is given
            if (weight>0 && weight < 20){
                //Figures out how many o's to put
                int meowConversion = (int)(weight/2);
                System.out.print("Me");
                //Actually prints out the o's
                for (int i = 0; i != meowConversion; i++) {
                    System.out.print("o");
                }
                System.out.println("w");
            }
            else { //if the weight isn't given
                System.out.println("Meow");
            }
        }        
    }
}
