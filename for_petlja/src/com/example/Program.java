package com.example;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        /*
        for(int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        } */
        /*
        for(int i = 10; i <= 50; i = i + 5) {
            System.out.println(i);
        } */
        /*
        for(int i = 50; i >= 25; i = i - 2) {
            System.out.println(i);
        } */
        /*
        for(int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        } */
        /*
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite pocetnu vrednost: ");
        int start = Integer.parseInt(input.nextLine());
        System.out.println("Unesite krajnju vrednost: ");
        int end = Integer.parseInt(input.nextLine());
        System.out.println("Unesite korak: ");
        int step = Integer.parseInt(input.nextLine());

        for(int i = start; i <= end; i = i + step) {
            System.out.println(i);
        }*/
        /*
        for(double i = -1; i <= 1; i = i + 0.05) {
            System.out.println(i);
        }*/

        Scanner input = new Scanner(System.in);

        System.out.println("Unesite pocetnu vrednost: ");
        double start = Double.parseDouble(input.nextLine());
        System.out.println("Unesite krajnju vrednost: ");
        double end = Double.parseDouble(input.nextLine());
        System.out.println("Unesite korak: ");
        double step = Double.parseDouble(input.nextLine());

        for(double i = start; i >= end; i = i - step) {
            System.out.println(i);
        }
    }
}
