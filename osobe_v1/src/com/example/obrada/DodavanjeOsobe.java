package com.example.obrada;

import com.example.Input;
import com.example.Osoba;

import java.util.ArrayList;

public class DodavanjeOsobe {

    public static void kreiraj(ArrayList<Osoba> osobe) {
        Osoba o = new Osoba();
        o.setIme(Input.read_string("Unesite ime: "));
        o.setPrezime(Input.read_string("Unesite prezime: "));
        o.setGodiste(Input.read_int("Unesite godiste: "));
        o.setPlata(Input.read_double("Unesite platu: "));
        osobe.add(o);
    }
}
