package ListaOOB3Construtores;

public class JogoVelha {

	private String[][] tabuleiro = new String[3][3];
	String[] sinalJogadores = {"X", "O"};
	String[] camposJogados = {"", "", "", "", "", "", "", "", "", ""};
	private boolean fimJogo;
	private int rodada = 0;
	
	JogoVelha(){
	}
	
	public String[][] getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(String[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	public String[] getSinalJogadores() {
		return sinalJogadores;
	}

	public void setSinalJogadores(String[] sinalJogadores) {
		this.sinalJogadores = sinalJogadores;
	}

	public String[] getCamposJogados() {
		return camposJogados;
	}

	public void setCamposJogados(String[] camposJogados) {
		this.camposJogados = camposJogados;
	}

	public boolean getFimJogo() {
		return fimJogo;
	}

	public void setFimJogo(boolean fimJogo) {
		this.fimJogo = fimJogo;
	}

	public int getRodada() {
		return rodada;
	}

	public void setRodada(int rodada) {
		this.rodada = rodada;
	}

	public void fazerJogada(int rodada, int opcao) {
		String sinal;
		if (rodada % 2 != 0) {
			sinal =  sinalJogadores[0];
		} else {
			sinal = sinalJogadores[1];
		}
		this.camposJogados[opcao - 1] = sinal;
		switch (opcao) {
		case 1: this.tabuleiro[0][0] = sinal;break;
		case 2: this.tabuleiro[0][1] = sinal;break;
		case 3: this.tabuleiro[0][2] = sinal;break;
		case 4:	this.tabuleiro[1][0] = sinal;break;
		case 5: this.tabuleiro[1][1] = sinal;break;
		case 6: this.tabuleiro[1][2] = sinal;break;
		case 7: this.tabuleiro[2][0] = sinal;break;
		case 8: this.tabuleiro[2][1] = sinal;break;
		case 9: this.tabuleiro[2][2] = sinal;break;
		}
	}
	
	public boolean verificarJogada(int opcao) {
		if (this.camposJogados[opcao - 1].equals(this.sinalJogadores[0]) || this.camposJogados[opcao - 1].equals(this.sinalJogadores[1])) {
			return false;
		} 
		return true;
	}
	
	public void mostrarTabuleiro() {
		int num = 1;
		for (int i = 0; i < this.tabuleiro.length; i++) {
			System.out.print(" -------------\n");
			System.out.print(" | ");
			for (int j = 0; j < this.tabuleiro[i].length; j++) {
				if (this.camposJogados[num - 1].equals(this.sinalJogadores[0]) ||this. camposJogados[num - 1].equals(this.sinalJogadores[1])) {
					this.tabuleiro[i][j] = this.camposJogados[num - 1];
					System.out.print(this.tabuleiro[i][j]+ " | ");
					num++;
				} else {
					this.tabuleiro[i][j] = "" +num;
					System.out.print(this.tabuleiro[i][j]+ " | ");
					num++;
				}
			}
			System.out.println(num == 10 ? "\n -------------" : "");
		}
	}
	
	public void verificarGanhador() {
		for (int i = 0; i < 2; i++) {
			if (this.tabuleiro[0][0] == this.sinalJogadores[i] && this.tabuleiro[0][1] == this.sinalJogadores[i] && this.tabuleiro[0][2] == this.sinalJogadores[i] ||
				this.tabuleiro[1][0] == this.sinalJogadores[i] && this.tabuleiro[1][1] == this.sinalJogadores[i] && this.tabuleiro[1][2] == this.sinalJogadores[i] ||
				this.tabuleiro[2][0] == this.sinalJogadores[i] && this.tabuleiro[2][1] == this.sinalJogadores[i] && this.tabuleiro[2][2] == this.sinalJogadores[i] ||
				this.tabuleiro[0][0] == this.sinalJogadores[i] && this.tabuleiro[1][0] == this.sinalJogadores[i] && this.tabuleiro[2][0] == this.sinalJogadores[i] || 
				this.tabuleiro[0][1] == this.sinalJogadores[i] && this.tabuleiro[1][1] == this.sinalJogadores[i] && this.tabuleiro[2][1] == this.sinalJogadores[i] ||
				this.tabuleiro[0][2] == this.sinalJogadores[i] && this.tabuleiro[1][2] == this.sinalJogadores[i] && this.tabuleiro[2][2] == this.sinalJogadores[i] ||
				this.tabuleiro[0][0] == this.sinalJogadores[i] && this.tabuleiro[1][1] == this.sinalJogadores[i] && this.tabuleiro[2][2] == this.sinalJogadores[i] ||
				this.tabuleiro[0][2] == this.sinalJogadores[i] && this.tabuleiro[1][1] == this.sinalJogadores[i] && this.tabuleiro[2][0] == this.sinalJogadores[i]){
				this.fimJogo = true;
			}
			if (this.rodada > 9) {
				this.fimJogo = true;
			}
		}
	}
	
	public void mostrarVencedor(int rodada) {
		if (this.fimJogo == true) {
			this.mostrarTabuleiro();
			System.out.println("O Jogador " +(this.rodada % 2 != 0 ? "1" : "2")+ " venceu.");
		} else if (this.fimJogo == false && this.rodada == 9) {
			System.out.println("O jogo empatou!");
			this.mostrarTabuleiro();
			this.fimJogo = true;
		}
	}
}
