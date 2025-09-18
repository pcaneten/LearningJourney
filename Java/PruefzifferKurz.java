public class PruefzifferKurz {

	public static void main(String[] args) {
		int[] idCardNummern = {6, 2, 5, 8, 4, 3, 1, 9, 7, 9};
		int gesamtsumme = 0;
		int pruefziffer = 0;
		for(int i = 0; i < idCardNummern.length - 1; i++) {
			if(i % 2 == 0) {
				if(idCardNummern[i] * 2 < 9) {
					gesamtsumme += idCardNummern[i] * 2;
				} else {
					gesamtsumme += idCardNummern[i] * 2 - 9; 
				}
			} else {
				gesamtsumme += idCardNummern[i]; 
			}
		}
		if (gesamtsumme % 10 != 0) {
			pruefziffer = (gesamtsumme - gesamtsumme % 10 + 10) - gesamtsumme;
		} 
		System.out.println("Pruefziffer ist:\t" + (pruefziffer == idCardNummern[idCardNummern.length - 1]));
	}
}