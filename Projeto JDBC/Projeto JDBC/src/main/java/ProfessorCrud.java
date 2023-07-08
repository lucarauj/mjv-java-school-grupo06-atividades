import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProfessorCrud {
    private Connection conexao;

    public ProfessorCrud(){
        conexao = Conexao.getConnection();
    }
    public void save (Professor professor){
        try {
            String sql = "INSERT INTO professores (" +
                    "nome, " +
                    "data_nascimento, " +
                    "carga_horaria, " +
                    "valor_hora, " +
                    "estrangeiro, " +
                    "horas_disponiveis, " +
                    "biografia, " +
                    "data_hora_cadastro) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, professor.getNome());
            statement.setObject(2, professor.getDataNascimento());
            statement.setObject(3, professor.getCargaHoraria(), Types.OTHER);
            statement.setDouble(4, professor.getValorHora());
            statement.setBoolean(5, professor.isEstrangeiro());
            statement.setObject(6, professor.getHorasDisponiveis());
            statement.setString(7, professor.getBiografia());
            statement.setObject(8, professor.getDataHoraCadastro());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Um novo professor foi inserido com sucesso!");
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public void update(Professor professor){
        try {
            String sql = "UPDATE professores SET nome = ? WHERE id = ?";

            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, professor.getNome());
            statement.setInt(2, professor.getId());
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Dados do professor alterado com sucesso!");
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public int delete(Integer id){
        int rowsDeleted=0;
        try {
            String sql = "DELETE FROM professores WHERE id = ?";

            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, id);
            rowsDeleted = statement.executeUpdate();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return  rowsDeleted;
    }
    public Professor findById(Integer id){
        Professor professor = null;
        try {
            String sql = "SELECT * FROM professores WHERE id = ?";

            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1,id);

            ResultSet result = statement.executeQuery();

            while (result.next()){
                professor = new Professor();
                professor.setId(result.getInt("id"));
                professor.setNome(result.getString("nome"));
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return professor;
    }
    public List<Professor> findAll(){
        List<Professor> registros = new ArrayList<>();
        try {
            String sql = "SELECT * FROM professores";
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next()){
                Professor professor = new Professor();
                professor.setId(result.getInt("id"));
                professor.setNome(result.getString("nome"));
                registros.add(professor);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return registros;
    }

}
