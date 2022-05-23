public class OcenaZaBodove {
	public static void main(String[] args) {
		
		int bodovi = 72;
		int ocena = 0;
		
		if((bodovi >= 0) && (bodovi <= 50)) {
			ocena = 5;
		}else if((bodovi >= 51) && (bodovi <= 60)) {
			ocena = 6;
		} else if((bodovi >= 61) && (bodovi <= 70)) {
			ocena = 7;
		} else if((bodovi >= 71) && (bodovi <= 80)) {
			ocena = 8;
		} else if((bodovi >= 81) && (bodovi <= 90)) {
			ocena = 9;
		} else if((bodovi >= 90) && (bodovi <= 100)) {
			ocena = 10;
		}
		
		if((ocena == 0) || ((bodovi < 0) && (bodovi > 100))) {
			System.out.println("Bodovi nisu dobro uneseni! (opseg 0 - 100)");
		} else {
			System.out.printf("Za  %d bodova, ocena je %d", bodovi, ocena);
		}
	}
}