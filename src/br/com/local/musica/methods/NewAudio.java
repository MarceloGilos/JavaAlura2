package br.com.local.musica.methods;

import java.util.ArrayList;

import br.com.local.musica.model.Audio;
import br.com.local.musica.model.Musica;
import br.com.local.musica.model.Podcast;

public class NewAudio {
    public static Audio registerAudio() {
        String option;
        while (true) {
            System.out.println("""
                    O audio que vc esta adicionando é:
                    1-Musica
                    2-Podcast
                    """);
            option = ScannerBugFit.scannerBugFitString();
            if (option.equals("1")) {
                Musica musica = new Musica();
                System.out.print("titulo:");
                musica.setTitle(ScannerBugFit.scannerBugFitString());
                System.out.print("nota 0 a 10:");
                musica.setLikes(ScannerBugFit.scannerBugFitInt());
                return musica;

            } else if (option.equals("2")) {
                Podcast podCast = new Podcast();
                System.out.print("titulo:");
                podCast.setTitle(ScannerBugFit.scannerBugFitString());
                System.out.print("nota 0 a 10:");
                podCast.setLikes(ScannerBugFit.scannerBugFitInt());
                return podCast;
            }else{
                System.out.println("VALOR INVALIDO FAVOR ESCOLHA UM VALOR VALIDO");
            }
        }
    }
    public static void selectAudio(ArrayList<Audio> audio){
        ListAudio.listAudio();
        System.out.println("Selecione o Audio que quer deletar:");
        ListAudio.removeAudio(audio.get(ScannerBugFit.scannerBugFitInt()-1));
    }
}