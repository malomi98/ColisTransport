package sn.verone.repository.jdbc;

import java.sql.Connection;

public interface DataSource {
    Connection createConnection();
}
