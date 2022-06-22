package com.example.proizvodi;

import java.util.ArrayList;

public class ProizvodNajskuplji {

    public static Proizvod rezultat(ArrayList<Proizvod> proizvodi) {
        Proizvod najskuplji = proizvodi.get(0);
        for(int i = 1; i < proizvodi.size(); i = i + 1) {
            if(najskuplji.getCena() < proizvodi.get(i).getCena()) {
                najskuplji = proizvodi.get(i);
            }
        }
        return najskuplji;
    }
}
