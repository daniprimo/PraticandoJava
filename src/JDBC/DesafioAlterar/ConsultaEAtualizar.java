package JDBC.DesafioAlterar;

import JDBC.FabricaConexao;
import JDBC.Pessoa;
import com.mysql.cj.xdevapi.PreparableStatement;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultaEAtualizar {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);

        Connection conexao = FabricaConexao.getConexao();
        String sql = "SELECT * FROM pessoas";

        //executando seguramente
        Statement stmt = conexao.createStatement();
        //execute query para acessar os dados dd tabela
        ResultSet resultado = stmt.executeQuery(sql);

        List<Pessoa> pessoas = new ArrayList<>();

        while (resultado.next()){
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            pessoas.add(new Pessoa(codigo, nome));
        }

        for (Pessoa p : pessoas ) {
            System.out.println(p.getCodigo() +" ==> " + p.getNome());
        }


        String sqlUpdate = "UPDATE pessoas SET nome = '?' WHERE codigo = ?";

        System.out.print("Escreva novo nome: ");
        String alteracao = entrada.nextLine();
        System.out.print("Codigo do alterado: ");
        int codigoDoAlterado = entrada.nextInt();

        PreparedStatement stmt2 = conexao.prepareStatement(sqlUpdate);
        stmt2.setString(1,alteracao);
        stmt2.setInt(2,codigoDoAlterado);
        ResultSet resultSet = stmt2.executeQuery();

        List<Pessoa> pessoas2 = new ArrayList<>();

        while (resultSet.next()){
            int codigo = resultSet.getInt("codigo");
            String nome = resultSet.getString("nome");
            pessoas2.add(new Pessoa(codigo, nome));
        }

        System.out.println("Registro Atualizado");

        for (Pessoa p : pessoas2 ) {
            System.out.println(p.getCodigo() +" ==> " + p.getNome());
        }



        stmt.close();
        conexao.close();


    }

}
