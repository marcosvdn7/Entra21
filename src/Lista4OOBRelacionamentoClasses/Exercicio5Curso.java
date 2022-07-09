package Lista4OOBRelacionamentoClasses;

import java.util.Scanner;

public class Exercicio5Curso {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		Curso curso = new Curso("Java", 5);
		
		Aluno[] alunos = new Aluno[curso.getAlunos().length];
		
		int mediaTurma = 0;
		int qtdNotas = 4;
		
		for (int i = 0; i < curso.getAlunos().length; i++) {
			Aluno aluno = new Aluno(qtdNotas);
			System.out.println("Informe o nome do " +(i + 1)+ "� aluno: ");
			aluno.setNome(read.nextLine());
			System.out.println("Informe o numero de matricula de " +aluno.getNome()+ ": ");
			aluno.setNumMatricula(read.nextLine());
			alunos[i] = aluno;
		}
		
		curso.setAlunos(alunos);
		
		for (int i = 0; i < curso.getAlunos().length; i++) {
			for (int j = 0; j < qtdNotas; j++) {
				System.out.println("Informe a " +(j + 1)+ "ª nota do aluno " +curso.getAlunos()[i].getNome());
				curso.getAlunos()[i].setNotas(j, read.nextDouble());
			}
		}
		
		for (int i = 0; i < curso.getAlunos().length; i++) {
			System.out.println("-------------------------------");
			System.out.println("Aluno: " +curso.getAlunos()[i].getNome()+ ".");
			for (int j = 0; j < curso.getAlunos()[i].getNotas().length; j++) {
				System.out.println("Nota " +(j + 1)+ ": " +curso.getAlunos()[i].getNotas()[j]+ ".");
			}
			System.out.println("Média: " +curso.getAlunos()[i].verificarMedia());
			System.out.println("Situação: " +(curso.getAlunos()[i].verificarMedia() >= 7 ? "APROVADO!" : "REPROVADO!"));
			mediaTurma += curso.getAlunos()[i].verificarMedia();
		}
		
		mediaTurma /= curso.getAlunos().length;
		System.out.println("-------------------------------");
		System.out.println("Média da turma: " +mediaTurma);
		System.out.println("-------------------------------");
		
		read.close();
	}

}
