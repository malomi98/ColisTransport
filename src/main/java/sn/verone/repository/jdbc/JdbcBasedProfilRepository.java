package sn.verone.repository.jdbc;

import sn.verone.domain.Profil;
import sn.verone.repository.ProfilRepository;

public class JdbcBasedProfilRepository implements ProfilRepository{
    
    public Profil[] getAll() {
        return new Profil[0];
    }

    public Profil findById(int id){
        return null;
    }
}
