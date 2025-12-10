package zoo.domain;

public class Mammal extends Animal{
	protected String furColor;

	@Override
	String sound() {
		return "Growl..";
	}
    @Override
    public String info()
    {
        return super.info()+" fur color: "+furColor;
    }

}
