package Lista8Matrizes;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String[][] tabuleiro = new String[3][3];
		String[] jogador = {"O", "X"};
		String[] verificar = new String[10];
		int opcao = 0;
		boolean fim = false;
		int num = 1;
		int turno = 0;
		
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				tabuleiro[i][j] = "" +num;
				num++;
			}
		}
		
		for (int i = 0; i < verificar.length; i++) {
				verificar[i] = "";
		}
		
		System.out.println("Jogo da velha");
		
		for (int i = 0; fim == false;) {
				System.out.println("\nJogador " +(i + 1)+", informe o quadrado que gostaria de fazer sua jogada: ");
				System.out.println(" -------------");
				System.out.println(" | " +tabuleiro[0][0]+ " | " +tabuleiro[0][1]+ " | " +tabuleiro[0][2]+ " | ");
				System.out.println(" -------------");
				System.out.println(" | " +tabuleiro[1][0]+ " | " +tabuleiro[1][1]+ " | " +tabuleiro[1][2]+ " | ");
				System.out.println(" -------------");
				System.out.println(" | " +tabuleiro[2][0]+ " | " +tabuleiro[2][1]+ " | " +tabuleiro[2][2]+ " | ");
				System.out.println(" -------------");
				opcao = read.nextInt();
				while (opcao < 1 || opcao > 9 || verificar[opcao].equals(jogador[0]) || verificar[opcao].equals(jogador[1])) {
					System.out.println("Escolha um campo válido!");
					opcao = read.nextInt();
				}
				verificar[opcao] = jogador[i];
				switch (opcao) {
				case 1: tabuleiro[0][0] = jogador[i];break;
				case 2: tabuleiro[0][1] = jogador[i];break;
				case 3: tabuleiro[0][2] = jogador[i];break;
				case 4: tabuleiro[1][0] = jogador[i];break;
				case 5: tabuleiro[1][1] = jogador[i];break;
				case 6: tabuleiro[1][2] = jogador[i];break;
				case 7: tabuleiro[2][0] = jogador[i];break;
				case 8: tabuleiro[2][1] = jogador[i];break;
				case 9: tabuleiro[2][2] = jogador[i];break;
				}
				for (int k = 0, l = 0, j = 0; j <= 1; j++) {
					if (tabuleiro[k][l] == jogador[j] && tabuleiro[k][l + 1] == jogador[j] && tabuleiro[k][l + 2] == jogador[j] ||
						tabuleiro[k + 1][l] == jogador[j] && tabuleiro[k + 1][l + 1] == jogador[j] && tabuleiro[k + 1][l + 2] == jogador[j] ||
						tabuleiro[k + 2][l] == jogador[j] && tabuleiro[k + 2][l + 1] == jogador[j] && tabuleiro[k + 2][l + 2] == jogador[j] ||
						tabuleiro[k][l] == jogador[j] && tabuleiro[k + 1][l] == jogador[j] && tabuleiro[k + 2][l] == jogador[0] || 
						tabuleiro[k][l + 1] == jogador[j] && tabuleiro[k + 1][l + 1] == jogador[j] && tabuleiro[k + 2][l + 1] == jogador[j] ||
						tabuleiro[k][l + 2] == jogador[j] && tabuleiro[k + 1][l + 2] == jogador[j] && tabuleiro[k + 2][l + 2] == jogador[j] ||
						tabuleiro[k][l] == jogador[j] && tabuleiro[k + 1][l + 1] == jogador[j] && tabuleiro[k + 2][l + 2] == jogador[j] ||
						tabuleiro[k][l + 2] == jogador[j] && tabuleiro[k + 1][l + 1] == jogador[j] && tabuleiro[k + 2][l] == jogador[j]){
						System.out.println(" -------------");
						System.out.println(" | " +tabuleiro[0][0]+ " | " +tabuleiro[0][1]+ " | " +tabuleiro[0][2]+ " | ");
						System.out.println(" -------------");
						System.out.println(" | " +tabuleiro[1][0]+ " | " +tabuleiro[1][1]+ " | " +tabuleiro[1][2]+ " | ");
						System.out.println(" -------------");
						System.out.println(" | " +tabuleiro[2][0]+ " | " +tabuleiro[2][1]+ " | " +tabuleiro[2][2]+ " | ");
						System.out.println(" -------------");
						System.out.println("\nO Jogador " +(j + 1)+ " venceu!");
						fim = true;
					}
				}
				turno++;
				if (turno == 9 && fim == false) {
					System.out.println(" -------------");
					System.out.println(" | " +tabuleiro[0][0]+ " | " +tabuleiro[0][1]+ " | " +tabuleiro[0][2]+ " | ");
					System.out.println(" -------------");
					System.out.println(" | " +tabuleiro[1][0]+ " | " +tabuleiro[1][1]+ " | " +tabuleiro[1][2]+ " | ");
					System.out.println(" -------------");
					System.out.println(" | " +tabuleiro[2][0]+ " | " +tabuleiro[2][1]+ " | " +tabuleiro[2][2]+ " | ");
					System.out.println(" -------------"); 
					System.out.println("O jogo empatou!");
					fim = true;
				}
				if (i == 1) {
					i = 0;
				} else if (i == 0) {
					i = 1;
				}
			}
		
			read.close();

	}

}
