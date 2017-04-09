package br.com.mk.core;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maikon Canuto on 08/04/2017.
 */
public class Download {

    private static WebDriver navegador = Driver.getDriver();

    public static void videoVimeo(List<String> linhas, Integer conjuntoLinks)throws InterruptedException{
        Integer quantidadeLinks = 0;
        Integer quantidadeLinksNoArquivo = linhas.size();
        Integer quantidadeLinksLidos = 0;

        System.out.println("QUANTIDADE TOTAL DE LINKS: " + quantidadeLinksNoArquivo);
        System.out.println("CONJUNTO DE LINKS: " + conjuntoLinks + "\n");

        for(String linha : linhas){
            System.out.println("DOWNLOAD LINK: " + linha);
            navegador.get(linha);
            quantidadeLinks++;

            if(quantidadeLinks == conjuntoLinks){
                System.out.println("[*] - PROCESSANDO LINKS ANTERIORES");
                Thread.sleep(600000);
                quantidadeLinks = 0;
            }

            quantidadeLinksLidos++;
        }

        System.out.println("QUANTIDADE DE LINKS NO ARQUIVO: " + quantidadeLinksNoArquivo);
        System.out.println("QUANTIDADE DE LINKS LIDOS: " + quantidadeLinksLidos);

        if(quantidadeLinksLidos == quantidadeLinksNoArquivo){
            System.out.println("TODOS OS LINKS FORAM BAIXADOS COM SUCESSO");
        }else{
            System.out.println("FALHA!");
        }
    }
}
