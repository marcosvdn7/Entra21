package Lista6Loops;
import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double altura;
		double maiorAltura = 0;
		double menorAltura = 0;
		double mediaAltFem, mediaAltPop, percentMasc;
		double somaAltFem = 0;
		double somaAltPop = 0;
		double qtdHomens = 0;
		int genero;
		int count = 0;
		
		for (int i = 0 ; i <= 3 ; i++) {
			System.out.println("Informe a altura: ");
			altura = read.nextDouble();
			System.out.println("Informe o g�nero: ");
			System.out.println("1 - Masculino.");
			System.out.println("2 - Feminino.");
			genero = read.nextInt();
			if (altura > maiorAltura) {
				maiorAltura = altura;
			} else if (altura < altura) {
				menorAltura = altura;
			} else if (altura <= 0){
				System.out.println("Altura inv�lida. Deve ser maior que 0.");
				break;
			}
			if (genero == 2) {
				somaAltFem += altura;
			} else if (genero == 1) {
				qtdHomens += genero;
			} else {
				System.out.println("G�nero inv�lido.");
				break;
			}
			somaAltPop += altura;
			count++;
		}
		percentMasc = (qtdHomens * 100) / count;
		mediaAltPop = somaAltPop / count;
		mediaAltFem = somaAltFem / count;

		System.out.println("A maior altura encontrada foi: " +maiorAltura+ ".");
		System.out.println("A menor altura encontrada foi: " +menorAltura+ ".");
		System.out.println("A media de altura feminina � de: " +mediaAltFem+ ".");
		System.out.println("A m�dia de altura da popula��o � de: " +mediaAltPop+ ".");
		System.out.println("O percentual de homens na popula��o � de: " +(int)percentMasc+ "%.");
		read.close();
	}
}
