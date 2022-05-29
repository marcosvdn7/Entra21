package Lista5Condicionais;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String aluno = new String();
		float nota1, nota2, nota3, mediaNotas, mediaAproveitamento;
		
		System.out.println("Nome do aluno: ");
		aluno = read.nextLine();
		System.out.println("Primeira nota: ");
		nota1 = read.nextFloat();
		System.out.println("Segunda nota: ");
		nota2 = read.nextFloat();
		System.out.println("Terceira nota: ");
		nota3 = read.nextFloat();
		
		mediaNotas = (nota1 + nota2 + nota3) / 3;
		mediaAproveitamento = nota1 + (nota2 * 2) + (nota3 * 3) + mediaNotas;
		mediaAproveitamento = mediaAproveitamento/7;
		System.out.println(mediaAproveitamento);
		
		if (mediaAproveitamento >= 9) {
			System.out.println("O conceito do aluno " +aluno+ " foi A.");
		} else if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9) {
			System.out.println("O conceito do aluno " +aluno+ " foi B.");
		} else if (mediaAproveitamento >= 6 && mediaAproveitamento < 7.5) {
			System.out.println("O conceito do aluno " +aluno+ " foi C.");
		} else {
			System.out.println("O conceito do aluno " +aluno+ " foi D.");
		}
		
		read.close();

	}

}
