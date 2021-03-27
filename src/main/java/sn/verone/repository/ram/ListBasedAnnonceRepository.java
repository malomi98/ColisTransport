package sn.verone.repository.ram;

import sn.verone.domain.Annonce;
import sn.verone.domain.TypeAnnonce;
import sn.verone.domain.User;
import sn.verone.repository.AnnonceRepository;

import java.util.ArrayList;
import java.util.List;

public class ListBasedAnnonceRepository implements AnnonceRepository {
    private final List<Annonce> annonces;

    public ListBasedAnnonceRepository() {
        this.annonces = new ArrayList<Annonce>();
    }

    @Override
    public Annonce[] getAll() {
        annonces.add(new Annonce(1, 23, 5000, "16/03/2021", "17/02/2021", "Dakar", "Paris", "778102134", "003312233121", null, null ));
        annonces.add(new Annonce(2, 13, 10000, "18/03/2021", "20/02/2021", "Paris", "Dakar", "003312233232", "778923145", null, null ));
        return annonces.toArray(new Annonce[0]);
    }

    public Annonce findById(int idAnnonce) {
        return null;
    }
}
