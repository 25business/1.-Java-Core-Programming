public class OsnoveTeksta {
	public static void main(String[] args) {
		String tekst = "Ovo je neki tekst.";
		System.out.println(tekst);
		
		String tekst_blok = """ 
		ovo je
		tekst koji ide
		u vise redova. """;
		System.out.println(tekst_blok);
		
		String izmenjen_tekst = tekst.toUpperCase();
		System.out.println(izmenjen_tekst);
		
		boolean pocinje_sa_O = tekst.startsWith("O");
		System.out.println(pocinje_sa_O);
		
		boolean zavrsava_sa_t = tekst.endsWith("t");
		System.out.println(zavrsava_sa_t);
		
		String broj_tekst = String.valueOf(9.7);
		System.out.println(broj_tekst);
		
		String novi_tekst = tekst.replace('e','*');
		System.out.println(novi_tekst);
		String novi_tekst_blok = tekst_blok.replaceAll("ov","_");
		System.out.println(novi_tekst_blok);
	}
}