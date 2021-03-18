package sn.verone.repository.jdbc;

import sn.verone.domain.Annonce;
import sn.verone.domain.TypeAnnonce;
import sn.verone.domain.User;
import sn.verone.repository.AnnonceRepository;

public class JdbcBasedAnnonceRepository implements AnnonceRepository {
    public Annonce[] getAllByUser(User user, TypeAnnonce type) {
        return new Annonce[0];
    }

    public Annonce findById(int idAnnonce) {
        return null;
    }
}
