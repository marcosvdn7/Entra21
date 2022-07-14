package Lista2EntradaSaida;
import java.util.Scanner;
public class Exercicio7 {

	public static void main(String[] args) {
		float pesoPrato, valor;
		
		Scanner read = new Scanner (System.in);
		System.out.print("Insira o peso do prato em gramas: ");
		pesoPrato = read.nextFloat();
		pesoPrato = pesoPrato-230;
		valor = (float) (pesoPrato*0.02);
		System.out.print("O valor a pagar é de "+valor+ ".");
		
		read.close();

	}

}
