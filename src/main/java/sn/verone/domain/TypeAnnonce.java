package sn.verone.domain;

public class TypeAnnonce {
    private int id;
    private String libelle;

    public TypeAnnonce(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }
}
