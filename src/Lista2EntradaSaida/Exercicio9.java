package Lista2EntradaSaida;
import java.util.Scanner;
public class Exercicio9 {

	public static void main(String[] args) {
		
		double valorGasto;
		
		Scanner read = new Scanner (System.in);
		
		System.out.println("Insira a quantidade de pessoas: ");
		int qtdPessoas = read.nextInt();
		valorGasto = (float)qtdPessoas*19.2;
		
		
		System.out.print("O valor gasto total será de: "+valorGasto);
		
		
		
		
		read.close();
		

	}

}
