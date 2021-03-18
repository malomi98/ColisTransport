package sn.verone.domain;

public class Profil {
    private int id;
    private String libelle;
    private String code;

    public Profil(int id, String libelle, String code) {
        this.id = id;
        this.libelle = libelle;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getLibelle() {
        return libelle;
    }
}
