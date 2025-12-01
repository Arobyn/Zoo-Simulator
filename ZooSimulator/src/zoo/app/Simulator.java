package zoo.app;
import zoo.domain.*;

public class Simulator {

	public static void main(String[] args) {
		Hummingbird b=new Hummingbird(1,1);
		System.out.println(b.info());
		b.fly();
	}

}
