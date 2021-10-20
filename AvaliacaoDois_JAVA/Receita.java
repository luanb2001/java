package AvaliacaoDois;
import java.util.ArrayList;

public class Receita {
    
    int idReceita;
    String nomeReceita;
    String etapas;
    int numeroEtapas;
    ArrayList<Padaria> padarias = new ArrayList<>();

    public Receita(int idReceita, String nomeReceita, String etapas, int numeroEtapas) {
        this.idReceita = idReceita;
        this.nomeReceita = nomeReceita;
        this.etapas = etapas;
        this.numeroEtapas = numeroEtapas;
    }
    
    public void adicionarPadaria(Padaria padaria) {
        this.padarias.add(padaria);
    }
}


