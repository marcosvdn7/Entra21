package ListaExtraLoops;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int quantidadeMax = 5;
		int idade =0;
		int op= 0;
		int qtdOtimos=0;
		int qtdBom=0;
		int qtdRegular =0;
		int qtdRuim =0;
		int qtdPessimo =0;
		int qtdBomRegular=0;
		float percentBomReg =0;
		float mediaIdadeRuim =0;
		float percentRespPessimo =0;
		int maiorIdadePessimo =0;
		int DifIdadeMaiorOtimoRuim=0;
		int maiorIdadeOtimo = 0;
		int maiorIdadeRuim = 0;
		
		
		for (int i=1; i<=quantidadeMax; i++) {
		
			System.out.println("Votação de Cinema - Informe sua idade! :");
			idade = read.nextInt();
			while(idade < 0) {
				System.out.println("Informe uma idade real! (Aceitamos somente idades maiores que 0 :");
				idade = read.nextInt();
			}
			
			System.out.println("Selecione sua opinião!");
			System.out.println("5 - ***** Ótimo!");
			System.out.println("4 - **** Bom!");
			System.out.println("3 - *** Regular!");
			System.out.println("2 - ** Ruim!");
			System.out.println("1 - * Péssimo!");
			
			op = read.nextInt();
			while(op<1 || op>5) {
				System.out.println("Informe uma opinião real! :");
				System.out.println("Selecione sua opinião!");
				System.out.println("5 - ***** Ótimo!");
				System.out.println("4 - **** Bom!");
				System.out.println("3 - *** Regular!");
				System.out.println("2 - ** Ruim!");
				System.out.println("1 - * Péssimo!");
				op = read.nextInt();
			}
			
			switch(op) {
			case 5:
				qtdOtimos++;
				break;
			case 4:
				qtdBom++;
				qtdBomRegular++;
				break;
			case 3:
				qtdRegular++;
				qtdBomRegular++;
				break;
			case 2:
				qtdRuim++;
				mediaIdadeRuim+=idade;
				break;
			case 1:
				qtdPessimo++;
				if(idade> maiorIdadePessimo) {
					maiorIdadePessimo = idade;
				}
				break;
			default:
			}
		}
		
		if (qtdBom > 0) {
			percentBomReg = qtdBomRegular/(qtdBom - qtdRegular);
		} else if (qtdRegular > 0){
			percentBomReg = qtdBomRegular/(qtdRegular - qtdBom);
		} else if (qtdRegular == qtdBom && qtdRegular != 0){
			percentBomReg = qtdBomRegular/(qtdRegular - qtdBom);
		} else {
			percentBomReg = 0;
		}
		
		if (qtdPessimo > 0) {
			percentRespPessimo = (qtdPessimo*100)/quantidadeMax;
		} else {
			percentRespPessimo = 0;
		}
		
		if (qtdOtimos > 0) {
			DifIdadeMaiorOtimoRuim = maiorIdadeOtimo - maiorIdadeRuim;
		} else if (qtdRuim > 0){
			mediaIdadeRuim /= qtdRuim;
			DifIdadeMaiorOtimoRuim = maiorIdadeRuim - maiorIdadeOtimo;
		} else if (qtdRuim == qtdOtimos && qtdOtimos != 0) {
			DifIdadeMaiorOtimoRuim = maiorIdadeRuim - maiorIdadeOtimo;
			
		}
		
		System.out.println("A quantidade de respostas ótimo :" +qtdOtimos);
		System.out.println("A diferença percentual entre as respostas bom e regular : " +percentBomReg+ "%");
		System.out.println("A média de idade das pessoas que respoderam ruim : " +mediaIdadeRuim);
		System.out.println("A percentagem de respostas péssimo " +percentRespPessimo+ "% e a maior idade que utilizou esta opção: " + maiorIdadePessimo);
        System.out.println("A diferença de idade entre a maior idade que respondeu ótimo e a maior idade que respondeu ruim: " + DifIdadeMaiorOtimoRuim);
		read.close();

	}

}
