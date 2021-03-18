package sn.verone.repository;

import sn.verone.domain.User;

public interface UserRepository {
    User[] getAll();
    User findById(int idUser);
}
