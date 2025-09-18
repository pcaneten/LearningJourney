package uebung06;

public class Girokontotest {
	
	 public static void main(String args[]) {
		 Girokonto gk1=new Girokonto("0000000001", 10000.0, 1000.0);
		 gk1.auszahlen(11000.0);
		 System.out.println("Kontostand: " +gk1.getKontostand());
		 gk1.einzahlen(11000.0);
		 gk1.auszahlen(11001.0);
		 System.out.println("Kontostand: "+gk1.getKontostand());
	 }	 
}