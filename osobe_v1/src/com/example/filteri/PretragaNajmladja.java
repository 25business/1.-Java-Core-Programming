package com.example.filteri;

import com.example.Osoba;
import java.util.ArrayList;

public class PretragaNajmladja {

    public static Osoba rezultat(ArrayList<Osoba> osobe) {
        Osoba najmladja = osobe.get(0);
        for(int i = 1; i < osobe.size(); i = i + 1) {
            if(najmladja.getGodiste() < osobe.get(i).getGodiste()) {
                najmladja = osobe.get(i);
            }
        }
        return najmladja;
    }
}
