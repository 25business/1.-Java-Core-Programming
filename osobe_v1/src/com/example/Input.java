package com.example;

import java.util.Scanner;

public class Input {
    static Scanner input = new Scanner(System.in);

    public static String read_string(String message) {
        System.out.println(message);
        String value = input.nextLine();
        return value;
    }
    public static int read_int(String message) {
        System.out.println(message);
        int value = Integer.parseInt(input.nextLine());
        return value;
    }
    public static double read_double(String message) {
        System.out.println(message);
        double value = Double.parseDouble(input.nextLine());
        return value;
    }
}
