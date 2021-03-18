package sn.verone.repository;

import sn.verone.domain.TypeAnnonce;

public interface TypeAnnonceRepository {
    TypeAnnonce[] getAll();
    TypeAnnonce findById(int idType);
}
