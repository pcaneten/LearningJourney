public class Ausgaben {
 
	public static void main(String[] args) {
		int a=3;
		int b=5;
		int c=6;
		double x=1.5;
		double y=2.3;
		int int_ergebnis = -1234;
		double double_ergebnis = 0.000000001;
		
		/*	
		//Aufgabe 2
		System.out.println("b + c * 6 = " +b+c* 6);
		System.out.println("b - c * 6 = " +(b-c* 6));	
		System.out.println("(x * c - a) = " + (x * c - a));
		System.out.println("x + c * 6 = " +x+c* 6);
		System.out.println("y - c / a = " + (y - c / a));
		System.out.println("b + a * x + y = " + b + a * x + y);
		System.out.println("b + a * x * y = " + b + a * x * y);
		System.out.println("b + a * x - y = " + (b + a * x - y));
		*/
		
		/*
		//Aufgabe 3
		System.out.println("a++: " + a++ + "\t\tWert von 'a' nach verlassen der Zeile wird:\t" + a );
		System.out.println("a: " + a + "\t\tWert von 'a' nach verlassen der Zeile wird:\t" + a );
		System.out.println("++a: " + ++a + "\t\tWert von 'a' nach verlassen der Zeile wird:\t" + a );
		System.out.println("a: " + a + "\t\tWert von 'a' nach verlassen der Zeile wird:\t" + a );
		System.out.println("b + a--: " + b + a-- + "\tWert von 'a' nach verlassen der Zeile wird:\t" + a );
		System.out.println("a: " +a+ " b: " + b + "\tWert von 'a' nach verlassen der Zeile wird:\t" + a );
		System.out.println("b + a--: " + (b + a--) + "\tWert von 'a' nach verlassen der Zeile wird:\t" + a );
		System.out.println("a: " +a+ " b: " + b + "\tWert von 'a' nach verlassen der Zeile wird:\t" + a );
		System.out.println("b + --a: " + (b + --a) + "\tWert von 'a' nach verlassen der Zeile wird:\t" + a );
		System.out.println("a: " +a+ " b: " + b + "\tWert von 'a' nach verlassen der Zeile wird:\t" + a );
		*/
		
		/*
		//Aufgabe 4
		System.out.println("c > b = " + c > b);
		System.out.println("c > b = " + (c > b));
		System.out.println("b < a = " + (b < a));
		System.out.println("c == b = " + (c == b));
		// System.out.println("c > a < b = " + (c > a < b));
		System.out.println("a = b = " + (a = b));
		System.out.println("a = " +a+ "b=" + b);
		System.out.println("x > y = " + (x > y));
		y=y+ 0.1;
		y=y+ 0.1;
		System.out.println("y == 2.5 = " + (y == 2.5));
		System.out.println("y = " + y);
		double z = 1.0;
		z=z+ 0.1;
		z=z+ 0.1;
		System.out.println("z == 1.2 = " + (z == 1.2));
		System.out.println("z = " + z);
		*/
		
		//Aufgabe 5
		boolean b_wert;
		b_wert = a == c;
		System.out.println("a == b = " + (a == c));
		System.out.println(b_wert);
		System.out.println(!b_wert);
		b_wert = a == b && c > b;
		System.out.println("a == b && c > b = " + b_wert);
		b_wert = b < c & a++ == 4;
		System.out.println("b < c & a++ == 4 = " + b_wert);
		b_wert = b < c & ++a == 5;
		System.out.println("b < c & ++a == 5 = " + b_wert);
		a = 3;
		b_wert = b < c & ++a == 4;
		System.out.println("b < c & ++a == 4 = " + b_wert);
		a = 3;
		b_wert = a > b && c++ == 6;
		System.out.println("a > b && c++ == 6 = " + b_wert);
		System.out.println("c = " + c);
		// b_wert = !y > x;
		// System.out.println("!y > x = " + !y > x);
		b_wert = !(y > x);
		System.out.println("!(y > x) = " + !(y > x));
		b_wert = a > b & c++ == 6;
		System.out.println("a > b & c++ == 6 = " + b_wert);
		System.out.println("c = " + c);
		c = 6;
		b_wert = a < b || c++ == 6;
		System.out.println("a < b || c++ == 6 = " + b_wert);
		System.out.println("c = " + c);
		b_wert = a < b | c++ == 6;
		System.out.println("a < b | c++ == 6 = " + b_wert);
		System.out.println("c = " + c);
		c = 6;
		// b_wert = a > b | c++;
		System.out.println("a > b | c++ = " + b_wert);
		
	}
}

/*
Aufgabe 2
System.out.println("b + c * 6 = " +b+c* 6); 			--> 5 + 6 * 6 = 							536 
System.out.println("b - c * 6 = " +b-c* 6);				--> 5 - 6 * 6 = 5 - 36 = 					-31 	---> ungültig mit srting / wuerde ohne String funktionieren | in Klammern.
System.out.println("(x * c - a) = " + (x * c - a));		--> 1,5 * 6 - 3 = 9.0 - 3 = 				6.0
System.out.println("x + c * 6 = " +x+c* 6);				--> 1.5 6 * 6 = 							1.536
System.out.println("y - c / a = " + (y - c / a));		--> 2.3 - 6 / 3 = 2.3 - 2 =					0.3
System.out.println("b + a * x + y = " + b + a * x + y);	--> 5 + 3 x 1.5 + 2.3 = 					54.52.3
System.out.println("b + a * x * y = " + b + a * x * y);	--> 5 + 3 x 1.5 * 2.3 = 5 + 4.5 * 2.3 = 	510.35
System.out.println("b + a * x - y = " + b + a * x - y);	--> 5 + 3 x 1.5 - 2.3 = 5 + 4.5 - 2.3 = 	7.2		---> ungültig mit string / wuerde ohne String funktionieren | in Klammern. 
*/

/*
Aufgabe 3
												Preincrement		Print				a Wert nach print

System.out.println("a++: " + a++);									a++: 3				// a = 3 + 1 = 4
System.out.println("a: " + a);										a: 4 				// a = 4
System.out.println("++a: " + ++a);				a + 1 = 5 = a		++a: 5				// a = 5
System.out.println("a: " + a);										a: 5 				// a = 5 
System.out.println("b + a--: " + b + a--);							b + a--: 55 		// a = 5 - 1 = 4
System.out.println("a: " +a+ " b: " + b);							a: 4 b: 5			// a = 4
System.out.println("b + a--: " + (b + a--));						b + a--: 9			// a = 4 - 1 = 3
System.out.println("a: " +a+ " b: " + b);							a: 3 b: 3			// a = 3
System.out.println("b + --a: " + (b + --a));	(a - 1)= 2 = a		b + --a: 7			// a = 2
System.out.println("a: " +a+ " b: " + b);							a: 2 b: 5			// a = 2
System.out.println("a**: " + a**);									ungültig in java
*/

/*
Aufgabe 4
System.out.println("c > b = " + c > b);								ungültig
System.out.println("c > b = " + (c > b));							c > b = true
System.out.println("b < a = " + (b < a));							b < a = false
System.out.println("c == b = " + (c == b));							c == b = false
System.out.println("c > a < b = " + (c > a < b));					ungültig 			--> wuerde mit ein & funktionieren also c > a & a < b
System.out.println("a = b = " + (a = b));							a = b = 5 			--> da nicht ==, wird eine Wertzuweisung gemacht, also a = b so das der Wert von a jetz den Wert von b (5) ist.
System.out.println("a = " +a+ "b=" + b);							a= 5b=5 
System.out.println("x > y = " + (x > y));							x > y = false
y=y+ 0.1;																				y Wert = 2.4	
y=y+ 0.1;																				y Wert = 2.5	
System.out.println("y == 2.5 = " + (y == 2.5));						y == 2.5 = true
System.out.println("y = " + y);										y = 2.5
double z = 1.0;														
z=z+ 0.1;																				z Wert = 1.1
z=z+ 0.1;																				z Wert = 1.2
System.out.println("z == 1.2 = " + (z == 1.2));						z == 1.2 = true
System.out.println("z = " + z);										z = 1.2
*/

/*
Aufgabe 5
int a=3;
int b=5;
int c=6;
double x=1.5;
double y=2.3;
boolean b_wert;
b_wert = a == c;																				b_wert = false
System.out.println("a == b = " + (a == c));							a == b = false
System.out.println(b_wert);											false
System.out.println(!b_wert);										true
b_wert = a == b && c > b;																		b_wert = false
System.out.println("a == b && c > b = " + b_wert);					a == b && c > b = false
b_wert = b < c & a++ == 4;																		b_wert = false, a = 4
System.out.println("b < c & a++ == 4 = " + b_wert);					b < c & a++ == 4 = false
b_wert = b < c & ++a == 5;								a = 5									b_wert = true
System.out.println("b < c & ++a == 5 = " + b_wert);					b < c & ++a == 5 = true
a = 3;																							a = 3		
b_wert = b < c & ++a == 4;								a = 4									b_wert = true
System.out.println("b < c & ++a == 4 = " + b_wert);					b < c & ++a == 4 = true
a = 3;																							a = 3
b_wert = a > b && c++ == 6;																		b_wert = false							
System.out.println("a > b && c++ == 6 = " + b_wert);				a > b && c++ == 6 = false
System.out.println("c = " + c);										c = 6
b_wert = !y > x;													not valid
System.out.println("!y > x = " + !y > x);							not valid
b_wert = !(y > x);																				b_wert = true
System.out.println("!(y > x) = " + !(y > x));						!(y > x) = false
b_wert = a > b & c++ == 6;																		b_wert = false,	c = 7
System.out.println("a > b & c++ == 6 = " + b_wert);					a > b & c++ == 6 = false
System.out.println("c = " + c);										c = 7
c = 6;																							c = 6
b_wert = a < b || c++ == 6;																		b_wert = true
System.out.println("a < b || c++ == 6 = " + b_wert);				a < b || c++ == 6 = true
System.out.println("c = " + c);										c = 6
b_wert = a < b | c++ == 6;																		b_wert = true, c = 7
System.out.println("a < b | c++ == 6 = " + b_wert);					a < b | c++ == 6 = true
System.out.println("c = " + c);										c = 7
c = 6;																							c = 6
b_wert = a > b | c++;												not valid
System.out.println("a > b | c++ = " + b_wert);						a > b | c++ = true
*/