package com.training.file;

import java.io.File;
import java.io.IOException;

public class File1 {
    public static void main(String[] args) {

        boolean success;
        String filename = "some.txt";

        try {
            // "." означает ссылку на нынешнюю директорию. Файл будет создан в src
            File file = new File(".", filename);
            success = file.createNewFile();
        } catch (IOException e){
            success = false;
        }

        System.out.println(success ? "True" : "False");
    }
}
