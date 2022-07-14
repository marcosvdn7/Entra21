package Lista2EntradaSaida;
import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) {
		double horasTrabalhadas, valorHora;
		double salarioTotal, salarioBase;
		int qtdFilhos;
		String nomeFuncionario;
		nomeFuncionario = new String();
		
		
		Scanner read = new Scanner (System.in);
		
		System.out.print("Nome funcionario: ");
		nomeFuncionario = read.nextLine();
		
		System.out.print("Horas trabalhadas: ");
		horasTrabalhadas = read.nextDouble();
		
		System.out.print("Valor recebido por hora; ");
		valorHora = read.nextDouble();
		
		System.out.print("Quantidade de filhos do funcionario: ");
		qtdFilhos = read.nextInt();
		
		salarioBase = valorHora*horasTrabalhadas;
		salarioTotal = (salarioBase+(0.03*qtdFilhos*salarioBase));
		
		System.out.print("O salário de " +nomeFuncionario+ " é de " +salarioTotal+ " reais.");
		
		
		
		read.close();
		
		
		
		
		

	}

}
