package br.com.banco.main;

public class ContaPoupanca extends Conta {
	
	//M?todos
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println(" ======= Extrato Conta Poupanca =======");
		super.imprimirInfosComuns();
	}
	
	

}
