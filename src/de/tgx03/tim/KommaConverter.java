package de.tgx03.tim;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class KommaConverter {

    public static void main(String[] args) throws IOException {
        String input = Files.readString(Paths.get(args[0]));
        String output = input.replace(',', '.');
        FileWriter writer = new FileWriter(args[1]);
        writer.write(output);
        writer.close();
    }
}
