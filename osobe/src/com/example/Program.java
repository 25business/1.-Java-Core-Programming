package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        ArrayList<Osoba> osobe = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("""
                    --- Osobe ---
                    [1] Prikaz osoba
                    [2] Dodavanje osoba
                    [3] Pretraga po godistu
                    [4] Pretraga po imenu
                    [5] Pretraga po opsegu zarade
                    [6] Najstarija osoba
                    [7] Najmljadja osoba
                    [8] Izmena podatala osoba
                    [9] Brisanje osoba
                    [Q] Izlaz
                    Vas izbor: """);
            String izbor = input.nextLine();
            if(izbor.equals("1")) {
                for(int i = 0; i < osobe.size(); i = i + 1) {
                    System.out.println(osobe.get(i));
                }
            } else if(izbor.equals("2")) {
                Osoba o = new Osoba();
                System.out.println("Unesite ime: ");
                o.setIme(input.nextLine());
                System.out.println("Unesite prezime: ");
                o.setPrezime(input.nextLine());
                System.out.println("Unesite godinu rodjenja: ");
                o.setGodiste(Integer.parseInt(input.nextLine()));
                osobe.add(o);
            } else if(izbor.equals("3")) {
                System.out.println("Unesite godiste za pretragu: ");
                int godiste = Integer.parseInt(input.nextLine());
                ArrayList<Osoba> filter_osoba = new ArrayList<>();

                for(int i = 0; i < osobe.size(); i = i + 1) {
                    Osoba tmp_osoba = osobe.get(i);
                    if(tmp_osoba.getGodiste().equals(godiste)) {
                        filter_osoba.add(tmp_osoba);
                    }
                }
                if(filter_osoba.size() == 0) {
                    System.err.println("Nema osoba koje odgovaraju unetom kriterijumu");
                } else{
                    for(int i = 0; i < filter_osoba.size(); i = i + 1) {
                        System.out.println(filter_osoba.get(i));
                    }
                }

            } else if(izbor.equals("4")) {
                System.out.println("Unesite ime za pretragu: ");
                String ime = input.nextLine();
                ArrayList<Osoba> filter_osoba = new ArrayList<>();

                for(int i = 0; i < osobe.size(); i = i + 1) {
                    Osoba tmp_osoba = osobe.get(i);
                    if(tmp_osoba.getIme().equals(ime)) {
                        filter_osoba.add(tmp_osoba);
                    }
                }
                if(filter_osoba.size() == 0) {
                    System.err.println("Nema osoba koje odgovaraju unetom kriterijumu");
                } else {
                    for(int i = 0; i < filter_osoba.size(); i = i + 1) {
                        System.out.println(filter_osoba.get(i));
                    }
                }
            } else if(izbor.toUpperCase().equals("Q")) {
                break;
            } else {
                System.err.println("Neispravna opcija!");
            }
        }
    }
}
