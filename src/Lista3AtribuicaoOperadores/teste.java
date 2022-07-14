package Lista3AtribuicaoOperadores;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		String nome;
		nome = new String();
		
		Scanner read = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		nome = read.nextLine();
		System.out.println(nome);
		
		read.close();
		
	}

}
