package zoo.domain;

public class Elephant extends Mammal implements Swimmable, Trainable {

    public Elephant(String name, int age) {
        // 1. Zamiast ustawiać pola ręcznie, przekazujemy je do konstruktora rodzica (Mammal)
        // Mammal przekaże name i age do Animal.
        super(name, age, "furless");
    }

    @Override
    // 2. Musi być PUBLIC, bo w Animal jest public abstract
    public String sound() {
        return "Pah-wooo";
    }

    @Override
    public void swim() {
        // 3. Zamiast this.name używamy metody publicznej getName()
        System.out.println(getName() + " almost drowns");
    }

    @Override
    public void performTrick() {
        // 4. Tutaj też getName()
        System.out.println(getName() + " sprays everyone with water from his trunk");
    }
}
