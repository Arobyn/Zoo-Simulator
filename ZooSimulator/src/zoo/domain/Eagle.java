package zoo.domain;

public class Eagle extends Bird implements Flyable,Trainable {

    public Eagle(String name, double wingspan,int age) {
        this.name = name;
        this.wingspan = wingspan;
        this.age = age;
    }


    @Override
    public void fly()
    {
        System.out.println(this.name+"Soars in the sky");
    }
    @Override
    public void performTrick()
    {
        System.out.println(this.name+"Prints pcb board");
    }
}
