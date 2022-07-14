package ListaOOB3Construtores;

public class ContaCorrente {
	
	private int numConta;
	private double saldo;
	private double limite;
	private boolean especial;
	
	public ContaCorrente(int numConta, double saldo, double limite, boolean especial) {
		this.numConta = numConta;
		this.saldo = saldo;
		this.limite = limite;
		this.especial = especial;
	}
	
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public boolean getEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public boolean sacar (double valor) {
		double resto = 0;
		boolean valido = false;
		if (valor > this.saldo + this.limite) {
			valido = false;
		} else if (valor <= this.saldo) {
			this.saldo -= valor;
			valido = true;
		} else if (valor > this.saldo && this.especial == false || this.limite <= 0) {
			valido = false;
		} else if (valor > this.saldo && this.especial == true && this.limite > 0) {
			if (saldo > 0) {
				resto = valor - this.saldo;
				this.saldo -= valor;
				this.limite = this.limite - resto;
				valido = true;
			} else if (this.saldo <= 0 && valor <= this.limite) {
				limite -= valor;
				saldo -= valor;
				valido = true;
			} else if (this.saldo <= 0 && valor > this.limite){
				valido = false;
			}
		}
		return valido;
	} 
	
	public void depositar (double valor, double limiteMax) {
		if (this.especial == true && this.limite < limiteMax) {
			this.limite += valor;
			this.saldo += valor;
			if (this.limite > limiteMax) {
				this.limite = limiteMax;
			}
		} else if (this.limite == limiteMax || this.especial == false){
			this.saldo += valor;
		}
	}
	
	public void consultarSaldo () {
		System.out.println("Saldo atual: R$" +this.saldo);
	}
	
	public boolean consultarEspecial() {
		if (this.saldo < 0 && this.especial == true) {
			return true;
		} else {
			return false;
		}
	}
}
