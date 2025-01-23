package a.using.variables.lambdaExpression;

public class Main {

	public interface Gorilla {
		String move();
	}

	String walk = "walk";
	static String vol = "vol";

	public void playGorilla(boolean baby) {
		//baby=true;
		// LamdaExpression can access instance variable
		play(() -> walk);
		// LamdaExpression can access static variable
		play(() -> vol);
		// LamdaExpression can access effectively final method parameters
		play(() -> baby ? "up" : "down");
		String approach = "v1";
		//approach="v1";
		// LamdaExpression can access effectively final local variable
		play(() -> approach);
	}

	public void play(Gorilla gorilla) {
		gorilla.move();
	}
}
