
public class Cat {
    String name;
    double weight;

    String getName(){ //gets the cat's name
        return name;
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
            System.out.println("Meow");
        }        
    }
}
