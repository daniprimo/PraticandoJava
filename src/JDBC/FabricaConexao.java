package JDBC;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {
    public static Connection getConexao()  {

        try{
            Properties prop = getProperties();
            final  String url = prop.getProperty("banco.url");
            final String usuario = prop.getProperty("banco.usuario");
            final String senha = prop.getProperty("banco.senha");
//            final  String url = "jdbc:mysql://localhost:3306/curso_JAVA?verifyServerCertificate=false&useSSL=true";
//            final String usuario = "root";
//            final String senha = "12345678";

            return DriverManager
                    .getConnection(url,usuario,senha);
        }catch (SQLException e){
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    private static Properties getProperties() throws IOException {
        Properties prop = new Properties();
        String caminho = "/Conexao.properties";
        prop.load(FabricaConexao.class.getResourceAsStream(caminho));
        return prop;
    }

}
