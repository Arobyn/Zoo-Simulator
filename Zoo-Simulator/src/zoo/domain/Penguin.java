package zoo.domain;

public class Penguin extends Bird implements Swimmable, Trainable {
    public Penguin(String name, int age, double wingspan) {
        super(name, age, wingspan);
    }

    @Override
    public String sound() {
        return "BRAA-haa";
    }

    public void swim() {
        System.out.println(getName() + " wystrzeliwuje przez wodę jak torpeda.");
    }

    public void performTrick() {
        System.out.println(getName() + " wykonuje: sudo rm -rf /");
    }
}
