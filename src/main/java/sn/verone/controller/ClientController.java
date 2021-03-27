package sn.verone.controller;

import sn.verone.repository.AnnonceRepository;
import sn.verone.repository.jdbc.DataSource;
import sn.verone.repository.jdbc.JdbcBasedAnnonceRepository;
import sn.verone.repository.jdbc.MysqlDataSource;
import sn.verone.service.DisplayService;
import sn.verone.service.MenuService;
import sn.verone.service.console.ConsoleDisplayService;
import sn.verone.service.console.ScannerMenuService;


/**
 * End point destiné aux clients
 * Deux fonctionnalités (services)
 * 1 - Afficher le menu au client : ConsoleDisplayService
 * 2 - Lire les choix du client et afficher le sous-menu correspondant : ScannerMenuService
 */
public class ClientController {
    private final DisplayService displayService ;
    private final MenuService scannerMenuService ;

    public ClientController(){
        DataSource dataSource = new MysqlDataSource();
        displayService = new ConsoleDisplayService();
        AnnonceRepository annonceRepository = new JdbcBasedAnnonceRepository(dataSource);
        scannerMenuService = new ScannerMenuService(displayService, annonceRepository);
    }

    public void process(){

        displayService.afficherBienvenu();
        displayService.afficherMenuPrincipal();
        scannerMenuService.afficherMenu();
    }


}
