package zoo.domain;

public class Reptile extends Animal {
    private String scaleColor;
    // Stała (final)
    protected final int MAX_AGE_REPTILE = 25;

    public Reptile(String name, int age, String scaleColor) {
        super(name, age);
        if (age > MAX_AGE_REPTILE) {
            System.out.println("Uwaga: Ten gad jest podejrzanie stary.");
        }
        this.scaleColor = scaleColor;
    }

    @Override
    public String sound() {
        return "Hisssss";
    }

    @Override
    public String info() {
        return super.info() + ", Scale: " + this.scaleColor;
    }
}
