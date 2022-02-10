package aulas.Marco.Futebol;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conecao {
    public static Connection CreateConnection() throws SQLException {
        String url="jdbc:mysql://localhost:3306/usersjogadores";
        String user="root";
        String pass="1234";
        Connection connexao=null;
        connexao= DriverManager.getConnection(url,user,pass);
        return connexao;

    }
}
