package zoo.domain;

public class Bird extends Animal{
	protected double wingspan;
	
	@Override
	String sound() {
		
		return "Ćwir, ćwir";
	}
	
	@Override
	public String info()
	{
		return super.info()+", wingspan: "+wingspan+" m";
	}

}
