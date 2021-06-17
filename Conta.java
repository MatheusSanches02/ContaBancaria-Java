package Aula6_Conta;

public class Conta {

	
	int numero;
	double limite;
	double saldo;
	String dono;
	
	
	
	boolean sacar(double quantidade) {
		if (this.saldo < quantidade) {
			return false;
		}
		else {
			this.saldo = this.saldo - quantidade;
				return true;
		}
	
	}
	
	
	void transferir(Conta destino, double valor) {
	
			this.saldo = this.saldo - valor;
			destino.saldo = destino.saldo + valor;
	}
}
