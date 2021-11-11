package AvaliacaoTres;
import java.util.ArrayList;
import java.util.Objects;

public class Padaria extends Estabelecimento{

    private String horario;
    ArrayList<Receita> receitas = new ArrayList<>();

    public Padaria(
        int id,
        String nome,
        String dataAbertura,
        int idEndereco,
        String cep, 
        String rua,
        int numero,
        String bairro,
        String cidade,
        String horario
    )   {
        super(id, nome, dataAbertura, idEndereco, cep, rua, numero, bairro, cidade);
        this.horario = horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String getHorario() {
        return this.horario;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Padaria)) {
            return false;
        }
        Padaria padaria = (Padaria) o;
        return Objects.equals(this.getId(), padaria.getId());
    }

    @Override
    public String toString() {
        return
        "\n\t " + this.getNome() +
        "\n\n Data de abertura: " + this.getDataAbertura() +
        "\n Horário de Funcionamento: " + this.getHorario()
        + this.getEndereco();
    }

    public void adicionarReceita(Receita receita) {
        this.receitas.add(receita);
        receita.adicionarPadaria(this);
    }
}
