import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Cupom {
    String nomeFantasia;
    Endereco endereco;
    String cpf;
    String ie;
    String im;
    LocalDate data;
    LocalTime hora;
    Integer ccf;
    Integer cdd;
    List<CupomItem> itens = new ArrayList<>();
}
