package br.com.banco.main;

public interface IConta {

	//Declara��o dos M�todos
	void sacar(double valor);

	void depositar(double valor);

	void transferir(double valor, Conta contaDestino);

	void imprimirExtrato();

}
