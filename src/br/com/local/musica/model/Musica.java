package br.com.local.musica.model;

public class Musica extends Audio {
    private String lyrics;
    private String singer;
    private String gender;
    private String album;
   
   
   
   
   
   
       //**************************//GETTERS AND SETTERS//******************************** */
    public String getLyrics() {
        return lyrics;
    }
    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }
    public String getSinger() {
        return singer;
    }
    public void setSinger(String singer) {
        this.singer = singer;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }


}
