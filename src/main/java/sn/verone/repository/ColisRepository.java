package sn.verone.repository;

import sn.verone.domain.Colis;

public interface ColisRepository {
    Colis[] getAll();
    Colis findById(int idColis);
}
