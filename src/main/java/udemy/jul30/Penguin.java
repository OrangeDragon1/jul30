package udemy.jul30;

public class Penguin extends Bird{

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Not very good at that, will swim instead");
    }
    
}
