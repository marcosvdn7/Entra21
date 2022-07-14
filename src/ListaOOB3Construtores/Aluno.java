package ListaOOB3Construtores;

public class Aluno {

	private String nome;
	private String curso;
	private String[] disciplinas;
	private double [][] notas;
	private int numMatricula;
	
	public Aluno(){	}
	
	public Aluno(String nome, String curso, int numMatricula) {
		this.nome = nome;
		this.curso = curso;
		this.numMatricula = numMatricula;
		this.disciplinas = new String[3];
		this.notas = new double[this.disciplinas.length][2];
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	public double[][] getNotas() {
		return notas;
	}

	public void setNotas(double[][] notas) {
		this.notas = notas;
	}

	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	public double verificarMedia(int indice) {
		double somaNotas = 0;
		for (int i = 0; i < this.notas[indice].length; i++) {
			somaNotas += this.notas[indice][i];
		}
		return somaNotas / this.notas[indice].length;
	}
	
	public boolean verificarAprovacao(int indice) {
		if (this.verificarMedia(indice) >= 7) {
			return true;
		}
		return false;
	}
	
	public void mostrarInformacoes() {
		boolean aprovacaoGeral = true;
		System.out.println("---------------------------");
		System.out.println("      Nome Aluno: " +nome);
		System.out.println("   Número Matricula: " +numMatricula);
		System.out.println("      Curso: " +curso);
		System.out.println("---------------------------");
		for (int i = 0; i < this.disciplinas.length; i++) {
			System.out.println("Disciplina: " +this.disciplinas[i]);
			for (int j = 0; j < this.notas[i].length; j++) {
				System.out.println("Nota " +(j + 1)+ ": " +this.notas[i][j]);
			}
			if (this.verificarMedia(i) <= 7) {
				aprovacaoGeral = false;
			}
			System.out.println("Média: " +this.verificarMedia(i));
			System.out.println("Situação: " +(this.verificarMedia(i) >= 7 ? "APROVADO!!" : "REPROVADO!!"));
			System.out.println("---------------------------");
		}
		System.out.println("Situação Geral: " +(aprovacaoGeral == true ? "APROVADO!!" : "REPROVADO!!"));
		System.out.println("---------------------------");
	}
	
	public void receberNomesDiscplinas (int indice, String disciplina) {
		this.disciplinas[indice] = disciplina;
	}
	
	public void receberNotas (int coluna, int linha, double notas) {
		this.notas[coluna][linha] = notas;
	}
	
}
