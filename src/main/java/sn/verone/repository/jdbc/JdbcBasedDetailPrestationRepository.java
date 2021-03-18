package sn.verone.repository.jdbc;

import sn.verone.domain.DetailPrestation;
import sn.verone.repository.DetailPrestationRepository;

public class JdbcBasedDetailPrestationRepository implements DetailPrestationRepository {
    public DetailPrestation[] getAll() {
        return new DetailPrestation[0];
    }
}
