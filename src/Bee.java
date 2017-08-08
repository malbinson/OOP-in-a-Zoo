public class Bee extends Animal {

    public Bee(String name) {
        super(name, "pollen");
    }

    public void sleep() {
        System.out.println(this.name + " never sleeps.");
    }

    public void eat(String food) {
        // complete your eat function here
        System.out.println(this.name + " eats " + food);
        if(food == this.favoriteFood) {
            System.out.println("YUM!!! " + this.name + " wants more " + this.favoriteFood);
            sleep();
        }
        else {
            System.out.println("YUCK!!! " + this.name + " will not eat " +  food);
        }

    }

}
