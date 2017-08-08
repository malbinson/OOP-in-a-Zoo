public class Unicorn extends Animal {

    public Unicorn(String name) {
        // don't forget to correct the call to the superclass initializer!
        super(name, "marshmallows");
    }

    public void sleep() {
        // your overridden sleep code...
        System.out.println(this.name + " sleeps in a cloud");

    }
}
