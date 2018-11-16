import java.util.*; //needed for arrayList

public class TestCatList {
    public static void main(String[] args){
        ArrayList<Cat> catList = new ArrayList(); //makes list of cat objects
        
        //Adds each one individually
        catList.add(new Cat("Tom"));
        catList.add(new Cat("Sylvester"));
        catList.add(new Cat("Garfield"));
        catList.add(new Cat("Rita"));
        
        for (Cat currentCat: catList){
            //uses setter function and rng to make weight
            currentCat.setWeight(Math.random()*10+5);
        }
        
        for (Cat currentCat: catList){
            //Lets user set each cat's name
            currentCat.userSetName();
        }
        //Goes through every cat's name and weight and has them meow
        for (Cat currentCat: catList) {
            System.out.println(currentCat.getName() + " weighs " + currentCat.getWeight() + " pounds.");
            currentCat.meow();
        }
    }
}
