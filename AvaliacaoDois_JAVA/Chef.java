package AvaliacaoDois;
import java.util.ArrayList;

public class Chef {

    int idChef;
    String nomeChef;
    String cpf;
    String dataNascimento;
    ArrayList<Receita> receitas = new ArrayList<>();

    public Chef(int idChef, String nomeChef, String cpf, String dataNascimento) {
        this.idChef = idChef;
        this.nomeChef = nomeChef;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
    
    public void adicionarReceita(Receita receita) {
        this.receitas.add(receita);    
    }

    public void adicionarReceita(
        int idReceita, 
        String nomeReceita, 
        String etapas, 
        int numeroEtapas
    ) {
        Receita receita = new Receita(idReceita, nomeReceita, etapas, numeroEtapas);
        this.receitas.add(receita);
        // this.adicionarReceita(receita);
    }
}          
