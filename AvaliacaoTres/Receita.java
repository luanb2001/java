package AvaliacaoTres;
import java.util.ArrayList;
import java.util.Objects;

public class Receita {
    
    private int idReceita;
    private String nomeReceita;
    private String etapas;
    private int numeroEtapas;
    private String valor; 
    private ArrayList<Padaria> padarias = new ArrayList<>();
    private ArrayList<Mercado> mercados = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public Receita(
        int idReceita, 
        String nomeReceita, 
        String etapas, 
        int numeroEtapas,
        String valor
    ) {
        this.idReceita = idReceita;
        this.nomeReceita = nomeReceita;
        this.etapas = etapas;
        this.numeroEtapas = numeroEtapas;
        this.valor = valor;
    }

    public void setIdReceita(int idReceita) {
        this.idReceita = idReceita;
    }
    public int getIdReceita() {
        return this.idReceita;
    }

    public void setNomeReceita(String nomeReceita) {
        this.nomeReceita = nomeReceita;
    }
    public String getNomeReceita() {
        return this.nomeReceita;
    }

    public void setEtapas(String etapas) {
        this.etapas = etapas;
    }
    public String getEtapas() {
        return this.etapas;
    }

    public void setNumeroEtapas(int numeroEtapas) {
        this.numeroEtapas = numeroEtapas;
    }
    public int getNumeroEtapas() {
        return this.numeroEtapas;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    public String getValor() {
        return this.valor;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Receita)) {
            return false;
        }
        Receita receita = (Receita) o;
        return Objects.equals(this.getIdReceita(), receita.getIdReceita());
    }

    @Override
    public String toString() {
        return 
        "\n Receita: " + this.getNomeReceita() +
        "\n Etapas: " + this.getEtapas() +
        "\n Número de etapas: " + this.getNumeroEtapas() +
        "\n Valor: " + this.getValor();
    }
    
    public void adicionarPadaria(Padaria padaria) {
        this.padarias.add(padaria);
    }
    public void adicionarMercado(Mercado mercado) {
        this.mercados.add(mercado);
    }
    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }
}


