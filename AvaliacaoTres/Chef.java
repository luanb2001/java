package AvaliacaoTres;
import java.util.ArrayList;
import java.util.Objects;

public class Chef extends Pessoa {

    private String especialidade;
    private ArrayList<Receita> receitas = new ArrayList<>();

    public Chef(
        int idPessoa, 
        String nomePessoa, 
        String cpf, 
        String dataNascimento,
        String especialidade
    ) {
        super(idPessoa, nomePessoa, cpf, dataNascimento);
        this.especialidade = especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public String getEspecialidade() {
        return this.especialidade;
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
        if (!(o instanceof Chef)) {
            return false;
        }
        Chef chef = (Chef) o;
        return Objects.equals(this.getCpf(), chef.getCpf());
    }

    @Override
    public String toString() {
        return 
        "\n Chef: " + this.getNomePessoa() +
        "\n CPF: " + this.getCpf() +
        "\n Data de nascimento: " + this.getDataNascimento()+
        "\n Especialidade: " + this.getEspecialidade();
    }

    public void adicionarReceita(Receita receita) {
        this.receitas.add(receita);    
    }

    /*public void adicionarReceita(
        int idReceita, 
        String nomeReceita, 
        String etapas, 
        int numeroEtapas,
        String valor
    ) {
        Receita receita = new Receita(idReceita, nomeReceita, etapas, numeroEtapas, valor);
        this.receitas.add(receita);
    }*/
}          
