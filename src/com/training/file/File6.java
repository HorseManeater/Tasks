package com.training.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File6 {
    public static void main(String[] args) {

        String filename = "some.txt";
        int k = 6;

        File file = new File(filename);

        if (!file.exists()){
            System.out.println(-1);
        }

        int kthElement = -1;
        int numOfInts = 0;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                numOfInts ++;
                if (numOfInts == k)
                    kthElement = i;
            }
        } catch (FileNotFoundException e){
            System.out.println(e);
        }

        System.out.println(kthElement);
    }
}
