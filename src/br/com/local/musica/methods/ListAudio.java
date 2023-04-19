package br.com.local.musica.methods;

import java.util.ArrayList;

import br.com.local.musica.model.Audio;

public class ListAudio {
    private static ArrayList<Audio> arrayAudio = new ArrayList<Audio>();

    public static ArrayList<Audio> getArrayAudio() {
        return arrayAudio;
    }

    public static void addAudio(Audio audio) {
        arrayAudio.add(audio);
        System.out.println("Audio adicionado com sucesso!");
        Ranking.calculateRaking(arrayAudio);
    };

    public static void removeAudio(Audio audio) {
        arrayAudio.remove(audio);
        System.out.println("Audio removido com sucesso!");
        Ranking.calculateRaking(arrayAudio);
    }

    public static void listAudio() {
        for (int i = 0; i < arrayAudio.size(); i++) {
            System.out.println((i + 1) + "º-" + arrayAudio.get(i).getTitle() + "Nota:" + arrayAudio.get(i).getLikes());
        }
    }

}
