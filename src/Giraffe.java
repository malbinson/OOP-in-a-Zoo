public class Giraffe extends Animal {

    public Giraffe(String name) {
        // don't forget to correct the call to the superclass initializer!
        super(name, "leaves");
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
