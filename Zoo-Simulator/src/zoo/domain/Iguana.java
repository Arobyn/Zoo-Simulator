package zoo.domain;

public class Iguana extends Reptile implements Swimmable {
    public Iguana(String name, int age, String scaleColor) {
        super(name, age, scaleColor);
    }

    public void swim() {
        System.out.println(getName() + " płynie używając ogona.");
    }
}
