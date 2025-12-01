package zoo.domain;

public class Hummingbird extends Bird implements Flyable {

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
}
