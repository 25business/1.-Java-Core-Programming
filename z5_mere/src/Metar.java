public class Metar {
    double metar;

    Metar() {
        metar = 1;
    }
    Metar(double in_metar) {
        metar = in_metar;
    }

    double milimetri() {
        return metar * 1000;
    }
    double milje() {
        return metar * 0.000620;
    }
    double stopa() {
        return metar * 3.280840;
    }
    double inch() {
        return metar * 39.370079;
    }
    double yard() {
        return metar * 1.093613;
    }

    String za_ispis() {
        return String.format("""
                Konvertovanje %f m u:
                
                Milimetara: %f mm
                Milja: %f MI
                Stopa: %f ft
                Incha: %f in
                Yarda: %f yd""", metar, milimetri(), milje(), stopa(), inch(), yard());
    }
}
