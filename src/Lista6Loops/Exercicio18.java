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
			System.out.println("Informe a população do país A: ");
			populacaoA = read.nextDouble();
			if (populacaoA > 0) {
				validacao = true;
			} else {
				System.out.println("População do país A deve ser maior que 0.");
			}
		} while (!validacao);
		
		validacao = false;
		
		do{
			System.out.println("Informe a taxa de crescimento do país A(em porcentagem): ");
			crescimentoA = read.nextDouble();
			if (crescimentoA > 0) {
				validacao = true;
			} else {
				System.out.println("Taxa de crescimento do país A deve ser maior que 0.");
			}
		} while (!validacao);
		
		validacao = false;
		
		do {
			System.out.println("Informe a população do país B:");
			populacaoB = read.nextDouble();
			if (populacaoB > 0) {
				validacao = true;
			} else {
				System.out.println("População do país B deve ser maior que 0.");
			}
		} while (!validacao);
		
		validacao = false;
		
		do {
			System.out.println("Informe a taxa de crescimento do país B(em porcentagem): ");
			crescimentoB = read.nextDouble();
			if (crescimentoB > 0) {
				validacao = true;
			} else {
				System.out.println("Taxa de crescimento do país B deve ser maior que 0.");
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
				System.out.println("\nDeseja entrar com uma nova taxa de crescimento? (1 - Sim, 2 - Não)");
				opcao = read.nextInt();
				if (opcao == 1) {
					System.out.println("\nInforme a nova taxa de crescimento do país A(em porcentagem): ");
					crescimentoA = read.nextDouble();
					System.out.println("\nInforme a nova taxa de crescimento do país B(em porcentagem): ");
					crescimentoB = read.nextDouble();
				}
			} while (populacaoA < populacaoB);
			System.out.println("Levarão " +anos+ " ano(s) para que a população do país A alcance a do país B.");
		} else if (populacaoB < populacaoA) {
			do {
				crescimentoA = populacaoA * taxaCrescimentoA;
				populacaoA = populacaoA + crescimentoA;
				crescimentoB = populacaoB * taxaCrescimentoB;
				populacaoB = populacaoB + crescimentoB;
				anos++;
				System.out.println("\nDeseja entrar com uma nova taxa de crescimento? (1 - Sim, 2 - Não)");
				opcao = read.nextInt();
				if (opcao == 1) {
					System.out.println("\nInforme a nova taxa de crescimento do país A(em porcentagem): ");
					crescimentoA = read.nextDouble();
					System.out.println("\nInforme a nova taxa de crescimento do país B(em porcentagem): ");
					crescimentoB = read.nextDouble();
				}
			} while (populacaoB < populacaoA);
			System.out.println("Levarão " +anos+ " ano(s) para que a população do país B alcance a do país A.");
		}
		
		read.close();
	}

}
