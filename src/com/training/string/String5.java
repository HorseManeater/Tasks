package com.training.string;

import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {
        int letterZCode = 122;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++)
            System.out.println((char) (letterZCode - i));
    }
}

