package com.example.obrada;

import com.example.Input;
import com.example.Osoba;

import java.util.ArrayList;

public class AzuriranjeOsobe {

    public static void azuriranje(ArrayList<Osoba> osobe, int index) {
        Osoba o = osobe.get(index);
        String izbor;
        izbor = Input.read_string("Da li zelite da izmenite ime? (Y/N) ");
        if(izbor.toUpperCase().equals("Y")) {
            o.setIme(Input.read_string("Unesite novo ime: "));
        }
        izbor = Input.read_string("Da li zelite da izmenite prezime? (Y/N) ");
        if(izbor.toUpperCase().equals("Y")) {
            o.setPrezime(Input.read_string("Unesite novo prezime: "));
        }
        izbor = Input.read_string("Da li zelite da izmenite godinu rodjenja? (Y/N) ");
        if(izbor.toUpperCase().equals("Y")) {
            o.setGodiste(Input.read_int("Unesite novo godiste: "));
        }
        izbor = Input.read_string("Da li zelite da izmenite platu? (Y/N) ");
        if(izbor.toUpperCase().equals("Y")) {
            o.setPlata(Input.read_double("Unesite novu platu: "));
        }
        osobe.set(index, o);
    }
}