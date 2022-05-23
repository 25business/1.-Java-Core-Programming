public class Kvadar {
	public static void main(String[] args) {
		
		int a = 5;
		int b = 4;
		int c = 3;
		int opcija = 1;
		
		if(opcija == 1) {
			int P = 2 * ((a*b) + (a*c) + (b*c));
			System.out.println("Povrsina je: " + P);
		} else {
			int V = a * b * c;
			System.out.println("Zapremina je: " + V);
		}
	}
}