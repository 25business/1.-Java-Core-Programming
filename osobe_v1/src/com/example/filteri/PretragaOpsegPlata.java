package com.example.filteri;

import com.example.Osoba;
import java.util.ArrayList;

public class PretragaOpsegPlata {

    public static ArrayList<Osoba> rezultat(ArrayList<Osoba> osobe, double min_plata, double max_plata) {
        ArrayList<Osoba> filter_osoba = new ArrayList<>();
        for(int i = 0; i < osobe.size(); i = i + 1) {
            if(osobe.get(i).getPlata() >= min_plata && osobe.get(i).getPlata() <= max_plata) {
                filter_osoba.add(osobe.get(i));
            }
        }
        return filter_osoba;
    }
}
