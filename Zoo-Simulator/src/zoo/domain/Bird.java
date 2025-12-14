package zoo.domain;

public class Bird extends Animal {
    private double wingspan;

    public Bird(String name, int age, double wingspan) {
        super(name, age);
        this.wingspan = wingspan;
    }

    @Override
    public String sound() {
        return "Ćwir, ćwir";
    }

    @Override
    public String info() {
        return super.info() + ", Wingspan: " + this.wingspan + "m";
    }
}
