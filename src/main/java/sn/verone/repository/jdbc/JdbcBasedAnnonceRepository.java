package sn.verone.repository.jdbc;

import sn.verone.domain.Annonce;
import sn.verone.domain.TypeAnnonce;
import sn.verone.domain.User;
import sn.verone.repository.AnnonceRepository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcBasedAnnonceRepository implements AnnonceRepository {
    private final DataSource dataSource;

    public JdbcBasedAnnonceRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    List<Annonce> listGlobalAnnoces = null;

    public Annonce[] getAll() {
        String query = "SELECT a.id as idAnn, a.nbr_kg as nbr_kgAnn, a.prix_kg as prix_kgAnn, a.date_depart as dateDepart, a.date_arrive as dateArrive, a.lieu_depart as lieuDepart, a.lieu_arrive as lieuArrive, a.tel_depart as telDepart, a.tel_arrive as telArrive, u.id as idUser, u.nom_complet as nomComplet, u.numcarte as numCarte, t.id as typeAnnonce, t.libelle as libTypeAnnonce  FROM annonce a, user u, type_annonce t where a.type_annonce_id=t.id AND a.user_id=u.id";
        List<Annonce> annonces = new ArrayList<Annonce>();

        try {
            Connection connection = dataSource.createConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query) ;

            while (rs.next()) {
                int id = rs.getInt("idAnn");
                int nbrKg = rs.getInt("nbr_kgAnn");
                int prixKg = rs.getInt("prix_kgAnn");
                String dateDepart = rs.getString("dateDepart");
                String dateArrive = rs.getString("dateArrive");
                String lieuDepart = rs.getString("lieuDepart");
                String lieuArrive = rs.getString("lieuArrive");
                String telDepart = rs.getString("telDepart");
                String telArrive = rs.getString("telArrive");
                User u = new User(rs.getInt("idUser"), rs.getString("numCarte"),rs.getString("nomComplet"));
                TypeAnnonce t = new TypeAnnonce(rs.getInt("typeAnnonce"), rs.getString("libTypeAnnonce"));
                Annonce annonce = new Annonce(id, nbrKg,prixKg,dateDepart,dateArrive, lieuDepart,lieuArrive,telDepart,telArrive,u,t);
                annonces.add(annonce);
            }
            listGlobalAnnoces = annonces;
            return annonces.toArray(new Annonce[0]);

        }
        catch (SQLException e) {
            return new Annonce[0];
        }
        catch (Exception ex){
            return new Annonce[0];
        }
    }

    public Annonce findById(int idAnnonce) {
        for (Annonce a: listGlobalAnnoces) {
            if(a.getId() == idAnnonce) return a;
        }
        return null;
    }
}
