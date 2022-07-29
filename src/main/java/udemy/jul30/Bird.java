package udemy.jul30;

public abstract class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    public abstract void fly();
}
