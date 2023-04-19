package br.com.local.musica.methods;

import java.io.IOException;

public class Comandos {
    
    public static void limparTela() throws InterruptedException, IOException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
    
}
