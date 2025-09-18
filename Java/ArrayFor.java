public class ArrayFor {
	public static void main(String[] args){
		int zahlenMax;
		int zahlenMin;
		int[] zahlenArray = {2 ,7, 11, 30, 41, 42, 100, 200, 33, 45, 111, 1000};
		zahlenMax = zahlenArray[0];
		zahlenMin = zahlenArray[0];
		
		for(int i = 0; i < zahlenArray.length; i++){
			for(int j = 0; j < zahlenArray.length; j++) {
				if (zahlenMax < zahlenArray[j]){
				zahlenMax = zahlenArray[j];
				System.out.println("Aktueller maximal Wert: " + zahlenMax);
				}
			}
			 
				if (zahlenMin > zahlenArray[i]) {
				zahlenMin = zahlenArray[i];
				System.out.println(" und minimal Wert: " + zahlenMin);
				}
			
			System.out.println("Position im Array: " + i + " hat Wert: " + zahlenArray[i]);
		}
	}
}