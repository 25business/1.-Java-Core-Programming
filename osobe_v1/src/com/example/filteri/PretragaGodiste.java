package com.example.filteri;

import com.example.Osoba;
import java.util.ArrayList;

public class PretragaGodiste {

    public static ArrayList<Osoba> rezultat(ArrayList<Osoba> osobe, int godiste) {
        ArrayList<Osoba> filter_osoba = new ArrayList<>();
        for(int i = 0; i < osobe.size(); i = i + 1) {
            if(osobe.get(i).getGodiste().equals(godiste)) {
                filter_osoba.add(osobe.get(i));
            }
        }
        return filter_osoba;
    }
}
