package AtividadeHospital;

public class Paciente extends Pessoa {
    
    private int registro;
    
    public Paciente(
        String nome,
        String cpf,
        String dataNascimento,
        String carteira,
        int registro
    ) {
        super(nome, cpf, dataNascimento, carteira);
        this.registro = registro;
    }
    public void setRegistro(int registro) {
        this.registro = registro;
    }
    public int getRegistro() {
        return this.registro;
    }
    
    @Override
    public String toString() {
        return "\n\tPaciente "
            + "\n\nNome: " + this.getNome()
            + "\nCPF: " + this.getCpf()
            + "\nData de Nascimento: " + this.getDataNascimento()
            + "\nCarteira: " + this.getCarteira()
            + "\nRegistro: " + this.getRegistro();
    }
}

