package com.example;

import com.example.ljudi.Osoba;
import com.example.ljudi.Zaposleni;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        //Osoba o = new Osoba("Branislav","Mihajlovic", 2001);
        //System.out.println(o);

        ArrayList<Osoba> osobe = new ArrayList<>();
        osobe.add(new Osoba("Branislav","Mihajlovic", 2001));
        osobe.add(new Zaposleni("Milos", "Miskovic", 1975, 2500));

        for(Osoba o : osobe) {
            System.out.println(o);
        }
    }
}
