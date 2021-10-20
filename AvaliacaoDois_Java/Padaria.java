package AvaliacaoDois;
import java.util.ArrayList;

public class Padaria {

    int id;
    String nome;
    String dataAbertura;
    Endereco endereco;
    ArrayList<Receita> receitas = new ArrayList<>();

    public Padaria(
        int id,
        String nome,
        String dataAbertura,
        int idEndereco,
        String cep, 
        String rua,
        int numero,
        String bairro,
        String cidade
    )   {
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

    public void adicionarReceita(Receita receita) {
        this.receitas.add(receita);
        receita.adicionarPadaria(this);
    }
}
