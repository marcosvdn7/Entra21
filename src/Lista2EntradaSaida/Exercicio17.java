package Lista2EntradaSaida;
import java.util.Scanner;
public class Exercicio17 {

	public static void main(String[] args) {
		int idade, dias;
		String nome;
		nome = new String();
		
		Scanner read = new Scanner (System.in);
		System.out.print("Qual o seu nome? ");
		nome = read.nextLine();
		System.out.print("Qual a sua idade? ");
		idade = read.nextInt();
		dias = idade*365;
		System.out.print(nome+ " ja viveu " +dias+ " dias.");
		
		read.close();

	}

}
