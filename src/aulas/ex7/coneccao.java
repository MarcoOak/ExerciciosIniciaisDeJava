package aulas.ex7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class coneccao {
    public static Connection CreateConnection() throws SQLException {
        String url="jbdc:mysql://localhost:3306/users";
        String user="root";
        String pass="1234";
        Connection connexao=null;
        connexao= DriverManager.getConnection(url,user,pass);
        return connexao;

    }
}
