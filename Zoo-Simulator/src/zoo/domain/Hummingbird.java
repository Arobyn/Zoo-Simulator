package zoo.domain;

public class Hummingbird extends Bird implements Flyable, Trainable {

    public Hummingbird(int age, double wingspan) {
        // Wywołujemy konstruktor Bird, przekazując sztywno nazwę "Hummingbird"
        super("Hummingbird", age, wingspan);
    }

    @Override
    public void fly() {
        // Używamy getName(), bo pole name jest prywatne w Animal
        System.out.println(getName() + " flies into the sky");
    }

    @Override
    public void performTrick() {
        // Poprawiłem spację w tekście, żeby ładnie wyglądało w konsoli
        System.out.println(getName() + " does a barrel roll");
    }
}
