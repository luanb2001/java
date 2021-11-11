package AvaliacaoTres;
import java.util.Objects;

public class Estabelecimento {

    private int id;
    private String nome;
    private String dataAbertura;
    private Endereco endereco;

    protected Estabelecimento(
        int id,
        String nome,
        String dataAbertura,
        int idEndereco,
        String cep, 
        String rua,
        int numero,
        String bairro,
        String cidade
    ) {
        this.id = id;
        this.nome = nome;
        this.dataAbertura = dataAbertura;
        this.endereco = new Endereco(
            idEndereco,
            cep,
            rua,
            numero,
            bairro,
            cidade,
            this
        );
    }

    protected void setId(int id) {
        this.id = id;
    }
    protected int getId() {
        return this.id;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }
    protected String getNome() {
        return this.nome;
    }

    protected void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    protected String getDataAbertura() {
        return this.dataAbertura;
    }

    protected void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    protected Endereco getEndereco() {
        return this.endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Estabelecimento)) {
            return false;
        }
        Estabelecimento estabelecimento = (Estabelecimento) o;
        return Objects.equals(this.getId(), estabelecimento.getId());
    }

    @Override
    public String toString() {
        return "{" +
        " Id:" + this.getId() +
        "\n Nome do estabelecimento: " + this.getNome() +
        "\n Data de abertura: " + this.getDataAbertura() +
        "\n Endereço: " + this.getEndereco();
    }
}

