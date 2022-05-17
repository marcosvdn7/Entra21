package ListaExtraCondicionais;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		float indice;
		System.out.println("Informe o índice de poluição.");
		indice = read.nextFloat();
		
		if (indice <= 0.25) {
			System.out.println("Índice de poluição aceitável.");
		} else if (indice > 0.25 && indice <= 0.39) {
			System.out.println("As indústrias do primeiro grupo deve encerrar suas atividades.");
		} else if (indice >= 0.40 && indice <= 0.49) {
			System.out.println("As indústrias do primeiro e segundo grupo deve encerrar suas atividades.");
		} else {
			System.out.println("As indústrias de todos os 3 grupos deve encerrar suas atividades.");
		}
		read.close();

	}

}
