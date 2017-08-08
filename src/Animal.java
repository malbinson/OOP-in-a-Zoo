public class Animal {

    String favoriteFood;
    String name;
    private static int population;

    public Animal(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        population++;
    }

    public static int populationCount() {
        return population;
    }

    public void sleep() {
        System.out.println(this.name + " sleeps for 8 hours");
    }

    public void eat(String food) {
        System.out.println(this.name + " eats " + food);
        if(food == favoriteFood) {
            System.out.println("YUM!!! " + name + " wants more " + food);
        }
        else {
            sleep();
        }

    }
}

