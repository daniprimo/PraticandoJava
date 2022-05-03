package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o Nome: ");
        String nome = entrada.nextLine();

//        String sql = "INSERT INTO pessoas (nome) VALUES ('"+ nome +"')";
//          Para evitar chances de ataque não usaremos o codigo a cima
//        que apesar de ser valido nao é seguro

        Connection conexao = FabricaConexao.getConexao();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);

        stmt.execute();
        System.out.println("Pessoa Incluida com sucesso");
        entrada.close();
    }
}
