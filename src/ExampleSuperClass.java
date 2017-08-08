public class ExampleSuperClass {
    String message;

    public ExampleSuperClass(String message) {
        this.message = message;
    }

    public void doStuff() {
        System.out.println("My message is " + this.message + '.');
    }

    public void sayGoodbye() {
        System.out.println("Goodbye!");
    }
}
