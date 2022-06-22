package com.example;

import com.example.proizvodi.*;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        //Patike p = new Patike("PATIKE GRAND COURT K GPG", "patike", 3839.99, "Adidas", 36, "zenske");
        //Majica m = new Majica("Nike M NSW SI 2 OPEN TEE", "majice", 2309.30, "Nike", "L", "muski");
        //System.out.println(p);
        //System.out.println(m);

        ArrayList<Proizvod> proizvodi = new ArrayList<>();
        proizvodi.add(new Patike("PATIKE GRAND COURT K GPG", "patike", 3839.99, "Adidas", 36, "zenske"));
        proizvodi.add(new Majica("Nike M NSW SI 2 OPEN TEE", "majice", 2309.30, "Nike", "L", "muski"));
        proizvodi.add(new Patike("PATIKE New Balance", "patike", 7800.99, "New Balance", 37, "zenske"));

        for(Proizvod p : proizvodi) {
            System.out.println(p);
        }
        System.out.println("-- Pretraga po kategoriji --");
        ArrayList<Proizvod> proizvod_kategorija = ProizvodiZaKategoriju.rezultat(proizvodi, "majice");
        for(Proizvod p : proizvod_kategorija) {
            System.out.println(p);
        }
        System.out.println("-- Najskuplji proizvod --");
        Proizvod najskuplji = ProizvodNajskuplji.rezultat(proizvodi);
        System.out.println(najskuplji);

        System.out.println("-- Cenovni Opseg --");
        ArrayList<Proizvod> proizvod_opseg = ProizvodCenovniOpseg.rezultat(proizvodi, 2000, 5000);
        for( Proizvod p : proizvod_opseg) {
            System.out.println(p);
        }
    }
}