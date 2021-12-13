package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {

    public static Connection connection;

    public static Connection getConnection() throws Exception {
        try {
            if (connection == null || connection.isClosed()) {
                final String url = "jdbc:mysql://localhost:3306/zoo?useTimezone=true&serverTimezone=UTC";
                final String user = "root";
                final String password = "34298393luan";
    
                connection = DriverManager.getConnection(url, user, password);

            } 
            
            return connection;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //LEÃO
    public static Leao selectLeao(Connection conexao, int id) throws Exception {
        try {
            Statement stm = conexao.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM Leao l LEFT JOIN Jaula j ON (j.id = l.jaula_id) WHERE l.id = " + id);
            if(rs.next()) {
                
                Leao leao = new Leao(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getInt("alimentacao"),
                    rs.getInt("visitantes"),
                    rs.getInt("jaula_id"),
                    rs.getString("descricao")
                );
                
                conexao.close();
                return leao;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        throw new Exception("Leão não encontrado");
    }

    /*public static void selectLeao(Connection conexao, int id) throws Exception {

        PreparedStatement preparedStatement4 = conexao.prepareStatement(
            "SELECT "
                + "leao.id, "
                + "leao.nome, "
                + "leao.alimentacao, "
                + "leao.visitantes, "
                + "leao.jaula_id, "
                + "jaula.descricao "
                + "FROM leao "
                + "INNER JOIN jaula "
                + "ON jaula.id = leao.jaula_id "
                + "WHERE id = ? ",
            PreparedStatement.RETURN_GENERATED_KEYS
        );

        preparedStatement4.setInt(1, id);
        ResultSet result = preparedStatement4.executeQuery();
        while (result.next()) {
            Leao leao = new Leao(
                result.getInt("id"),
                result.getString("nome"),
                result.getInt("alimentacao"),
                result.getInt("visitantes"),
                result.getInt("jaula_id"), 
                result.getString("descricao")
            );
            System.out.println(leao);
        }
    }*/

    /*public static void selectLeao(Connection conexao) throws Exception {
        String sql = "SELECT * FROM leao";
        Statement statemente = conexao.createStatement();
        ResultSet resultados = statemente.executeQuery(sql);

        while(resultados.next()){
            statemente.execute("SELECT * FROM alimentacao WHERE id = " + resultados.getInt("alimentacao"));
            statemente.execute("SELECT * FROM jaula WHERE id = " + resultados.getInt("descricao"));
            Leao leao = new Leao(
                resultados.getInt("id"), 
                resultados.getString("nome"), 
                resultados.getInt("alimentacao"), 
                resultados.getInt("visitantes"), 
                resultados.getInt("descricao")
                );
            System.out.println(leao);
        }
    }*/

    public static void insertLeao(
        Connection conexao, 
        String nome, 
        int alimentacao, 
        int visitantes, 
        String descricao
    ) throws Exception {
        
        PreparedStatement statement = conexao.prepareStatement(
            "INSERT INTO leao (nome, alimentacao, visitantes, jaula_id) VALUES (?,?,?,?)",
            PreparedStatement.RETURN_GENERATED_KEYS
        );

        PreparedStatement pStatement = conexao.prepareStatement(
            "INSERT INTO jaula (descricao) VALUES (?);",
            PreparedStatement.RETURN_GENERATED_KEYS
        );

        try{
            pStatement.setString(1, descricao);
            if (pStatement.executeUpdate() > 0) {
                ResultSet rs = pStatement.getGeneratedKeys();
                rs.next();
                int idJaula = rs.getInt(1);
                
                statement.setString(1, nome);
                statement.setInt(2, alimentacao);
                statement.setInt(3, visitantes);
                statement.setInt(4, idJaula);

                if (statement.executeUpdate() > 0) {
                    ResultSet rsLeao = statement.getGeneratedKeys();
                    rsLeao.next();
                    int idLeao = rsLeao.getInt(1);

                    ResultSet sqlLeao = conexao.createStatement().executeQuery("SELECT * FROM leao WHERE id = " + idLeao);
                    sqlLeao.next();
                    System.out.println(
                        new Leao(
                            sqlLeao.getInt("id"),
                            sqlLeao.getString("nome"),
                            sqlLeao.getInt("alimentacao"),
                            sqlLeao.getInt("visitantes"), idJaula, descricao));
                }
            }      
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public static void updateLeao(
        Connection conexao, 
        String nome, 
        int alimentacao, 
        int visitantes, 
        int id
    ) throws Exception {
        
        PreparedStatement preparedStatement2 = conexao.prepareStatement(
            "UPDATE leao SET nome = ?, alimentacao = ?, visitantes = ? WHERE id = ?",
        PreparedStatement.RETURN_GENERATED_KEYS);
        preparedStatement2.setString(1, nome);
        preparedStatement2.setInt(2, alimentacao);
        preparedStatement2.setInt(3, visitantes);
        preparedStatement2.setInt(4, id);

        if (preparedStatement2.executeUpdate() <= 0) {
            System.out.println("Erro ao alterar Leão");
        }
    }

    public static void deleteLeao(
        Connection conexao, 
        int id
    ) throws Exception {

        PreparedStatement preparedStatement3 = conexao.prepareStatement(
            "DELETE FROM leao WHERE id = ? ",
        PreparedStatement.RETURN_GENERATED_KEYS);
        preparedStatement3.setInt(1, id);

        if (preparedStatement3.executeUpdate() <= 0) {
            System.out.println("Erro ao deletar Leão");
        }
    }

    //GOLFINHO

    public static void selectGolfinho(
        Connection conexao, 
        int id
    ) throws Exception {

        PreparedStatement preparedStatement4 = conexao.prepareStatement(
            "SELECT "
                + "golfinho.id, "
                + "golfinho.nome, "
                + "golfinho.treinamento, "
                + "golfinho.jaula_id, "
                + "jaula.descricao "
                + "FROM golfinho "
                + "INNER JOIN jaula "
                + "ON jaula.id = golfinho.jaula_id "
                + "WHERE id = ? ",
            PreparedStatement.RETURN_GENERATED_KEYS
        );

        preparedStatement4.setInt(1, id);
        ResultSet result = preparedStatement4.executeQuery();
        while (result.next()) {
            Golfinho golfinho = new Golfinho(
                result.getInt("id"),
                result.getString("nome"),
                result.getInt("treinamento"),
                result.getInt("jaula_id"), 
                result.getString("descricao")
            );
            System.out.println(golfinho);
        }
    }

    /*public static void selectGolfinho(Connection conexao) throws Exception {
        String sql = "SELECT * FROM golfinho";
        Statement statemente = conexao.createStatement();
        ResultSet resultados = statemente.executeQuery(sql);

        while(resultados.next()){
            statemente.execute("SELECT * FROM jaula WHERE id = " + resultados.getInt("jaula_id"));
            statemente.execute("SELECT * FROM treinamento WHERE id = " + resultados.getInt("treinamento"));
            Golfinho golfinho = new Golfinho(
                resultados.getInt("id"), 
                resultados.getString("nome"), 
                resultados.getInt("treinamento"), 
                resultados.getInt("descricao")
                );
            System.out.println(golfinho);
        }
    }*/

    public static void insertGolfinho(
        Connection conexao, 
        String nome, 
        int treinamento,
        String descricao
    ) throws Exception {
        
        PreparedStatement statement = conexao.prepareStatement(
            "INSERT INTO golfinho (nome, treinamento, jaula_id) VALUES (?,?,?)",
            PreparedStatement.RETURN_GENERATED_KEYS
        );

        PreparedStatement pStatement = conexao.prepareStatement(
            "INSERT INTO jaula (descricao) VALUES (?);",
            PreparedStatement.RETURN_GENERATED_KEYS
        );

        try{
            pStatement.setString(1, descricao);
            if (pStatement.executeUpdate() > 0) {
                ResultSet rs = pStatement.getGeneratedKeys();
                rs.next();
                int idJaula = rs.getInt(1);
                
                statement.setString(1, nome);
                statement.setInt(2, treinamento);
                statement.setInt(3, idJaula);

                if (statement.executeUpdate() > 0) {
                    ResultSet rsGolfinho = statement.getGeneratedKeys();
                    rsGolfinho.next();
                    int idGolfinho = rsGolfinho.getInt(1);

                    ResultSet sqlGolfinho = conexao.createStatement().executeQuery("SELECT * FROM golfinho WHERE id = " + idGolfinho);
                    sqlGolfinho.next();
                    System.out.println(
                        new Golfinho(
                            sqlGolfinho.getInt("id"),
                            sqlGolfinho.getString("nome"),
                            sqlGolfinho.getInt("treinamento"), idJaula, descricao));
                }
            }      
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public static void updateGolfinho(
        Connection conexao, 
        String nome, 
        int treinamento, 
        int id
    ) throws Exception {
        
        PreparedStatement preparedStatement2 = conexao.prepareStatement(
            "UPDATE golfinho SET nome = ?, treinamento = ? WHERE id = ?",
        PreparedStatement.RETURN_GENERATED_KEYS);
        preparedStatement2.setString(1, nome);
        preparedStatement2.setInt(2, treinamento);
        preparedStatement2.setInt(3, id);

        if (preparedStatement2.executeUpdate() <= 0) {
            System.out.println("Erro ao alterar Golfinho");
        }
    }

    public static void deleteGolfinho(Connection conexao, int id) throws Exception {

        PreparedStatement preparedStatement3 = conexao.prepareStatement(
            "DELETE FROM golfinho WHERE id = ? ",
        PreparedStatement.RETURN_GENERATED_KEYS);
        preparedStatement3.setInt(1, id);

        if (preparedStatement3.executeUpdate() <= 0) {
            System.out.println("Erro ao deletar Golfinho");
        }
    }

    //ALIMENTAÇÃO

    public static void insertAlimentacao(
        Connection conexao,
        Date data, 
        String detalhes, 
        int id
    ) throws Exception {

        String sql = "INSERT INTO alimentacao " + 
                        "(leao_id, data, detalhes) " + 
                        "VALUES(?,?,?)";
        try{
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, id);
            statement.setDate(2, data);
            statement.setString(3, detalhes);
            statement.execute();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public static void deleteAlimentacao(
        Connection conexao, int idAlimentacao) throws Exception {
        
        PreparedStatement pStatement3 = conexao.prepareStatement(
            "DELETE FROM alimentacao WHERE id = ? ",
        PreparedStatement.RETURN_GENERATED_KEYS);
        pStatement3.setInt(1, idAlimentacao);

        if (pStatement3.executeUpdate() <= 0) {
            System.out.println("Erro ao deletar Alimentação");
        }
    }

    //TREINAMENTO

    public static void insertTreinamento(
        Connection conexao, 
        Date data, 
        String detalhes, 
        int id
    ) throws Exception {

        String sql = "INSERT INTO treinamento " + 
                        "(golfinho_id, data, detalhes) " + 
                        "VALUES(?,?,?)";
        try{
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, id);
            statement.setDate(2, data);
            statement.setString(3, detalhes);
            statement.execute();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public static void deleteTreinamento(Connection conexao, int idTreinamento) throws Exception {
        
        PreparedStatement pStatement3 = conexao.prepareStatement(
            "DELETE FROM treinamento WHERE id = ? ",
        PreparedStatement.RETURN_GENERATED_KEYS);
        pStatement3.setInt(1, idTreinamento);

        if (pStatement3.executeUpdate() <= 0) {
            System.out.println("Erro ao deletar Treinamento");
        }
    }
}