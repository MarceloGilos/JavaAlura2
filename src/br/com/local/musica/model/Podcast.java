package br.com.local.musica.model;

public class Podcast extends Audio {
    private String name;
    private String visitor;
    private String presenter; 


        //**************************//GETTERS AND SETTERS//******************************** */
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getVisitor() {
        return visitor;
    }
    public void setVisitor(String visitor) {
        this.visitor = visitor;
    }
    public String getPresenter() {
        return presenter;
    }
    public void setPresenter(String presenter) {
        this.presenter = presenter;
    }
    
}
