package br.com.local.musica.methods;

import java.io.IOException;
import java.util.ArrayList;

import br.com.local.musica.model.Audio;

public class ListAudio {
    private static ArrayList<Audio> arrayAudio = new ArrayList<Audio>();

    public static ArrayList<Audio> getArrayAudio() {
        return arrayAudio;
    }

    public static void addAudio(Audio audio) throws IOException {
        arrayAudio.add(audio);
        System.out.println("Audio adicionado com sucesso!");
        System.in.read();
        Ranking.calculateRaking(arrayAudio);
    };

    public static void removeAudio(Audio audio) throws IOException {
        arrayAudio.remove(audio);
        System.out.println("Audio removido com sucesso!");
        System.in.read();
        Ranking.calculateRaking(arrayAudio);
    }

    public static void listAudio() throws InterruptedException, IOException {
        Comandos.limparTela();
        for (int i = 0; i < arrayAudio.size(); i++) {
            System.out.println((i + 1) + "º-" + arrayAudio.get(i).getTitle() + " Nota:" + arrayAudio.get(i).getLikes());
        }
    }

}
