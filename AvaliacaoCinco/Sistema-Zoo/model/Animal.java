package model;

public class Animal {
    private int id;
    private String nome;

    protected Animal (
        int id, 
        String nome
    ) {
        this.id = id;
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return 
        "\tAnimal " + 
        "\n Id: " + getId() + 
        "\n Nome: " + getNome();
    }
}