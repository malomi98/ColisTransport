package sn.verone.domain;

public class Colis {
    private int id;
    private String libelle;
    private String dateRemise;
    private int poids;
    private int montantPaye;
    private Lieu lieuDepart;
    private Lieu lieuArrive;
    private User transporteur;
    private User envoyeur;

    public Colis(int id, String libelle, String dateRemise, int poids, int montantPaye, Lieu lieuDepart, Lieu lieuArrive, User transporteur, User envoyeur) {
        this.id = id;
        this.libelle = libelle;
        this.dateRemise = dateRemise;
        this.poids = poids;
        this.montantPaye = montantPaye;
        this.lieuDepart = lieuDepart;
        this.lieuArrive = lieuArrive;
        this.transporteur = transporteur;
        this.envoyeur = envoyeur;
    }

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getDateRemise() {
        return dateRemise;
    }

    public int getPoids() {
        return poids;
    }

    public int getMontantPaye() {
        return montantPaye;
    }

    public Lieu getLieuDepart() {
        return lieuDepart;
    }

    public Lieu getLieuArrive() {
        return lieuArrive;
    }

    public User getTransporteur() {
        return transporteur;
    }

    public User getEnvoyeur() {
        return envoyeur;
    }
}
