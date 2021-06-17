package Aula6_Conta;


public class Programa {

	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		
		minhaConta.saldo = 1000;
		if(minhaConta.sacar(2000)) {
			System.out.println("Saque efetuado");
			
		}
		else {
			System.out.println("Saque NAO efetuado!");
		}

		Conta meuSonho = new Conta();
		
		meuSonho.saldo = 50000;
		meuSonho.transferir(minhaConta, 150);
		
		
		
	}

}
