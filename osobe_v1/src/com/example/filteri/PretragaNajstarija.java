package com.example.filteri;

import com.example.Osoba;
import java.util.ArrayList;

public class PretragaNajstarija {

    public static Osoba rezultat(ArrayList<Osoba> osobe) {
        Osoba najstarija = osobe.get(0);
        for(int i = 1; i < osobe.size(); i = i + 1) {
            if(najstarija.getGodiste() > osobe.get(i).getGodiste()) {
                najstarija = osobe.get(i);
            }
        }
        return najstarija;
    }
}
