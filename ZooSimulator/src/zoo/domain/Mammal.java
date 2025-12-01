package zoo.domain;

public class Mammal extends Animal{
	protected String furColor;
	@Override
	String sound() {
		return "Growl..";
	}

}
