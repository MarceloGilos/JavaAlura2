package br.com.local.musica.model;

public class Audio implements Comparable<Audio>  {
    private String title;
    private double time;
    private int numberReproduction;
    private int likes;
    private int ranking;



    //**************************//GETTERS AND SETTERS//******************************** */
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public double getTime() {
        return time;
    }
    public void setTime(double time) {
        this.time = time;
    }
    public int getNumberReproduction() {
        return numberReproduction;
    }
    public void setNumberReproduction(int numberReproduction) {
        this.numberReproduction = numberReproduction;
    }
    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }
    public int getRanking() {
        return ranking;
    }
    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
    
    
    @Override
    public int compareTo(Audio outro) {
     
    return Integer.compare(this.getLikes(), outro.getLikes());
    }
    
    
    
    

    
}
