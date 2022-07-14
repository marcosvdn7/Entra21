package ListaOOB4RelacionamentoClasses;

public class Aluno {

	private String nome;
	private String numMatricula;
	private double[] notas;
	
	public Aluno(String nome, String numMatricula) {
		this.nome = nome;
		this.numMatricula = numMatricula;
		this.notas = new double[2];
	}
	
	public Aluno(int qtdNotas) {
		this.notas = new double[qtdNotas];
	}
	
	public Aluno() {
		
	}

	public Aluno(String nome, String numMatricula, int qtdNotas) {
		this.nome = nome;
		this.numMatricula = numMatricula;
		this.notas = new double[qtdNotas];
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(String numMatricula) {
		this.numMatricula = numMatricula;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(int indice, double notas) {
		this.notas[indice] = notas;
	}
	
	public void receberNotas (int indice, double nota) {
		this.notas[indice] = nota;
	}
	
	public double verificarMedia() {
		double media = 0;
		for (int i = 0; i < this.notas.length; i++) {
			media += this.notas[i];
		}
		return media /= this.notas.length;
	}
}
