package model;

import java.sql.Date;

public class Golfinho extends Animal {

    private Date data;
    private String detalhes;
    private String descricao;
    Treinamento treinamento;
    Jaula jaula;

    public Golfinho(
        int id, 
        String nome, 
        int treinamento, 
        int jaula_id, 
        String descricao
    ) {
        super(id, nome);   
    }

    public Golfinho(
        int id, 
        String nome, 
        Treinamento treinamento,
        Jaula jaula
    ) {
        super(id, nome);
        treinamento = new Treinamento(
            id, 
            data, 
            detalhes
        );
        jaula = new Jaula(
            id, 
            descricao
        );
    }
    
    public void setTreinamento(Treinamento treinamento) {
        this.treinamento = treinamento;
    }

    public Treinamento getTreinamento() {
        return treinamento;
    }

    public void setJaula(Jaula jaula) {
        this.jaula = jaula;
    }

    public Jaula getJaula() {
        return jaula;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return 
        "\tGolfinho " +
        "\n ID: " + getId() + 
        "\n Nome: " + getNome() + 
        "\n Treinamento: " + getTreinamento();
    }
}