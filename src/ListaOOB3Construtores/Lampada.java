package ListaOOB3Construtores;

public class Lampada {

	private String modelo;
	private String tensao;
	private String cor;
	private String tipoLuz;
	private int potencia;
	private int garantiaMeses;
	private String[] tipos;
	private boolean acesa;
	
	Lampada(String modelo, String tensao, String cor, String tipoLuz, int potencia, int garantiaMeses,
			String[] tipos, boolean acesa) {
		super();
		this.modelo = modelo;
		this.tensao = tensao;
		this.cor = cor;
		this.tipoLuz = tipoLuz;
		this.potencia = potencia;
		this.garantiaMeses = garantiaMeses;
		this.tipos = tipos;
		this.acesa = acesa;
	}
	
	Lampada() {}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTensao() {
		return tensao;
	}

	public void setTensao(String tensao) {
		this.tensao = tensao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipoLuz() {
		return tipoLuz;
	}

	public void setTipoLuz(String tipoLuz) {
		this.tipoLuz = tipoLuz;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getGarantiaMeses() {
		return garantiaMeses;
	}

	public void setGarantiaMeses(int garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}

	public String[] getTipos() {
		return tipos;
	}

	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}

	public boolean getAcesa() {
		return acesa;
	}

	public void setAcesa(boolean acesa) {
		this.acesa = acesa;
	}

	public void acender() {
		this.acesa = true;
	}
	
	public void apagar() {
		this.acesa = false;
	}
	
	public void mostrarEstado() {
		if (this.acesa == true) {
			System.out.println("A lâmpada está acesa.");
		} else {
			System.out.println("A lâmpada está apagada.");
		}
	}
}
