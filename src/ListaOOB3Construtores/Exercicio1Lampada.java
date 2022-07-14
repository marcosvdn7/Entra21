package ListaOOB3Construtores;

import java.util.Scanner;


public class Exercicio1Lampada {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Lampada lampada = new Lampada();
		int opcao = 0;
		
		while (opcao != 3) {
			System.out.println("1 - Alterar estado da lâmpada.");
			System.out.println("2 - Verificar estado da lâmpada.");
			System.out.println("3 - Sair.");
			opcao = read.nextInt();
			if (opcao == 1 && lampada.getAcesa() == true) {
				lampada.apagar();
				System.out.println("A lâmpada foi apagada.");
			} else if (opcao == 1 && lampada.getAcesa() == false) {
				lampada.acender();
				System.out.println("A lâmpada foi acesa.");
			} else if (opcao == 2) {
				lampada.mostrarEstado();
			}
		}
		
		read.close();

	}

}
