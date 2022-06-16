package com.example.obrada;

import com.example.Osoba;
import java.util.ArrayList;

public class IspisOsoba {

    public static void prikaz(ArrayList<Osoba> osobe) {
        for (int i = 0; i < osobe.size(); i = i + 1) {
            System.out.printf("[%d] %s\n", i, osobe.get(i));
        }
    }
}