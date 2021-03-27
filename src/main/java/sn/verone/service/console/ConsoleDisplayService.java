package sn.verone.service.console;

import sn.verone.domain.*;
import sn.verone.service.DisplayService;

public class ConsoleDisplayService implements DisplayService {


    public void afficherBienvenu() {
        System.out.println("Bienvenu sur la plateforme colis transfert!");
    }

    public void afficherMenuPrincipal() {
        System.out.println("> l pour lister les annonces disponibles ");
    }

    public void afficherListeAnnonces(Annonce[] annonces) {
        System.out.println("Les anonces disponibles sont:");
        for (int i = 0; i < annonces.length; i++) {
            Annonce annonce = annonces[i];
            System.out.println(String.format(">" +
                    " Id: %s \n" +
                    "Nombre de kilos: %s \n" +
                    "Prix par kilos: %s \n" +
                    "Date de depart %s \n" +
                    "Date d'arrivee %s \n " +
                    "Lieu de depart %s \n " +
                    "Lieu d'arrivee %s \n " +
                    "Telephone principal %s \n" +
                    "Telephone secondaire %s \n", annonce.getId(), annonce.getNbrKg(), annonce.getPrixKilo(), annonce.getDateD(), annonce.getDateA(), annonce.getLieuDepart(), annonce.getLieuArrive(), annonce.getTelDepart(), annonce.getTelArrive()));
        }
    }

    @Override
    public void afficherUserAnnonce(User user) {
        System.out.println(String.format("L'utilisateur qui a emis cette annonce est :"));
        System.out.println(String.format("> " +
                "Id: %s \n" +
                "Nom complet: %s\n" +
                "numero de la carte: %s\n", user.getId(), user.getNomComplet(), user.getNumCarte()));
    }

    @Override
    public void afficherTypeAnnonce(TypeAnnonce typeAnnonce) {
        System.out.println(String.format("Cette annonce est de type :"));
        System.out.println(String.format("> " +
                "Id: %s \n" +
                "Libelle : %s\n", typeAnnonce.getId(),  typeAnnonce.getLibelle()));
    }

    public void afficherOptionInconnue() {
        System.out.println("Choix inconnu");
    }
}
