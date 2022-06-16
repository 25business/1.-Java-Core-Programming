package com.example;

import com.example.filteri.*;
import com.example.obrada.AzuriranjeOsobe;
import com.example.obrada.BrisanjeOsobe;
import com.example.obrada.DodavanjeOsobe;
import com.example.obrada.IspisOsoba;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        ArrayList<Osoba> osobe = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Osoba[] test_osobe = new Osoba[] {
                new Osoba("John", "Doe", 1978, 1000),
                new Osoba("Jane", "Doe", 1975, 8000),
                new Osoba("John", "Smith", 1965, 6000),
                new Osoba("Anna", "Smith", 1982, 3000),
                new Osoba("Juliette", "Moore", 1972, 7500)
        };
        osobe.addAll(Arrays.asList(test_osobe));
        while(true) {
        System.out.print("""
                 --- OSOBE ---
                 [1] Prikaz osobe
                 [2] Dodavanje osobe
                 [3] Pretraga po godistu
                 [4] Pretraga po imenu
                 [5] Pretraga po opsegu zarade
                 [6] Najstarija osoba
                 [7] Najmladja osoba
                 [8] Izmena podataka osobe
                 [9] Brisanje osobe
                 [Q] Izlaz
                 Vas izbor:""");
        String izbor;
        izbor = input.nextLine();

            if(izbor.equals("1")) {
                IspisOsoba.prikaz(osobe);
            } else if(izbor.equals("2")) {
                DodavanjeOsobe.kreiraj(osobe);
            } else if(izbor.equals("3")) {
                int godiste = Input.read_int("Unesite godiste za pretragu: ");
                ArrayList<Osoba> filter_osoba = PretragaGodiste.rezultat(osobe, godiste);
                PrikazRezultata.print(filter_osoba);
            } else if(izbor.equals("4")) {
                String ime = Input.read_string("Unesite ime za pretragu: ");
                ArrayList<Osoba> filter_osoba = PretragaIme.rezultat(osobe, ime);
                PrikazRezultata.print(filter_osoba);
            } else if(izbor.equals("5")) {
                double min_plata = Input.read_double("Unesite minimalnu platu: ");
                double max_plata = Input.read_double("Unesite maksimalnu platu: ");
                ArrayList<Osoba> filter_osoba = PretragaOpsegPlata.rezultat(osobe, min_plata, max_plata);
                PrikazRezultata.print(filter_osoba);
            } else if(izbor.equals("6")) {
                Osoba najstarija = PretragaNajstarija.rezultat(osobe);
                System.out.println(najstarija);
            } else if(izbor.equals("7")) {
                Osoba najmladja = PretragaNajmladja.rezultat(osobe);
                System.out.println(najmladja);
            } else if(izbor.equals("8")) {
                IspisOsoba.prikaz(osobe);
                int index = Input.read_int("Unesite indeks osobe koju zelite da azurirate: ");
                AzuriranjeOsobe.azuriranje(osobe, index);
            } else if(izbor.equals("9")) {
                IspisOsoba.prikaz(osobe);
                int index = Input.read_int("Unesite indeks osobe koju zelite da izbrisete: ");
                BrisanjeOsobe.brisanje(osobe, index);
            } else if(izbor.toUpperCase().equals("Q")) {
                break;
            }
        }
    }
}