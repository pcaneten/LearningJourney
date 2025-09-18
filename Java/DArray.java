import java.util.Random;

public class DArray{
	public static void main(String[] args){
		int arrayGroesse = 10;
		int[] array = new int[arrayGroesse];
		Random zufallszahl = new Random();
		int maxWert = array[0];
		int minWert = array[0];
		double durschnitt = 0;
		
		for(int i = 0; i < arrayGroesse; i++){
			array[i] = (int)(zufallszahl.nextDouble()* arrayGroesse * 10 + 1);
			if(maxWert < array[i]){
				maxWert = array[i];
			}
			
			if(minWert > array[i]){
				minWert = array[i];
			}
			durschnitt += array[i];
			System.out.println(array[i]);
		}
		durschnitt = 1.0 * durschnitt/arrayGroesse;
		
		System.out.println("Größter Wert ist:\t" + maxWert);
		System.out.println("Kleinster  Wert ist:\t" + minWert);
		System.out.println("Durschnitt Wert ist:\t" + durschnitt); 
	}
}