package sn.verone.repository.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sn.verone.domain.Profil;
import sn.verone.domain.User;
import sn.verone.repository.UserRepository;

public class JdbcBasedUserRepository implements UserRepository {private final DataSource dataSource;

    public JdbcBasedUserRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

   public User[] getAll(){
        String query = "SELECT u.id, u.numCarte, u.nationalite, u.email, u.password, u.photo, u.nomComplet, u.adresse, p.id as profilId, p.code as profilCode, p.libelle as profilLibelle FROM user u, profil p where u.profil.id=p.id";
        List<User> users = new ArrayList<User>();

        try {
            Connection connection = dataSource.createConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query) ;

            while (rs.next()) {
                int id = rs.getInt("id");
                String numCarte = rs.getString("numCarte");
                String nat = rs.getString("nationalite");
                String email = rs.getString("email");
                String password = rs.getString("password");
                String photo = rs.getString("photo");
                String nomComplet = rs.getString("nomComplet");
                String adresse = rs.getString("adresse");
                Profil profil = new Profil(rs.getInt("profilId"), rs.getString("profilCode"), rs.getString("profilLibelle"));

                User user = new User(id, numCarte, nat, email, password,photo, nomComplet, adresse, profil);

                users.add(user);
            }
            return users.toArray(new User[0]);

        }
        catch (SQLException e) {
            return new User[0];
        }
        catch (Exception ex){
            return new User[0];
        }
    };
   public User findById(int idUser){
        return null;
    };
}
