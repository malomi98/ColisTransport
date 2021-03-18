package sn.verone.service;

import sn.verone.domain.Prestataire;
import sn.verone.domain.Prestation;

public interface DisplayService {
    void afficherBienvenu();

    void afficherMenuPrincipal();

    void afficherListeServices(Prestation[] prestations);

    void afficherPrestataires(Prestation prestation, Prestataire[] prestataires);

    void afficherDetailsPrestation();

    void afficherDetailsContrat();

    void afficherDemandeHeure();

    void afficherConfirmation(String heure);

    void afficherOptionInconnue();
}
