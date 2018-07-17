package programs;

interface Bird  {
    public void fly();
    public void makeSound();
}

class Sparrow implements Bird  {
    public void fly() {
        System.out.println("Flying");
    }
    public void makeSound() {
        System.out.println("Chirp Chirp");
    }
}

interface ToyDuck {
    public void squeak();
}

class PlasticToyDuck implements ToyDuck {
    public void squeak() {
        System.out.println("Squeak");
    }
}

class BirdAdapter implements ToyDuck {
    Bird bird;
    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }
    public void squeak() {
        bird.makeSound();
    }
}

class Main {
    public static void main(String args[]) {
        Sparrow sparrow = new Sparrow();
        PlasticToyDuck toyDuck = new PlasticToyDuck();
        ToyDuck birdAdapter = new BirdAdapter(sparrow);
        System.out.println("Sparrow...");
        sparrow.fly();
        sparrow.makeSound();
        System.out.println("ToyDuck...");
        toyDuck.squeak();
        System.out.println("BirdAdapter...");
        birdAdapter.squeak();
    }
}