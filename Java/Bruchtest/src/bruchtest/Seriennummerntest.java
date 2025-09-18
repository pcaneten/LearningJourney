package bruchtest;

public class Seriennummerntest {

	public static void main(String[] args) {
		BruchMitSeriennummer bruch1 = new BruchMitSeriennummer(3,5);
		BruchMitSeriennummer bruch2 = new BruchMitSeriennummer(1,3);
		BruchMitSeriennummer bruch3 = new BruchMitSeriennummer(5,8);
		BruchMitSeriennummer bruch4 = new BruchMitSeriennummer(2,3);
		BruchMitSeriennummer bruch5 = new BruchMitSeriennummer(5,6);
		
		bruch1.ausgabeMitSeriennumer();
		bruch2.ausgabeMitSeriennumer();
		bruch3.ausgabeMitSeriennumer();
		bruch4.ausgabeMitSeriennumer();
		bruch5.ausgabeMitSeriennumer();

	}

}
