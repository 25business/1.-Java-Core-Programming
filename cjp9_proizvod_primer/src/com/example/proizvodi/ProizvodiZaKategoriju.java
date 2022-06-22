package com.example.proizvodi;

import java.util.ArrayList;

public class ProizvodiZaKategoriju {

    public static ArrayList<Proizvod> rezultat(ArrayList<Proizvod> proizvodi, String kategorija) {
        ArrayList<Proizvod> filter_proizvoda = new ArrayList<>();
        for(Proizvod p : proizvodi) {
            if(p.getKategorija().equals(kategorija)) {
                filter_proizvoda.add(p);
            }
        }
        return filter_proizvoda;
    }
}
