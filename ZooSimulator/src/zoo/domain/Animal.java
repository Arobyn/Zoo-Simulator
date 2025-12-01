package zoo.domain;

public abstract class Animal {
	 protected String name;
	 protected int age;
	
	
	 
	public void eat() {
		System.out.println(name+" je");
	}
	
	public void sleep()
	{
		System.out.println(name+" śpi");
	}
	
	abstract String sound();
	
	public String info()
	{
		return "Name: "+name+", age: "+age;
	}
}
