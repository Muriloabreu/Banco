package br.com.banco.main;

public interface IConta {

	//Declaração dos Métodos
	void sacar(double valor);

	void depositar(double valor);

	void transferir(double valor, Conta contaDestino);

	void imprimirExtrato();

}
