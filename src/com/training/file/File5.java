package com.training.file;

import java.io.*;
import java.util.Scanner;

public class File5 {
    public static void main(String[] args) {

        String filename = "some.txt";

        File file = new File(filename);

        if (!file.exists()){
            System.out.println(-1);
        }

        int numOfInts = 0;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {
                scanner.nextInt();
                numOfInts ++;
            }
        } catch (FileNotFoundException e){
            System.out.println(e);
        }

        System.out.println(numOfInts);
    }
}
