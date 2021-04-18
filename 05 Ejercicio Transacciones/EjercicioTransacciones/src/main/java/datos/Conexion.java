package datos;

import java.sql.*;

public class Conexion {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimzone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "admin17";

// metodo para crear conexion
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }
    // metodo para cerrar conexion
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    // sobreescribimos el metodo para cerrar la query
    public static void close(Statement smtm) throws SQLException{
        smtm.close();
    }
    public static void close(PreparedStatement smtm) throws SQLException{
        smtm.close();
    }
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }        
}
