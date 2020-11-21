package com.training.string;

import java.util.Scanner;

public class String6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char c = input.charAt(0);
        int code = c;

        if (code >= (int) '0' && code <= '9')
            System.out.println("digit");

        if (code >= (int) 'a' && code <= 'z' || code >= (int) 'A' && code <= 'Z')
            System.out.println("lat");

        if (code >= (int) 'а' && code <= 'я' || code >= (int) 'А' && code <= 'Я')
            System.out.println("rus");
    }
}
