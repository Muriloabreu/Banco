package br.com.banco.main;

public class Main {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		c1.setNome("Murilo Abreu");

		Conta cc = new ContaCorrente(c1);
		Conta cp = new ContaPoupanca(c1);

		cc.depositar(1);
		cp.depositar(5000);
		//cc.sacar(4);
		
		
		//cp.transferir(100, cc);

		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}
