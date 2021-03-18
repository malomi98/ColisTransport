package sn.verone.repository.jdbc;

import sn.verone.domain.Lieu;
import sn.verone.repository.LieuRepository;

public class JdbcBasedLieuRepository implements LieuRepository {
    public Lieu[] getAll() {
        return new Lieu[0];
    }

    public Lieu findById(int idLieu) {
        return null;
    }
}
