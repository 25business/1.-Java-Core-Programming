public class Kalkulator {
	public static void main(String[] args) {
		
		double a = 15;
		double b = 7;
		
		System.out.printf("""
		%1$.2f + %2$.2f = %3$.2f
		%1$.2f - %2$.2f = %4$.2f
		%1$.2f * %2$.2f = %5$.2f
		%1$.2f / %2$.2f = %6$.2f
		\n""", a, b, a + b, a - b, a * b, a / b);
		
		
		int broj = 20;
		System.out.printf("""
		Oktalno: %1$o
		Decimalno: %1$d
		Heksadecimalno: %1$h
		""", broj);
	}
}