package zoo.domain;

public class Eagle extends Bird implements Flyable, Trainable {
    public Eagle(String name, int age, double wingspan) {
        super(name, age, wingspan);
    }

    public void fly() {
        System.out.println(getName() + " szybuje wysoko w chmurach.");
    }

    public void performTrick() {
        // Zachowałem Twój oryginalny humor ;)
        System.out.println(getName() + " drukuje płytkę pcb.");
    }
}
