package zoo.domain;

public class Lion extends Mammal implements Swimmable, Trainable {
    public Lion(int age, String furColor) {
        super("Lion", age, furColor);
    }

    public void swim() {
        System.out.println(getName() + " płynie dostojnie.");
    }

    public void performTrick() {
        System.out.println(getName() + " skacze przez płonącą obręcz.");
    }
}
