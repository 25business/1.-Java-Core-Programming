public class NaredbeGrananja {
	public static void main(String[] args) {
		
		int a = 5;
		int b = 9;
		
		System.out.println("5 < 9 " + (a < b));
		System.out.println("5 > 9 " + (a > b));
		System.out.println("5 <= 9 " + (a <= b));
		System.out.println("5 >= 9 " + (a >= b));
		System.out.println("5 == 9 " + (a == b));
		System.out.println("5 != 9 " + (a != b));
		
		
		System.out.println((a > 0) || (a % 2 == 0));
		
		/*
		if(a > 0) {
			System.out.println("a je pozitivan broj");
		} else {
			System.out.println("a je negativan broj");
		}
		System.out.println("Nastavljam dalje...");
		*/
		
		
		if(a > 0) {
			System.out.println("a je pozitivan broj");
		} else {
			System.out.println("a je negativan broj");
			System.out.println("ja sam deo ne grane");
		}
	}
}