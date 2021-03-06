package AtividadeHospital;

public class Pessoa {

    private String nome;
    private String cpf;
    private String dataNascimento;
    protected String carteira;

    public Pessoa(
        String nome,
        String cpf,
        String dataNascimento,
        String carteira
    ) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.carteira = carteira;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return this.cpf;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getDataNascimento() {
        return this.dataNascimento;
    }
    public void setCarteira(String carteira) {
        this.carteira = carteira;
    }
    public String getCarteira() {
        return this.carteira;
    }
}
