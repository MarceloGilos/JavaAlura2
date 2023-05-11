package br.com.local.musica.methods;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;

import br.com.local.musica.model.Audio;

public class Ranking {
    public static void calculateRaking(ArrayList<Audio> arrayAudio){
        Collections.sort(arrayAudio);
        // arrayAudio.sort((a1, a2) -> Integer.compare(a2.getLikes(), a1.getLikes()));
        for(int i = 0;i < arrayAudio.size();i++){
            arrayAudio.get(i).setRanking(i+1);
        }
        // arrayAudio.sort(Comparator.comparing(Audio::getRanking));
    }
    
}
