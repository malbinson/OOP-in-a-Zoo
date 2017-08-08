import java.util.ArrayList;

public class Zookeeper {

    public String name;

    public Zookeeper(String name) {
        this.name = name;
    }

    public void feedAnimals(ArrayList<Animal> animals, String food) {
        System.out.println(this.name + " is feeding " + food + " to " +  animals.size() + " of " + Animal.populationCount() + " total animals ");

        for(Animal a : animals) {
            a.eat(food);
        }

    }
}
