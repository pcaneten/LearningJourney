package bruchtest;

public class Bruchtest1 {

	public static void main(String[] args) {
		Bruch bruch1 = new Bruch(1, 4);
		Bruch bruch2 = new Bruch(2, 4);
		
		bruch1.ausgeben();
		bruch2.ausgeben();
		
		Bruch bruch3 = bruch1.addiere(bruch2);
		bruch3.ausgeben();
		Bruch bruch4 = bruch3.subtrahiere(bruch1);
		bruch4.ausgeben();
	}
}
