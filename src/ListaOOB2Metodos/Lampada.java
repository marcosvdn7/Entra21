package ListaOOB2Metodos;

public class Lampada {

	String modelo;
	String tensao;
	String cor;
	String tipoLuz;
	int potencia;
	int garantiaMeses;
	String[] tipos;
	boolean acesa;

	void acender() {
		acesa = true;
	}
	
	void apagar() {
		acesa = false;
	}
	
	void mostrarEstado() {
		if (acesa == true) {
			System.out.println("A lâmpada está acesa.");
		} else {
			System.out.println("A lâmpada está apagada.");
		}
	}
	
}
