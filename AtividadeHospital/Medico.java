package AtividadeHospital;

public class Medico extends Pessoa {

    private int crm;
    private String estado;
    
    public Medico(
        String nome,
        String cpf,
        String dataNascimento,
        String carteira,
        int crm,
        String estado
    ) {
        super(nome, cpf, dataNascimento, carteira);
        this.crm = crm;
        this.estado = estado;
    }
    public void setCrm(int crm) {
        this.crm = crm;
    }
    public int getCrm() {
        return this.crm;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getEstado() {
        return this.estado;
    }
    
    @Override
    public String toString() {
        return "\n\tMedico "
            + "\n\nNome: " + this.getNome()
            + "\nCPF: " + this.getCpf()
            + "\nData de Nascimento: " + this.getDataNascimento()
            + "\nCarteira: " + this.getCarteira()
            + "\nCRM: " + this.getCrm()
            + "\nEstado: " + this.getEstado();
    }
}

