package udemy.jul30;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        // Bird bird = new Bird("Parrot");
        Parrot parrot = new Parrot("Random Parrot");
        // bird.breathe();
        // bird.eat();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.eat();
        penguin.fly();
    }
}
