package sn.verone.repository.ram;

import sn.verone.domain.Prestataire;
import sn.verone.domain.Prestation;
import sn.verone.repository.PrestataireRepository;

import java.util.ArrayList;
import java.util.List;

public class ListBasedPrestataireRepository implements PrestataireRepository {
    private final List<Prestataire> prestataires;

    public ListBasedPrestataireRepository() {
        this.prestataires = new ArrayList<Prestataire>();
    }


    public Prestataire[] getAllByPrestation(Prestation prestation){
        prestataires.add(new Prestataire(1, "Abdoulaye", "Ndiayre", prestation));
        prestataires.add(new Prestataire(2, "Alassane", "Sene", prestation));
        prestataires.add(new Prestataire(3, "Fatou", "Thiam", prestation));
        //return prestataires.toArray();
        return prestataires.toArray(new Prestataire[0]);
    }


    public Prestataire findById(int idPrestataire) {
        return null;
    }
}
