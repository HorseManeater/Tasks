package com.training.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File7 {
    public static void main(String[] args) {

        String filename = "some.txt";
        File file = new File(filename);

        int numOfInts = 0;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                numOfInts ++;
                if (numOfInts <= 4)
                    System.out.println(i);
            }
        } catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
}
