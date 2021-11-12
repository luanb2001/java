package AvaliacaoTres;
import java.util.ArrayList;
import java.util.Objects;

public class Cliente extends Pessoa {

    private String telefone;
    private ArrayList<Receita> receitas = new ArrayList<>();

    public Cliente(
        int idPessoa, 
        String nomePessoa, 
        String cpf, 
        String dataNascimento,
        String telefone
    ) {
        super(idPessoa, nomePessoa, cpf, dataNascimento);
        this.telefone = telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getTelefone() {
        return this.telefone;
    }

    public void setReceita(Receita receita) {
        this.receitas.add(receita);
    }
    public ArrayList<Receita> getReceita() {
        return this.receitas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cliente)) {
            return false;
        }
        Cliente cliente = (Cliente) o;
        return Objects.equals(this.getCpf(), cliente.getCpf());
    }

    @Override
    public String toString() {
        return 
        "\n Cliente: " + this.getNomePessoa() +
        "\n CPF: " + this.getCpf() +
        "\n Data de nascimento: " + this.getDataNascimento() +
        "\n Telefone: " + this.getTelefone();
    }

    public void adicionarReceita(Receita receita) {
        this.receitas.add(receita);
        receita.adicionarCliente(this);
    }
}
