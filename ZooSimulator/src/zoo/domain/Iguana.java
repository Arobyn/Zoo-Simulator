package zoo.domain;

public class Iguana extends Reptile implements Swimmable {

	public Iguana(String name,int age, String scaleColor)
	{
		super(name, age,scaleColor);
	}
	
	@Override
	public void swim()
	{
		System.out.println(name+" swims away swiftly");
	}
	
	
}
