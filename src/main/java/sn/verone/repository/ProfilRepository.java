package sn.verone.repository;

import sn.verone.domain.Profil;

public interface ProfilRepository {
    Profil[] getAll();
    Profil findById(int idProfil);
}
