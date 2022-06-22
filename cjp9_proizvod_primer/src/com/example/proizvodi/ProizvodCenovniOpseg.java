package com.example.proizvodi;

import java.util.ArrayList;

public class ProizvodCenovniOpseg {

    public static ArrayList<Proizvod> rezultat(ArrayList<Proizvod> proizvodi, double min_opseg, double max_opseg) {
        ArrayList<Proizvod> filtrirani_proizvodi = new ArrayList<>();
        for(int i = 0; i < proizvodi.size(); i = i + 1) {
            if(proizvodi.get(i).getCena() >= min_opseg && proizvodi.get(i).getCena() <= max_opseg) {
                filtrirani_proizvodi.add(proizvodi.get(i));
            }
        }
        return filtrirani_proizvodi;
    }
}
