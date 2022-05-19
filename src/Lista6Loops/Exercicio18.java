package Lista6Loops;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int anos = 0;
		double crescimentoA, crescimentoB;
		double taxaCrescimentoA;
		double taxaCrescimentoB;
		double populacaoA; 
		double populacaoB; 
		int opcao;
		boolean validacao = false;
		
		do{
			System.out.println("Informe a popula��o do pa�s A: ");
			populacaoA = read.nextDouble();
			if (populacaoA > 0) {
				validacao = true;
			} else {
				System.out.println("Popula��o do pa�s A deve ser maior que 0.");
			}
		} while (!validacao);
		
		validacao = false;
		
		do{
			System.out.println("Informe a taxa de crescimento do pa�s A(em porcentagem): ");
			crescimentoA = read.nextDouble();
			if (crescimentoA > 0) {
				validacao = true;
			} else {
				System.out.println("Taxa de crescimento do pa�s A deve ser maior que 0.");
			}
		} while (!validacao);
		
		validacao = false;
		
		do {
			System.out.println("Informe a popula��o do pa�s B:");
			populacaoB = read.nextDouble();
			if (populacaoB > 0) {
				validacao = true;
			} else {
				System.out.println("Popula��o do pa�s B deve ser maior que 0.");
			}
		} while (!validacao);
		
		validacao = false;
		
		do {
			System.out.println("Informe a taxa de crescimento do pa�s B(em porcentagem): ");
			crescimentoB = read.nextDouble();
			if (crescimentoB > 0) {
				validacao = true;
			} else {
				System.out.println("Taxa de crescimento do pa�s B deve ser maior que 0.");
			}
		} while(!validacao);
		
		taxaCrescimentoA = crescimentoA / 100;
		taxaCrescimentoB = crescimentoB / 100;
		
		if (populacaoA < populacaoB) {
			do {
				crescimentoA = populacaoA * taxaCrescimentoA;
				populacaoA = populacaoA + crescimentoA;
				crescimentoB = populacaoB * taxaCrescimentoB;
				populacaoB = populacaoB + crescimentoB;
				anos++;
				System.out.println("\nDeseja entrar com uma nova taxa de crescimento? (1 - Sim, 2 - N�o)");
				opcao = read.nextInt();
				if (opcao == 1) {
					System.out.println("\nInforme a nova taxa de crescimento do pa�s A(em porcentagem): ");
					crescimentoA = read.nextDouble();
					System.out.println("\nInforme a nova taxa de crescimento do pa�s B(em porcentagem): ");
					crescimentoB = read.nextDouble();
				}
			} while (populacaoA < populacaoB);
			System.out.println("Levar�o " +anos+ " ano(s) para que a popula��o do pa�s A alcance a do pa�s B.");
		} else if (populacaoB < populacaoA) {
			do {
				crescimentoA = populacaoA * taxaCrescimentoA;
				populacaoA = populacaoA + crescimentoA;
				crescimentoB = populacaoB * taxaCrescimentoB;
				populacaoB = populacaoB + crescimentoB;
				anos++;
				System.out.println("\nDeseja entrar com uma nova taxa de crescimento? (1 - Sim, 2 - N�o)");
				opcao = read.nextInt();
				if (opcao == 1) {
					System.out.println("\nInforme a nova taxa de crescimento do pa�s A(em porcentagem): ");
					crescimentoA = read.nextDouble();
					System.out.println("\nInforme a nova taxa de crescimento do pa�s B(em porcentagem): ");
					crescimentoB = read.nextDouble();
				}
			} while (populacaoB < populacaoA);
			System.out.println("Levar�o " +anos+ " ano(s) para que a popula��o do pa�s B alcance a do pa�s A.");
		}
		
		read.close();
	}

}
