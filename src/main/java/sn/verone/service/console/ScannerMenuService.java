package sn.verone.service.console;

import sn.verone.domain.*;
import sn.verone.repository.AnnonceRepository;
import sn.verone.service.DisplayService;
import sn.verone.service.MenuService;

import java.util.Scanner;

public class ScannerMenuService implements MenuService {
    private final DisplayService displayService;
    private final Scanner scanner;
    private final AnnonceRepository annonceRepository;

    public ScannerMenuService(DisplayService displayService, AnnonceRepository annonceRepository) {
        this.displayService = displayService;
        this.annonceRepository = annonceRepository;
        this.scanner = new Scanner(System.in);
    }


    private String lireChoix() {
        return scanner.next();
    }

    private void afficherMenu( String choix) {
        Annonce[] annonces = annonceRepository.getAll();
        if("l".equalsIgnoreCase(choix)){
            displayService.afficherListeAnnonces(annonces);
            System.out.println("Saisir l'id d'une annonce pour voir ses details : \n");
            int idAnnonce = scanner.nextInt();

            //get annonce by id
            Annonce annonce = annonceRepository.findById(idAnnonce);
            //get type by annonce
            TypeAnnonce type = annonce.getTypeAnnonce();
            //afficher le type de cette annonce
            displayService.afficherTypeAnnonce(type);

            //get user by annonce
            User user = annonce.getUser();
            //afficher l'utilisateur qui a pubie cette annonce
            displayService.afficherUserAnnonce(user);
        }
        //afficher le menu inconnu
        else {
            displayService.afficherOptionInconnue();
        }
    }

    public void afficherMenu() {
        String choix = lireChoix();
        afficherMenu(choix );
    }
}
