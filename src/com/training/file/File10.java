package com.training.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class File10 {
    public static void main(String[] args) {

        String firstFileName = "some.txt";
        String secondFileName = "another.txt";

        List<String> elements = new ArrayList<>();

        try (
                Scanner scanner = new Scanner(new File(firstFileName));
                BufferedWriter writer = new BufferedWriter(new FileWriter(secondFileName));
        ) {
            while (scanner.hasNext()) {
                String s = scanner.next();
                elements.add(s);
            }
            for (int i = elements.size() - 1; i >= 0; i--) {
                writer.write(elements.get(i) + " ");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
