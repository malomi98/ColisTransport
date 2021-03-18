package sn.verone.repository.jdbc;

import sn.verone.domain.Colis;
import sn.verone.repository.ColisRepository;

public class JdbcBasedColisRepository implements ColisRepository {
    public Colis[] getAll() {
        return new Colis[0];
    }

    public Colis findById(int idColis) {
        return null;
    }
}
