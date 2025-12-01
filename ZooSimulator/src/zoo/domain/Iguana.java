package zoo.domain;

public class Iguana extends Reptile implements Swimmable {

	public Iguana(int age, String scaleColor)
	{
		this.name="Iguana";
		this.age=age;
		this.scaleColor=scaleColor;
	}
	
	@Override
	public void swim()
	{
		System.out.println(name+" swims away swiftly");
	}
	
	
}
