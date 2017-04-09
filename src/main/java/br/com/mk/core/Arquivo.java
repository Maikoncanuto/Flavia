package br.com.mk.core;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Maikon Canuto on 08/04/2017.
 */
public class Arquivo {

    public static List<String> get(String caminho) throws IOException{
        return Files.readAllLines(Paths.get(caminho));
    }
}
