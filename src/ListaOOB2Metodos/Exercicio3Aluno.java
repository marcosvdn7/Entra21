package ListaOOB2Metodos;

import java.util.Scanner;

public class Exercicio3Aluno {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Aluno aluno1 = new Aluno();
		aluno1.disciplinas = new String[3];
		aluno1.notas = new double[aluno1.disciplinas.length][2];
		int opcao = 0;
		
		System.out.println("Informe o nome do aluno: ");
		aluno1.nome = read.next();
		System.out.println("Informe o número de matrícula do aluno: ");
		aluno1.numMatricula = read.nextInt();
		System.out.println("Informe o curso em que o aluno está matriculado: ");
		aluno1.curso = read.next();
		
		for (int i = 0; i < aluno1.disciplinas.length; i++) {
			System.out.println("Informe a " +(i + 1)+ "ª disciplina: ");
			aluno1.disciplinas[i] = read.next();
		}
		
		for (int i = 0; i < aluno1.notas.length; i++) {
			for (int j = 0; j < aluno1.notas[i].length; j++) {
				System.out.println("Informe a " +(j + 1)+ "ª nota da disciplina " +aluno1.disciplinas[i]+ ": ");
				aluno1.notas[i][j] = read.nextInt();
			}
		}
		
		while (opcao != aluno1.disciplinas.length + 2) {
			System.out.println("\nSelecione a disciplina que deseja conferir sua nota: ");
			for (int i = 0; i < aluno1.disciplinas.length; i++) {
				System.out.println((i + 1)+ " - " +aluno1.disciplinas[i]);
			}
			System.out.println(aluno1.disciplinas.length + 1+ " - Mostrar Boletim Completo.");
			System.out.println(aluno1.disciplinas.length + 2+ " - Sair.");
			opcao = read.nextInt();
			if (opcao <= aluno1.disciplinas.length) {
				System.out.println("---------------------------");
				System.out.println("Disciplina: " +aluno1.disciplinas[opcao - 1]);
					for (int i = 0; i < aluno1.notas[i].length; i++) {
						System.out.println("Nota " +(i + 1)+ ": " +aluno1.notas[opcao - 1][i]);
					}
					System.out.println("Média: " +aluno1.verificarMedia(opcao - 1));
					System.out.println("Situação: " +(aluno1.verificarAprovacao(opcao - 1) == true ? "APROVADO!!" : "REPROVADO!!"));
					System.out.println("---------------------------");
			} else if (opcao == aluno1.disciplinas.length + 1) {
				aluno1.mostrarInformacoes();
			}
		}
		read.close();

	}

}
