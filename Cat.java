
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
        System.out.println("Meow");
    }
}
