package zoo.domain;

public class Hummingbird extends Bird implements Flyable,Trainable {

	public Hummingbird(int age, double wingspan)
	{
		this.name="Hummingbird";
		this.age=age;
		this.wingspan=wingspan;
	}

	@Override
	public void fly() {
		System.out.println(this.name+" flies into the sky");
		
	}

    @Override
    public void performTrick()
    {
        System.out.println(this.name+"does a barrel");
    }
}
