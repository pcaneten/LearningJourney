public class IHK25 {
	public static void main(String[] args){
		int a = 1;
		boolean x = true;
		boolean y = false;
		System.out.println(y & (++a == 2));
		System.out.println("a = " + a);
	}
}