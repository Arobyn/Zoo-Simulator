package zoo.domain;

public class Mammal extends Animal {
    private String furColor;
    public static final int MAX_AGE_MAMMAL = 100; // Stała

    public Mammal(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    @Override
    public String sound() {
        return "Growl...";
    }

    @Override
    public String info() {
        return super.info() + ", Fur: " + this.furColor;
    }
}
