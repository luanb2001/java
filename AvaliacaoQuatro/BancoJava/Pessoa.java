import java.sql.Date;
import java.util.Objects;

public class Pessoa {

    private int idPessoa;
    private String nomePessoa;
    private String cpf;
    private Date dataNascimento;

    protected Pessoa(
        int idPessoa, 
        String nomePessoa, 
        String cpf, 
        Date dataNascimento
    ) {
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    protected void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }
    protected int getIdPessoa() {
        return this.idPessoa;
    }

    protected void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
    protected String getNomePessoa() {
        return this.nomePessoa;
    }

    protected void setCpf(String cpf) {
        this.cpf = cpf;
    }
    protected String getCpf() {
        return this.cpf;
    }

    protected void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    protected Date getDataNascimento() {
        return this.dataNascimento;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pessoa)) {
            return false;
        }
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(this.getCpf(), pessoa.getCpf());
    }

    @Override
    public String toString() {
        return "{" +
        " Id:" + this.getIdPessoa() +
        "\n Nome: " + this.getNomePessoa() +
        "\n CPF: " + this.getCpf() +
        "\n Data de nascimento: " + this.getDataNascimento();
    }

    public String carteira() {
        return "Nome: " + this.getNomePessoa() +
        "\n CPF: " + this.getCpf() +
        "\n Data de nascimento: " + this.getDataNascimento();
    }
}