package br.com.banco.main;

public class Main {

	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		cc.depositar(1000);
		cp.depositar(5000);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}
