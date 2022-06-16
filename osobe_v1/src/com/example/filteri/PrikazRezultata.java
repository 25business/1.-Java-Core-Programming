package com.example.filteri;

import com.example.Osoba;
import java.util.ArrayList;

public class PrikazRezultata {

    public static void print(ArrayList<Osoba> filter_osoba) {
        if(filter_osoba.size() == 0) {
            System.err.println("Nema osoba koje odgovaraju unetom kriterijumu. ");
        } else {
            for(int i = 0; i < filter_osoba.size(); i = i + 1) {
                System.out.println(filter_osoba.get(i));
            }
        }
    }
}