import java.util.Objects;

public class Endereco {

    private int idEndereco;
    private String cep;
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    protected Estabelecimento estabelecimento;

    public Endereco(
        int idEndereco,
        String cep, 
        String rua,
        int numero,
        String bairro,
        String cidade,
        Estabelecimento estabelecimento
    )   {
        this.idEndereco = idEndereco;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estabelecimento = estabelecimento;
    }
    
    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }
    public int getIdEndereco() {
        return this.idEndereco;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getCep() {
        return this.cep;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getRua() {
        return this.rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return this.numero;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getBairro() {
        return this.bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getCidade() {
        return this.cidade;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }
    public Estabelecimento getEstabelecimento() {
        return this.estabelecimento;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Endereco)) {
            return false;
        }
        Endereco endereco = (Endereco) o;
        return Objects.equals(this.getIdEndereco(), endereco.getIdEndereco());
    }

    @Override
    public String toString() {
        return 
        "\n CEP: " + this.getCep() +
        "\n Rua: " + this.getRua() +
        "\n Numero: " + this.getNumero() +
        "\n Bairro: " + this.getBairro() +
        "\n Cidade: " + this.getCidade();
    }
}   