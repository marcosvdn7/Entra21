package ListaOOB2Metodos;

import java.util.Scanner;

public class Exercicio1Lampada {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Lampada lampada = new Lampada();
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.cor = "Amarela";
		lampada.potencia = 7;
		lampada.garantiaMeses = 12;
		lampada.tipoLuz = "Amarela";
		lampada.tipos = new String[3];
		int opcao = 0;
		
		while (opcao != 3) {
			System.out.println("1 - Alterar estado da lâmpada.");
			System.out.println("2 - Verificar estado da lâmpada.");
			System.out.println("3 - Sair.");
			opcao = read.nextInt();
			if (opcao == 1 && lampada.acesa == true) {
				lampada.apagar();
				System.out.println("A lâmpada foi apagada.");
			} else if (opcao == 1 && lampada.acesa == false) {
				lampada.acender();
				System.out.println("A lâmpada foi acesa.");
			} else if (opcao == 2) {
				lampada.mostrarEstado();
			}
		}
		
		read.close();
		
	}

}
