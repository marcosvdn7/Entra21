package Lista5ExtraCondicionais;

import java.util.Scanner;

public class Exercicios4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int  res1, res2, res3, res4, res5, resultado;
		
		System.out.println("Telefonou para a v�tima? (1 - Sim, 0 - N�o)");
		res1 = read.nextInt();
		if (res1 != 1 && res1 != 0) {
			System.out.println("Resposta Inv�lida! Recomece o question�rio.");
			System.exit(0);
		}
		System.out.println("Esteve no local do crime? (1 - Sim, 0 - N�o)");
		res2 = read.nextInt();
		if (res2 != 1 && res2 != 0) {
			System.out.println("Resposta Inv�lida! Recomece o question�rio.");
			System.exit(0);
		}
		System.out.println("Mora perto da v�tima? (1 - Sim, 0 - N�o)");
		res3 = read.nextInt();
		if (res3 != 1 && res3 != 0) {
			System.out.println("Resposta Inv�lida! Recomece o questio�rio.");
			System.exit(0);
		}
		System.out.println("Devia para a v�tima? (1 - Sim, 0 - N�o)");
		res4 = read.nextInt();
		if (res4 != 1 && res4 != 0) {
			System.out.println("Resposta Inv�lida! Recomece o question�rio.");
			System.exit(0);
		}
		System.out.println("Ja trabalhou com a v�tima? (1 - Sim, 0 - N�o)");
		res5 = read.nextInt();
		if (res5 != 1 && res5 != 0) {
			System.out.println("Resposta Inv�lida! Recomece o question�rio.");
			System.exit(0);
		}
		resultado = res1 + res2 + res3 + res4 + res5;
		
		if (resultado == 2) {
			System.out.println("Suspeito.");
		} else if (resultado >= 3 && resultado <=4) {
			System.out.println("C�mplice.");
		} else if (resultado == 5) {
			System.out.println("Culpado!!!");
		} else {
			System.out.println("Inocente.");
		}
		
		read.close();

	}

}
