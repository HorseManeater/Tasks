package com.training.string;

import java.util.Scanner;

public class String9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        char c1 = scanner.next().charAt(0);
        char c2 = scanner.next().charAt(0);

        String s = "" + c1 + c2;

        System.out.println(s.repeat(len / 2));
    }
}
