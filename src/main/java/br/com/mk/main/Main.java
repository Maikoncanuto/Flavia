package br.com.mk.main;

import br.com.mk.core.Arquivo;
import br.com.mk.core.Download;

public class Main {
    public static void main(String[] args) {
        try{
            /***
             * Exemplo de utilização:
             * Download.videoVimeo(Arquivo.get(caminhoDoArquivo), numeroDeLinks);
             * 1 - CaminhoDoArquivo: Caminho onde está localizado o arquivo com os links.
             * 2 - numeroDeLinks: Quantidade de links que devem ser baixados no intervalo de 10 minutos.
             *
             * Driver padrão utilizado é Chrome. Caso precise utilizar outro, use:
             * Download.setDriver(new Firefox());
             * Download.setDriver(new PhantomJSDriver());
             */
            Download.videoVimeo(Arquivo.get("links.txt"), 6);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
