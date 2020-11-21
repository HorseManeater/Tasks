package com.training.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File9 {
    public static void main(String[] args) {

        String firstFileName = "some.txt";
        String secondFileName = "another.txt";

        File firstFile = new File(firstFileName);
        File secondFile = new File(secondFileName);

        File existingFile;
        File newFile;

        if (firstFile.exists()) {
            existingFile = firstFile;
            newFile = secondFile;
        } else {
            existingFile = secondFile;
            newFile = firstFile;
        }

        int numOfElements = 0;
        String firstElement = "";
        try (
                Scanner scanner = new Scanner(existingFile);
                BufferedWriter writer = new BufferedWriter(new FileWriter(newFile));
        ) {
            String s = "";
            while (scanner.hasNext()) {
                s = scanner.next();
                numOfElements++;
                if (numOfElements == 1)
                    firstElement = s;
            }
            writer.write(s + " ");
            writer.write(firstElement);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
