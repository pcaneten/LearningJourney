package uebung06;

public class Kontotest {

	public static void main(String[] args) {
		Konto konto1 = new Konto("0000000001", 1000.0);
		
		konto1.ausgabeKontoDetails();
		konto1.einzahlen(500);
		konto1.ausgabeKontoDetails();
		konto1.auszahlen(750.50);
		konto1.ausgabeKontoDetails();

	}

}
