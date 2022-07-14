package ListaOOB2Metodos;

public class Aluno {

	String nome;
	String curso;
	String[] disciplinas;
	double [][] notas;
	int numMatricula;
	
	double verificarMedia(int indice) {
		double somaNotas = 0;
		for (int i = 0; i < notas[indice].length; i++) {
			somaNotas += notas[indice][i];
		}
		return somaNotas / notas[indice].length;
	}
	
	boolean verificarAprovacao(int indice) {
		if (verificarMedia(indice) >= 7) {
			return true;
		}
		return false;
	}
	
	void mostrarInformacoes() {
		boolean aprovacaoGeral = true;
		System.out.println("---------------------------");
		System.out.println("      Nome Aluno: " +nome);
		System.out.println("   Número Matricula: " +numMatricula);
		System.out.println("      Curso: " +curso);
		System.out.println("---------------------------");
		for (int i = 0; i < disciplinas.length; i++) {
			System.out.println("Disciplina: " +disciplinas[i]);
			for (int j = 0; j < notas[i].length; j++) {
				System.out.println("Nota " +(j + 1)+ ": " +notas[i][j]);
			}
			if (verificarMedia(i) <= 7) {
				aprovacaoGeral = false;
			}
			System.out.println("Média: " +verificarMedia(i));
			System.out.println("Situação: " +(verificarMedia(i) >= 7 ? "APROVADO!!" : "REPROVADO!!"));
			System.out.println("---------------------------");
		}
		System.out.println("Situação Geral: " +(aprovacaoGeral == true ? "APROVADO!!" : "REPROVADO!!"));
		System.out.println("---------------------------");
	}
	
}
