package sn.verone.domain;

public class Lieu {
    private int id;
    private String nom;
    private String date;

    public Lieu(int id, String nom, String date) {
        this.id = id;
        this.nom = nom;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getDate() {
        return date;
    }
}
