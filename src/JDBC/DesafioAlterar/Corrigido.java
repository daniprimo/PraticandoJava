package JDBC.DesafioAlterar;

import JDBC.FabricaConexao;
import JDBC.Pessoa;
import com.mysql.cj.xdevapi.PreparableStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Corrigido {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o código da pessoa: ");
        int codigo = entrada.nextInt();

        String sql = "SELECT * FROM pessoas WHERE codigo = ?";
        String sqlUdate = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

        Connection conexao = FabricaConexao.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1,codigo);
        ResultSet resultado = stmt.executeQuery();

        if (resultado.next()){
            Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));
            System.out.println("O nome atual é "+ p.getNome());
            String novoNome;
            entrada.nextLine();

            System.out.print("Informe o novo nome: ");
            novoNome = entrada.nextLine();
            
            stmt.close();
            stmt = conexao.prepareStatement(sqlUdate);
            stmt.setString(1, novoNome);
            stmt.setInt(2, codigo);
            stmt.execute();

            System.out.println("Alteração realizada");
            
        }else{
            System.out.println("Pessoa Não Encontrada");
        }



        conexao.close();
        entrada.close();
    }
}
