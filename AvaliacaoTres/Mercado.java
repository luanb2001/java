package AvaliacaoTres;
import java.util.ArrayList;
import java.util.Objects;

public class Mercado extends Estabelecimento{

    private String promocoes;
    ArrayList<Receita> receitas = new ArrayList<>();

    public Mercado(
        int id,
        String nome,
        String dataAbertura,
        int idEndereco,
        String cep, 
        String rua,
        int numero,
        String bairro,
        String cidade,
        String promocoes
    )   {
        super(id, nome, dataAbertura, idEndereco, cep, rua, numero, bairro, cidade);
        this.promocoes = promocoes;
    }

    public void setPromocoes(String promocoes) {
        this.promocoes = promocoes;
    }
    public String getPromocoes() {
        return this.promocoes;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Mercado)) {
            return false;
        }
        Mercado mercado = (Mercado) o;
        return Objects.equals(this.getId(), mercado.getId());
    }

    @Override
    public String toString() {
        return 
        "\n\t" + this.getNome() +
        "\n\n Data de abertura: " + this.getDataAbertura() +
        "\n Promoções: " + this.getPromocoes() +
        this.getEndereco();
    }

    public void adicionarReceita(Receita receita) {
        this.receitas.add(receita);
        receita.adicionarMercado(this);
    }
}
