package org.example.clase3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Alumnos {


    public File get_file(String path) {
        return new File(path);
    }


    public void reader_file(File file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String st;

        while ((st = bufferedReader.readLine()) != null) {
            System.out.println(st);
        }

    }
}