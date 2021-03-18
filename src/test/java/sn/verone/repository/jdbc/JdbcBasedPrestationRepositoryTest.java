package sn.verone.repository.jdbc;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sn.verone.domain.Prestation;

import java.sql.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class JdbcBasedPrestationRepositoryTest {
    private JdbcBasedPrestationRepository jdbcBasedPrestationRepository;

    @BeforeEach
    void setUp() throws SQLException {
        System.out.println("Dans la méthode setup");
        //Arrange
        DataSource dataSource = new MockDatasource();
        jdbcBasedPrestationRepository = new JdbcBasedPrestationRepository(dataSource);
    }

    @Test
    void getPrestations(){
        System.out.println("Dans la méthode get prestations");
        //Act
        Prestation[] prestations = jdbcBasedPrestationRepository.getAll();
        //Assert
        assertEquals(4, prestations.length, "le nombre de prestations doit être 4");
    }

    @Test
    void getPrestationsWhenExceptionOccured(){
        System.out.println("Dans la méthode getprestation when exception occured");
        DataSource dataSource = mock(DataSource.class);
        when(dataSource.createConnection()).thenThrow(new RuntimeException("Base de données non disponible"));
        jdbcBasedPrestationRepository = new JdbcBasedPrestationRepository(dataSource);
        Prestation[] prestations = jdbcBasedPrestationRepository.getAll();
        assertEquals(0, prestations.length, "le nombre de prestations doit être 0");
    }

    @Test
    void getByIdShouldReturnPrestationWhenAvailable(){
        Prestation prestation = jdbcBasedPrestationRepository.getById(1);
        assertNotNull(prestation);
        assertEquals(1, prestation.getId());
        assertEquals("", prestation.getNom());
    }

    @Test
    void getByIdShouldReturnPrestationWhenAvailableNotTrivial() throws SQLException {
        DataSource dataSource = mock(DataSource.class);
        Connection connection = mock(Connection.class);

        when(dataSource.createConnection()).thenReturn(connection);
        Statement statement = mock(Statement.class);
        when(connection.createStatement()).thenReturn(statement);
        PreparedStatement preparedStatement = mock(PreparedStatement.class);
        when(connection.prepareStatement(anyString())).thenReturn(preparedStatement);
        ResultSet resultSet2 = mock(ResultSet.class);
        when(preparedStatement.executeQuery()).thenReturn(resultSet2);
        when(resultSet2.getInt(anyString())).thenReturn(5);
        when(resultSet2.getString(anyString())).thenReturn("aaaaa");

        jdbcBasedPrestationRepository = new JdbcBasedPrestationRepository(dataSource);

        Prestation prestation = jdbcBasedPrestationRepository.getById(5);
        assertNotNull(prestation);
        assertEquals(5, prestation.getId());
        assertEquals("aaaaa", prestation.getNom());
    }
}
