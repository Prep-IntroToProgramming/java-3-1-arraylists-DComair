
public class Cat {
    String name;
    double weight;
    
    String getName(){
        return name;
    }
    
    double getWeight(){
        return weight;
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
