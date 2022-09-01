package escola;

import java.util.ArrayList;

public class Turma {

	private int idTurma;
	private int serie;
	private ArrayList<Professor> professores = new ArrayList<>();
	private ArrayList<Aluno> alunos = new ArrayList<>();

	public Turma(int idTurma, int serie) {
		this.idTurma = idTurma;
		this.serie = serie;
	}

	public void setIdTurma(int idTurma) {
		this.idTurma = idTurma;
	}

	public int getIdTurma() {
		return this.idTurma;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public int getSerie() {
		return this.serie;
	}
	
	public void setProfessor(Professor professor) {
        this.professores.add(professor);
    }
    public ArrayList<Professor> getProfessor() {
        return this.professores;
    }
    
    public void setAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }
    public ArrayList<Aluno> getAluno() {
        return this.alunos;
    }

	@Override
	public String toString() {
		return "________________________________" + 
				"\nTurma:" + this.getSerie() + "ª Série";
	}

	public void adicionarProfessor(Professor professor) {
		this.professores.add(professor);
	}

	public void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}
}