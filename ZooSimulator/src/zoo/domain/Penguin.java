package zoo.domain;

public class Penguin extends Bird implements Swimmable, Trainable{

    public Penguin(String name, int age, double wingspan)
    {
        this.name = name;
        this.age = age;
        this.wingspan = wingspan;
    }

    @Override
    String sound()
    {
        return "BRAA-haa";
    }
    @Override
    public void performTrick()
    {
        System.out.println("sudo rm -rf /");
    }
    @Override
    public void swim()
    {
        System.out.println(name+" jolts through water");
    }
}
