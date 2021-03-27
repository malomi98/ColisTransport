package sn.verone.service;

import sn.verone.domain.*;

public interface DisplayService {
    void afficherBienvenu();

    void afficherMenuPrincipal();

    void afficherListeAnnonces(Annonce[] annonces);

    void afficherUserAnnonce(User user);
    void afficherTypeAnnonce(TypeAnnonce typeAnnonce);

    void afficherOptionInconnue();
}
