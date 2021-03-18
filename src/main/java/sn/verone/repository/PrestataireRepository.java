package sn.verone.repository;

import sn.verone.domain.Prestataire;
import sn.verone.domain.Prestation;

public interface PrestataireRepository {
    Prestataire[] getAllByPrestation(Prestation prestation);
    Prestataire findById(int idPrestataire);
}
