package AtividadeHospital;

public class Consulta {

    private String data;
    private String atendimento;
    protected int registro;

    public Consulta(
        String data,
        String atendimento,
        int registro
    ) {
        this.data = data;
        this.atendimento = atendimento;
        this.registro = registro;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getData() {
        return this.data;
    }
    public void setAtendimento(String atendimento) {
        this.atendimento = atendimento;
    }
    public String getAtendimento() {
        return this.atendimento;
    }
    public void setRegistro(int registro) {
        this.registro = registro;
    }
    public int getRegistro() {
        return this.registro;
    }

    @Override
    public String toString() {
        return "\n\tConsulta "
            + "\n\nData: " + this.getData()
            + "\nAtendimento: " + this.getAtendimento()
            + "\nRegistro: " + this.getRegistro();
    }
}
