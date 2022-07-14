package ListaOOB3Construtores;

import java.util.Scanner;

public class Exercicio3Aluno {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		Aluno aluno1 = new Aluno("Marcos", "TI", 123456);
		
		int opcao = 0;
		
		for (int i = 0; i < aluno1.getDisciplinas().length; i++) {
			System.out.println("Informe a " +(i + 1)+ "ª disciplina: ");
			aluno1.receberNomesDiscplinas(i, read.next());
		}
		
		for (int i = 0; i < aluno1.getNotas().length; i++) {
			for (int j = 0; j < aluno1.getNotas()[i].length; j++) {
				System.out.println("Informe a " +(j + 1)+ "ª nota da disciplina " +aluno1.getDisciplinas()[i]+ ": ");
				aluno1.receberNotas(i, j, read.nextDouble());
			}
		}
		
		while (opcao != aluno1.getDisciplinas().length + 2) {
			System.out.println("\nSelecione a disciplina que deseja conferir sua nota: ");
			for (int i = 0; i < aluno1.getDisciplinas().length; i++) {
				System.out.println((i + 1)+ " - " +aluno1.getDisciplinas()[i]);
			}
			System.out.println(aluno1.getDisciplinas().length + 1+ " - Mostrar Boletim Completo.");
			System.out.println(aluno1.getDisciplinas().length + 2+ " - Sair.");
			opcao = read.nextInt();
			if (opcao <= aluno1.getDisciplinas().length) {
				System.out.println("---------------------------");
				System.out.println("Disciplina: " +aluno1.getDisciplinas()[opcao - 1]);
					for (int i = 0; i < aluno1.getNotas()[i].length; i++) {
						System.out.println("Nota " +(i + 1)+ ": " +aluno1.getNotas()[opcao - 1][i]);
					}
					System.out.println("Média: " +aluno1.verificarMedia(opcao - 1));
					System.out.println("Situação: " +(aluno1.verificarAprovacao(opcao - 1) == true ? "APROVADO!!" : "REPROVADO!!"));
					System.out.println("---------------------------");
			} else if (opcao == aluno1.getDisciplinas().length + 1) {
				aluno1.mostrarInformacoes();
			}
		}
		read.close();

	}

}
