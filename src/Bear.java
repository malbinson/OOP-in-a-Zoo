public class Bear extends Animal {
    // put your instance variables here!
    String name;
    String favoriteFood = "fish";


    public Bear(String name) {
        super(name, "fish");
        this.name = name;
    }

    public void sleep() {
        // complete your sleep function here
        System.out.println(this.name + " hibernates for 4 months");

    }



}
