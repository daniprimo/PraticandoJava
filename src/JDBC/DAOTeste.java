package JDBC;

public class DAOTeste {
    public static void main(String[] args) {
        DAO dao = new DAO();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
        System.out.println(dao.incluir(sql,"João da Silva"));
        System.out.println(dao.incluir(sql,"Ana Julia"));
        System.out.println(dao.incluir(sql,"Djalma Pereira"));

        String sql1 = "INSERT INTO pessoas (nome, codigo) VALUES (?, ?)";
        System.out.println(dao.incluir(sql1,"João da Silva",1005));
        System.out.println(dao.incluir(sql1,"Ana Julia",1006));
        System.out.println(dao.incluir(sql1,"Djalma Pereira",5012));

        dao.close();

    }
}
