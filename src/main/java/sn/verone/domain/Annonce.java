package sn.verone.domain;

public class Annonce {
    private int id;
    private int nbrKg;
    private int prixKilo;
    private String dateD;
    private String dateA;
    private String lieuDepart;
    private String lieuArrive;
    private String telDepart;
    private String telArrive;
    private User user;
    private TypeAnnonce typeAnnonce;

    public Annonce(int id, int nbrKg, int prixKilo, String dateD, String dateA, String lieuDepart, String lieuArrive, String telDepart, String telArrive, User user, TypeAnnonce typeAnnonce) {
        this.id = id;
        this.nbrKg = nbrKg;
        this.prixKilo = prixKilo;
        this.dateD = dateD;
        this.dateA = dateA;
        this.lieuDepart = lieuDepart;
        this.lieuArrive = lieuArrive;
        this.telDepart = telDepart;
        this.telArrive = telArrive;
        this.user = user;
        this.typeAnnonce = typeAnnonce;
    }

    public int getId() {
        return id;
    }

    public int getNbrKg() {
        return nbrKg;
    }

    public int getPrixKilo() {
        return prixKilo;
    }

    public String getDateD() {
        return dateD;
    }

    public String getDateA() {
        return dateA;
    }

    public String getLieuDepart() {
        return lieuDepart;
    }

    public String getLieuArrive() {
        return lieuArrive;
    }

    public String getTelDepart() {
        return telDepart;
    }

    public String getTelArrive() {
        return telArrive;
    }

    public User getUser() {
        return user;
    }

    public TypeAnnonce getTypeAnnonce() {
        return typeAnnonce;
    }
}
