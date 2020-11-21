package com.training.file;

import java.io.*;
import java.util.Scanner;

public class File8 {
    public static void main(String[] args) {

        String existingFile = "some.txt";
        String newFile = "another.txt";

        int numOfElements = 0;
        try (
                Scanner scanner = new Scanner(new File(existingFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(newFile));
        ) {
            String s = "";
            while (scanner.hasNext()) {
                s = scanner.next();
                numOfElements++;
                if (numOfElements == 1)
                    writer.write(s + " ");
            }
            writer.write(s);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
