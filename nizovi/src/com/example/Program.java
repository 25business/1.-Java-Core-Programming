package com.example;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] brojevi = new int[] {7,8,6,5,4,3,2};

        brojevi[2] = 1;
        //System.out.println(brojevi[2]);
        System.out.println(Arrays.toString(brojevi));

        int[] brojevi_2 = new int[5];
        brojevi_2[0] = 8;
        brojevi_2[1] = 7;
        brojevi_2[2] = 6;
        brojevi_2[3] = 4;
        brojevi_2[4] = 9;
        System.out.println(brojevi_2[2]);

        String[] imena = new String[] {"Marija", "Marko", "Jovan", "Jovana"};

        System.out.println(imena.length);

        Proizvod[] proizvodi = new Proizvod[] {
            new Proizvod("Cokolada", 100, 0.2),
            new Proizvod("Mleko", 97, 0.2),
            new Proizvod("Hleb", 36, 0.2)
        };
        System.out.println(proizvodi[1].za_ispis());

    }
}