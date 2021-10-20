package AvaliacaoDois;

public class Endereco {

    int idEndereco;
    String cep;
    String rua;
    int numero;
    String bairro;
    String cidade;
    Padaria padaria;

    public Endereco(
        int idEndereco,
        String cep, 
        String rua,
        int numero,
        String bairro,
        String cidade,
        Padaria padaria
    )   {
        this.idEndereco = idEndereco;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
    }
    
}   
