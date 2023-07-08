import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class AplicacaoJDBC {

    private static ProfessorCrud professorCrud;
    public static void main(String[] args) {

        Conexao.iniciarConexao();

        professorCrud = new ProfessorCrud();
        incluirProfessor();
        alterarProfessor();
        listarProfessores();
        listarProfessorPorId();
        excluirProfessor();
    }
    private static void incluirProfessor(){

        Professor professor = new Professor();
        professor.setNome("Haroldo Nascimento Dias");
        professor.setDataNascimento(LocalDate.of(1980, 06,02));
        professor.setCargaHoraria(Duration.ofHours(30));
        professor.setValorHora(20.0);
        professor.setEstrangeiro(false);
        professor.setHorasDisponiveis(10);
        professor.setBiografia("Educador brasileiro, criador do método inovador no ensino da alfabetização para adultos");
        professor.setDataHoraCadastro(LocalDateTime.of(2000,01,23, 10, 30));

        professorCrud.save(professor);
    }
    private static void alterarProfessor(){
        Professor professor  = professorCrud.findById(1);
        if(professor!=null) {
            professor.setNome("Manuel Nascimento Dias");
            professorCrud.update(professor);
        } else {
            System.out.println("Não existe professor com o id informado!");
        }
    }
    private static void listarProfessores(){
        List<Professor> professores = professorCrud.findAll();
        for(Professor p : professores){
            System.out.println(p.getId() + "--" + p.getNome());
        }
    }

    private static void listarProfessorPorId(){
        Professor professor = professorCrud.findById(2);
        System.out.println(professor.getId() + "--" + professor.getNome());
    }
    private static void excluirProfessor(){
        int linhasDeletadas = professorCrud.delete(1);
        if(linhasDeletadas == 0)
            System.out.println("Nenhum registro encontrado para o id informado!");
    }
}