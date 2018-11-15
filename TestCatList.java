import java.util.*; //needed for arrayList

public class TestCatList {
    public static void main(String[] args){
        ArrayList<Cat> catList = new ArrayList(); //makes list of cat objects
        catList.add(new Cat("Tom"));
        catList.add(new Cat("Sylvester"));
        catList.add(new Cat("Garfield"));
        catList.add(new Cat("Rita"));
        
        for (Cat currentCat: catList){
            currentCat.setWeight(Math.random()*10+5);
        }
        for (Cat currentCat: catList) {
            System.out.println(currentCat.getName() + " weighs " + currentCat.getWeight() + " pounds.");
            currentCat.meow();
        }
    }
}
