package ListaOOB2Metodos;

public class ContaCorrente {

	int numConta;
	double saldo;
	double limite;
	boolean especial;
	
	boolean sacar (double valor) {
		double resto = 0;
		boolean valido = false;
		if (valor > saldo + limite) {
			valido = false;
		} else if (valor <= saldo) {
			saldo -= valor;
			valido = true;
		} else if (valor > saldo && especial == false || limite <= 0) {
			valido = false;
		} else if (valor > saldo && especial == true && limite > 0) {
			if (saldo > 0) {
				resto = valor - saldo;
				saldo -= valor;
				limite = limite - resto;
				valido = true;
			} else if (saldo <= 0 && valor <= limite) {
				limite -= valor;
				saldo -= valor;
				valido = true;
			} else if (saldo <= 0 && valor > limite){
				valido = false;
			}
		}
		return valido;
	} 
	
	void depositar (double valor, double limiteMax) {
		if (especial == true && limite < limiteMax) {
			limite += valor;
			saldo += valor;
			if (limite > limiteMax) {
				limite = limiteMax;
			}
		} else if (limite == limiteMax || especial == false){
			saldo += valor;
		}
	}
	
	void consultarSaldo () {
		System.out.println("Saldo atual: R$" +saldo);
	}
	
	boolean consultarEspecial() {
		if (saldo < 0 && especial == true) {
			return true;
		} else {
			return false;
		}
	}
	
}
