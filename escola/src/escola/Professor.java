package escola;

public class Professor {

	private int idProfessor;
	private String nomeProfessor;
	private int idadeProfessor;

	public Professor(int idProfessor, String nomeProfessor, int idadeProfessor) {
		this.idProfessor = idProfessor;
		this.nomeProfessor = nomeProfessor;
		this.idadeProfessor = idadeProfessor;
	}

	public void setIdProfessor(int idProfessor) {
		this.idProfessor = idProfessor;
	}

	public int getIdProfessor() {
		return this.idProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	public String getNomeProfessor() {
		return this.nomeProfessor;
	}

	public void setIdadeProfessor(int idadeProfessor) {
		this.idProfessor = idadeProfessor;
	}

	public int getIdadeProfessor() {
		return this.idadeProfessor;
	}

	@Override
	public String toString() {
		return "\n Nome do Professor: " + this.getNomeProfessor() + "\n Idade: " + this.getIdadeProfessor() + " anos";
	}
}