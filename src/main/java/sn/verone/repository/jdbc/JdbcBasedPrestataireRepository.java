package sn.verone.repository.jdbc;

import sn.verone.domain.Prestataire;
import sn.verone.domain.Prestation;
import sn.verone.repository.PrestataireRepository;

public class JdbcBasedPrestataireRepository implements PrestataireRepository {
    public Prestataire[] getAllByPrestation(Prestation prestation) {
        return new Prestataire[0];
    }

    public Prestataire findById(int idPrestataire) {
        return null;
    }
}
