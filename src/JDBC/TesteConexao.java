package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args)  throws SQLException {
        final  String stringDeConexao = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
        final String usuario = "root";
        final String senha = "12345678";

        Connection conexao = DriverManager
                .getConnection(stringDeConexao,usuario,senha);

        System.out.println("Conexao Efetuada");
        conexao.close();
    }


}
