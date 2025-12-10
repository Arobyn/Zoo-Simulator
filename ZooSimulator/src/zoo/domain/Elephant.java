package zoo.domain;

public class Elephant extends Mammal implements Swimmable,Trainable{
	public Elephant(String name,int age){
        this.name = name;
        this.age = age;
        this.furColor = "furless";
    }

    @Override
    String sound()
    {
        return "Pah-wooo";
    }
    @Override
    public void swim(){
        System.out.println(this.name+"almost drowns");
    }

    @Override
    public void performTrick()
    {
        System.out.println(this.name+"sprays everyone with water from his trunk");
    }
}
