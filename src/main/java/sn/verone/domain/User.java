package sn.verone.domain;

public class User {
    private int id;
    private String numCarte;
    private String nationalite;
    private String email;
    private String password;
    private String photo;
    private String nomComplet;
    private String adresse;
    private Profil profil;
    
    public User(){
        
    }

    public User(int id, String numCarte, String nomComplet) {
        this.id = id;
        this.numCarte = numCarte;
        this.nomComplet = nomComplet;
    }

    public User(int id, String numCarte, String nationalite, String email, String password, String photo, String nomComplet, String adresse, Profil profil) {
        this.id = id;
        this.numCarte = numCarte;
        this.nationalite = nationalite;
        this.email = email;
        this.password = password;
        this.photo = photo;
        this.nomComplet = nomComplet;
        this.adresse = adresse;
        this.profil = profil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumCarte() {
        return numCarte;
    }

    public void setNumCarte(String numCarte) {
        this.numCarte = numCarte;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Profil getProfil() {
        return profil;
    }

    public void setProfil(Profil profil) {
        this.profil = profil;
    }
}
