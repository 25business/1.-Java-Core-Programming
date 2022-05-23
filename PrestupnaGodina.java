public class PrestupnaGodina {
	public static void main(String[] args) {
		//Godina je deljiva sa 400 - Prestupna godina
		//Godina je deljiva sa 4 ali nije deljiva sa 100 - Prestupna godina
		
		int godina = 2022;
		
		if((godina % 400 == 0) || ((godina % 4 == 0) && (godina % 100 != 0))) {
			System.out.println("Godina je prestupna");
		} else {
			System.out.println("Godina nije prestupna");
		}
	}
}