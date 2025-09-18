package msLizenzierung;

import javax.swing.JOptionPane;

/**
 * Die Klasse zur Lizenzverwaltung
 * @version 0.001
 */
public class LizenzVerwaltung {
	/**
	 * Die main Methode um die Lizenzen zu verwalten
	 * @param args Wird nicht genutzt
	 */
	public static void main(String[] args) {
		int clientAnzahl = 0;
		int userAnzahl = 0;
		int serverAnzahl = 0;
		ServerLizenz server = new ServerLizenz();
		ClientLizenz clientLizenz = new ClientLizenz();
		NetzCAL netzCAL = new NetzCAL();
		
		serverAnzahl = Integer.parseInt(JOptionPane.showInputDialog("Wie viele Server moechten Sie haben?"));
		clientAnzahl = Integer.parseInt(JOptionPane.showInputDialog("Wie viele Clients moechten Sie haben?"));
		userAnzahl = Integer.parseInt(JOptionPane.showInputDialog("Wie viele User moechten Sie haben?"));
		
		server.setLizenzAnzahl(serverAnzahl);
		clientLizenz.setClientAnzahl(clientAnzahl);
		netzCAL.setUserAnzahl(userAnzahl);
		netzCAL.setClientAnzahl(clientAnzahl);

		System.out.println("Lizenzkosten fuer die Server: " + server.serverKosten());
		System.out.println("Lizenzkosten fuer die Clients: " + clientLizenz.clientKosten());
		System.out.println("Lizenzkosten fuer die Netzwerk CALs: " + netzCAL.getNetzCALKosten());
		// System.out.println("Lizenzkosten fuer die Netzwerk CALs 5er bundle: " + netzCAL.getRealNetzCALKosten());
		double zwischensumme = netzCAL.getRealNetzCALKosten() + clientLizenz.clientKosten() + server.serverKosten();
		System.out.println("Aktuelle Lizenzkosten: " + zwischensumme);
		
	}

}
