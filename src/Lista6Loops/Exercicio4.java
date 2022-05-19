//Recebe como entrada o sexo e altura dos habitantes de uma regiao.
//Imprime a maior e menor altura encontradas, a média de altura das
//mulheres, a média de altura da população e o percentual de homens
//na população;
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
		int qtdHomens = 0;
		int qtdMulheres = 0;
		int genero;
		int count = 0;
		int j = 0;
		
		for (int i = 0 ; i <= 4 ; i++) {
			System.out.println("Informe a altura: ");
			altura = read.nextDouble();
			System.out.println("Informe o gênero: ");
			System.out.println("1 - Masculino.");
			System.out.println("2 - Feminino.");
			genero = read.nextInt();
				while (j < 1) {
					maiorAltura = altura;
					menorAltura = altura;
					j++;
			}
			if (altura > maiorAltura) {
				maiorAltura = altura;
			} else if (altura <= 0){
				System.out.println("Altura inválida. Deve ser maior que 0.");
				break;
			} else if (altura < menorAltura) {
				menorAltura = altura;
			}
			if (genero == 2) {
				somaAltFem += altura;
				qtdMulheres++;
			} else if (genero == 1) {
				qtdHomens += genero;
			} else {
				System.out.println("Gênero inválido.");
				break;
			}
			somaAltPop += altura;
			count++;
		}
		
		percentMasc = (qtdHomens * 100) / count;
		mediaAltPop = somaAltPop / count;
		mediaAltFem = somaAltFem / qtdMulheres;

		System.out.println("A maior altura encontrada foi: " +maiorAltura+ ".");
		System.out.println("A menor altura encontrada foi: " +menorAltura+ ".");
		System.out.println("A media de altura feminina é de: " +mediaAltFem+ ".");
		System.out.println("A média de altura da população é de: " +mediaAltPop+ ".");
		System.out.println("O percentual de homens na população é de: " +(int)percentMasc+ "%.");
		read.close();
	}
}
