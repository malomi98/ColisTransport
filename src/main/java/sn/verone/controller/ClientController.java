package sn.verone.controller;

import sn.verone.repository.DetailPrestationRepository;
import sn.verone.repository.PrestataireRepository;
import sn.verone.repository.PrestationRepository;
import sn.verone.repository.jdbc.DataSource;
import sn.verone.repository.jdbc.JdbcBasedPrestationRepository;
import sn.verone.repository.jdbc.MysqlDataSource;
import sn.verone.repository.ram.ArrayBasedDetailPrestationRepository;
import sn.verone.repository.ram.ListBasedPrestataireRepository;
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
        DetailPrestationRepository detailPrestationRepository = new ArrayBasedDetailPrestationRepository();
        DataSource dataSource = new MysqlDataSource();
        displayService = new ConsoleDisplayService(detailPrestationRepository);
        PrestationRepository prestationRepository = new JdbcBasedPrestationRepository(dataSource);
        PrestataireRepository prestataireRepository = new ListBasedPrestataireRepository();
        scannerMenuService = new ScannerMenuService(displayService, prestationRepository, prestataireRepository );
    }

    public void process(){

        displayService.afficherBienvenu();
        displayService.afficherMenuPrincipal();
        scannerMenuService.afficherMenu();
    }


}
