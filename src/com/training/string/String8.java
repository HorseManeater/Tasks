package com.training.string;

import java.util.Scanner;

public class String8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        char c = scanner.next().charAt(0);

        System.out.println(String.valueOf(c).repeat(len));
    }
}
