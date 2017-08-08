public class ExampleSubclass extends ExampleSuperClass {
    String mySecretMessage;

    public ExampleSubclass(String message) {
        super(message);
        this.mySecretMessage = "Hi! I am a subclass of ExampleSuperclass! :D";

    }

    public void doStuff() {
        super.doStuff();
        System.out.println("My secret message is " + this.mySecretMessage + "!");
    }
}
