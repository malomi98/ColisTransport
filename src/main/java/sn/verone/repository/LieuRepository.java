package sn.verone.repository;

import sn.verone.domain.Lieu;

public interface LieuRepository {
    Lieu[] getAll();
    Lieu findById(int idLieu);
}
