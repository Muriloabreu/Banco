package br.com.banco.main;

public class ContaCorrente extends Conta {
	
	//M�todos
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println(" ======= Extrato Conta Corrente =======");
		super.imprimirInfosComuns();
	}

	

	
	

}
