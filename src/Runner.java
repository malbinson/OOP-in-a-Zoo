import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger");
        //tigger.eat("meat");
        //tigger.eat("kibble");

        Bear yogi = new Bear("Yogi");
        //yogi.eat("meat");
        //yogi.eat("fish");

        Unicorn u = new Unicorn("Rarity");
        //u.eat("marshmallows");

        Giraffe g = new Giraffe("Gemma");
        //g.eat("meat");
        //g.eat("leaves");

        Bee b = new Bee("Stinger");
        //b.eat("ice cream");
        //b.eat("pollen");

        Zookeeper z = new Zookeeper("Zoe");

        ArrayList<Animal> a = new ArrayList<Animal>();
        a.add(tigger);
        a.add(yogi);
        a.add(u);
        a.add(g);
        a.add(b);

        ArrayList<Animal> xx = new ArrayList<Animal>();
        xx.add(new Bee("Honey"));

        z.feedAnimals(a, "Bacon");
        z.feedAnimals(xx, "Toast");


    }
}
