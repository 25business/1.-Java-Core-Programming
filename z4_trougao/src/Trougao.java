public class Trougao {
    int a;
    int b;
    int c;

    Trougao(int in_a, int in_b, int in_c) {
        a = in_a;
        b = in_b;
        c = in_c;
    }

    int Obim() {
        return a + b + c;
    }

    boolean daLiJePravougli() {
        return a + b == c;
    }

    String za_ispis() {
        return String.format("""
                a = %d
                b = %d
                c = %d
                
                O = %d
                Da li je trougao pravougli: %b
                """, a, b, c, Obim(), daLiJePravougli());
    }
}
