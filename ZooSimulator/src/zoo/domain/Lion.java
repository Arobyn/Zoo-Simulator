package zoo.domain;

public class Lion extends Mammal implements Swimmable, Trainable{
    public Lion(int age, String furColor)
    {
        this.name="Lion";
        this.age=age;
        this.furColor=furColor;
    }

    @Override
    public void swim(){
        System.out.println(this.name+"Floats steadily");
    }

    @Override
    public void performTrick() {
        System.out.println(this.name+"Jumps through a hoop");
    }
}
