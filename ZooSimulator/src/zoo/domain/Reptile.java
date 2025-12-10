package zoo.domain;

public class Reptile extends Animal{
	protected String scaleColor;
    protected final int max_age_reptile=25;

    public Reptile(String name, int age, String scaleColor)
    {
        if(this.age<0 || this.age>max_age_reptile)
        {
            System.out.println("Invalid age");
        }
        else
        {
        this.name=name;
        this.age=age;
        this.scaleColor=scaleColor;
        }
    }

	@Override
	String sound() {
		return "hisssss";
	}

    @Override
    public String info()
    {
       return super.info()+" scale color: "+scaleColor;
    }

}
