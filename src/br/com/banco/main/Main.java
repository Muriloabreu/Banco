package br.com.banco.main;

//Classe de teste
public class Main {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		c1.setNome("Murilo Abreu");
		
		Cliente c2 = new Cliente();
		c2.setNome("Mariana");
		
		Conta cc = new ContaCorrente(c1);
		Conta cp = new ContaPoupanca(c2);

		cc.depositar(100);
		cp.depositar(5000);
		cc.sacar(4);
		cp.sacar(90);
		
		
		cp.transferir(100, cc);

		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}
