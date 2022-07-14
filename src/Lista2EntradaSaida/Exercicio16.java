package Lista2EntradaSaida;
import java.util.Scanner;
public class Exercicio16 {

	public static void main(String[] args) {
		float receita, despesas, lucro, percentual;
		
		Scanner read = new Scanner (System.in);
		System.out.print("Qual foi a receita da empresa? ");
		receita = read.nextFloat();
		System.out.print("QUal foi a despesa da empresa? ");
		despesas = read.nextFloat();
		lucro = receita-despesas;
		percentual = (receita/despesas)*100;
		System.out.print("O lucro da empresa foi de " +lucro+ " e o percentual de despesas em cima desse lucro foi de " +percentual+ "%.");
		
		read.close();
		

	}

}
