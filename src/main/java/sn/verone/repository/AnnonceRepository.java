package sn.verone.repository;

import sn.verone.domain.Annonce;
import sn.verone.domain.TypeAnnonce;
import sn.verone.domain.User;

public interface AnnonceRepository {
    Annonce[] getAllByUser(User user, TypeAnnonce type);
    Annonce findById(int idAnnonce);
}
