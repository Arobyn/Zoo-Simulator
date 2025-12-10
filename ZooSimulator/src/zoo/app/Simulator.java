package zoo.app;
import zoo.domain.*;

public class Simulator {

	public static void main(String[] args) {
		Iguana Bernard=new Iguana("Bernard",10,"Green");
        Iguana Bernard2=new Iguana("Bernard",30,"Black");
		System.out.println(Bernard.info());
		Bernard.swim();
	}

}
