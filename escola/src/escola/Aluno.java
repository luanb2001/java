package escola;

public class Aluno {

    private int idAluno;
    private String nomeAluno;
    private int idadeAluno;

    public Aluno(
        int idAluno,
        String nomeAluno,
        int idadeAluno
    ) {
        this.idAluno = idAluno;
        this.nomeAluno = nomeAluno;
        this.idadeAluno = idadeAluno;
    }
    
    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }
    public int getIdAluno() {
        return this.idAluno;
    }
    
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
    public String getNomeAluno() {
        return this.nomeAluno;
    }

    public void setIdadeAluno(int idadeAluno) {
        this.idAluno = idadeAluno;
    }
    public int getIdadeAluno() {
        return this.idadeAluno;
    }
    
    @Override
    public String toString() {
        return 
        "\n Nome do Aluno: " + this.getNomeAluno() +
        "\n Idade: " + this.getIdadeAluno() + " anos";
    }
}