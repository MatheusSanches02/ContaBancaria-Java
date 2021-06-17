package Aula6_Conta;


public class Transferir {

	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		
		minhaConta.saldo = 1000;
		

		Conta meuSonho = new Conta();
		
		meuSonho.saldo = 50000;
		
		System.out.println(meuSonho.saldo);
		System.out.println(minhaConta.saldo);
		
		meuSonho.transferir(minhaConta, 150);
		
		System.out.println(meuSonho.saldo);
		System.out.println(minhaConta.saldo);
		
		
	}

}
