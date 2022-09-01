package escola;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Turma turmaUm = new Turma(1, 3);
		Turma turmaDois = new Turma(2, 8);
		Turma turmaTres = new Turma(3, 5);

		Professor professorUm = new Professor(1, "Claudio", 33);
		Professor professorDois = new Professor(2, "Adalberto", 48);
		Professor professorTres = new Professor(3, "Fernando", 32);

		Aluno alunoUm = new Aluno(1, "Claudinho", 9);
		Aluno alunoDois = new Aluno(2, "Buchecha", 10);
		Aluno alunoTres = new Aluno(3, "Enzo", 10);
		Aluno alunoQuatro = new Aluno(4, "Marcela", 14);
		Aluno alunoCinco = new Aluno(5, "Leandro", 14);
		Aluno alunoSeis = new Aluno(6, "Rodrigo", 15);
		Aluno alunoSete = new Aluno(7, "Fernanda", 12);
		Aluno alunoOito = new Aluno(8, "Carlos", 12);
		Aluno alunoNove = new Aluno(9, "Leticia", 13);

		turmaUm.adicionarProfessor(professorUm);
		turmaDois.adicionarProfessor(professorDois);
		turmaTres.adicionarProfessor(professorTres);

		turmaUm.adicionarAluno(alunoUm);
		turmaUm.adicionarAluno(alunoDois);
		turmaUm.adicionarAluno(alunoTres);
		turmaDois.adicionarAluno(alunoQuatro);
		turmaDois.adicionarAluno(alunoCinco);
		turmaDois.adicionarAluno(alunoSeis);
		turmaTres.adicionarAluno(alunoSete);
		turmaTres.adicionarAluno(alunoOito);
		turmaTres.adicionarAluno(alunoNove);

		int escolha = 0;
		int menuTurmas = 0;
		int menuProfessores = 0;
		int menuAlunos = 0;

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("\n\n\tEscolha uma das opções: ");
			System.out.println("\n1. Turmas");
			System.out.println("2. Professores");
			System.out.println("3. Alunos");
			System.out.println("0. Sair do Programa");

			try {
				escolha = scanner.nextInt();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			switch (escolha) {
			case 1:
				
				do {
					System.out.println("\n\n\tEscolha uma das opções: ");
					System.out.println("\n1.Listar Turmas");
					System.out.println("2. Cadastrar Turma");
					System.out.println("3. Apagar Turma");
					System.out.println("0. Sair do Programa");
					
					try {
						menuTurmas = scanner.nextInt();
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					
					switch(menuTurmas) {
					case 1:
						
						System.out.println("\n" + turmaUm);
						System.out.println("\nProfessor da Turma:");

						for (Professor professor : turmaUm.getProfessor()) {
							System.out.println(professor.getNomeProfessor());
						}

						System.out.println("\n\tAlunos:\n");
						for (Aluno aluno : turmaUm.getAluno()) {
							System.out.println(aluno.getNomeAluno());
						}

						System.out.println("\n" + turmaDois);
						System.out.println("\nProfessor da Turma:");

						for (Professor professor : turmaDois.getProfessor()) {
							System.out.println(professor.getNomeProfessor());
						}

						System.out.println("\n\tAlunos:\n");
						for (Aluno aluno : turmaDois.getAluno()) {
							System.out.println(aluno.getNomeAluno());
						}

						System.out.println("\n" + turmaTres);
						System.out.println("\nProfessor da Turma:");

						for (Professor professor : turmaTres.getProfessor()) {
							System.out.println(professor.getNomeProfessor());
						}

						System.out.println("\n\tAlunos:\n");
						for (Aluno aluno : turmaTres.getAluno()) {
							System.out.println(aluno.getNomeAluno());
						}
						
						break;
						
					case 2:
						System.out.println("\n\tTurmas 2\n");
						break;
					
					case 3:
						System.out.println("\n\tTurmas 3\n");
						break;
					}
				} while (menuTurmas != 0);
				break;
			case 2:
				
				do {
					System.out.println("\n\n\tEscolha uma das opções: ");
					System.out.println("\n1.Listar Professores");
					System.out.println("2. Cadastrar Professor");
					System.out.println("3. Apagar Professor");
					System.out.println("0. Sair do Programa");
					
					try {
						menuProfessores = scanner.nextInt();
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					
					switch (menuProfessores) {
					
					case 1:
						
						System.out.println("\n\tListar Professores:");
						System.out.println(professorUm);
						System.out.println(professorDois);
						System.out.println(professorTres + "\n");
						break;
					
					case 2:
						System.out.println("\n\tCadastrar Professor:");
						break;
						
					case 3:
						System.out.println("\n\tApagar Professor:");
						break;
					
					}
					
				}while (menuProfessores !=0 );

					
				break;
				
			case 3:

				do {
					System.out.println("\n\n\tEscolha uma das opções: ");
					System.out.println("\n1.Listar Alunos");
					System.out.println("2. Cadastrar Alunos");
					System.out.println("3. Apagar Alunos");
					System.out.println("0. Sair do Programa");

					try {
						menuAlunos = scanner.nextInt();
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					
					switch(menuAlunos) {
					case 1:
						System.out.println("\n1.Listar Alunos");
						break;
					
					case 2:
						System.out.println("2. Cadastrar Alunos");
						break;
						
					case 3:
						System.out.println("3. Apagar Alunos");
						break;
					}
					break;
			}while (menuAlunos != 0);
			break;
			}
		} while (escolha != 0);
		scanner.close();
		
	}
}
