package sn.verone.repository;

import sn.verone.domain.Prestation;

public interface PrestationRepository {
    Prestation[] getAll();
    Prestation getById(int id);
}
