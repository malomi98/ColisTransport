package sn.verone.repository.ram;

import sn.verone.domain.DetailPrestation;
import sn.verone.domain.Prestation;
import sn.verone.domain.Profil;
import sn.verone.repository.ProfilRepository;

public class ArrayBasedProfilRepository implements ProfilRepository {

    public static final Profil[] PROFILS = {
            new Profil(1, "ADMIN", "ADMINISTRATEUR"),
            new Profil(2, "ENV", "ENVOYEUR"),
    };
    public Profil[] getAll() {
        return PROFILS;
    }

    public Profil findById(int idProfil) {
        for (int i = 0; i < PROFILS.length; i++) {
            if(idProfil == PROFILS[i].getId()){
                return PROFILS[i];
            }
        }
        return null;
    }
}
