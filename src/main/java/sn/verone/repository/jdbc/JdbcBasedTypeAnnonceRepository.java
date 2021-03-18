package sn.verone.repository.jdbc;

import sn.verone.domain.TypeAnnonce;
import sn.verone.repository.TypeAnnonceRepository;

public class JdbcBasedTypeAnnonceRepository implements TypeAnnonceRepository {
    public TypeAnnonce[] getAll() {
        return new TypeAnnonce[0];
    }

    public TypeAnnonce findById(int idType) {
        return null;
    }
}
