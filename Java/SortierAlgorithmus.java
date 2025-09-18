import java.util.Random;
import javax.swing.JOptionPane;
 
public class BubbleSort {
 
	public static void main(String[] args) {
		// Initialisierung der Variablen
		String input = JOptionPane.showInputDialog(
									"Geben Sie die grösse des Arrays ein: ");
		int arrayGroesse = Integer.parseInt(input);
		Integer[] zahlenArray = new Integer[arrayGroesse];
		Random zufallszahl = new Random();
		int dreiecktausch = 0;
		int anzahlDurchg = 0;
		input = JOptionPane.showInputDialog(
									"Geben Sie die Anzahl der Werte die pro Reihe angezeigt sollen: ");
		int zahlenProReihe = Integer.parseInt(input);
		
				
		// Schleife zum befuellen des Array zahlenArray
		System.out.println("\nAusgabe des Arrays\n");
		for(int i = 0; i < arrayGroesse; i++){
				if (arrayGroesse < 10000){
					zahlenArray[i] = (int)(zufallszahl.nextDouble()*arrayGroesse+1);
				} else {
					zahlenArray[i] = (int)(zufallszahl.nextDouble()*arrayGroesse*10+1);
				}
				
				// Ausgabe des Arrays
				if (i%zahlenProReihe == 0){
					System.out.println("");
				}
				System.out.print(zahlenArray[i] +"\t");
				
				// System.out.println("Wert in Position:\t" + i + "\tist:\t" + zahlenArray[i]);
			}
	
		// Aussenschleife für die Duchlaufe
		long anfang = System.currentTimeMillis();
		for(int i = 0; i < arrayGroesse; i++){
			// Innere Schleife für das Tauschen
			for (int j = 0; j < arrayGroesse - i - 1; j++){
				if (zahlenArray[j] > zahlenArray [j+1]){
					dreiecktausch = zahlenArray[j];
					zahlenArray[j] = zahlenArray[j+1];
					zahlenArray[j+1] = dreiecktausch;
				}
			}
			anzahlDurchg++;
		}
		
		long ende = System.currentTimeMillis();
		
		System.out.println("\n\nAusgabe des sortierten des Arrays");
		// Ausgabe des sortierten Arrays
		for(int i = 0;  i < arrayGroesse; i++){
			//System.out.println("Sortierter Wert in Position:\t" + i + "\tist:\t" + zahlenArray[i]);
			if (i%zahlenProReihe == 0){
				System.out.println("");
			}
			System.out.print(zahlenArray[i] +"\t");
		}	
				
		long endePrint = System.currentTimeMillis();
		
		System.out.println("\n\nDie Anzahl der Durchgänge ist:\t" + anzahlDurchg);
		if ((ende - anfang) < 1000) {
			System.out.println("\nDauer der Sortierung:\t" + (ende - anfang) + " Millisekunden");
		} else {
			System.out.println("\nDauer der Sortierung:\t" + (1.0*(ende - anfang)/1000) + " Sekunden");
		}
		System.out.print("\nDauer der Ausgabe der Sortierte Werte:\t" + (double)(endePrint - ende)/1000 + " Sekunden\n");
	}
}