package br.com.banco.main;

public abstract class Conta implements IConta {

	//Atributos
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero, saques;;
	protected double saldo;
	protected Cliente cliente;

	// Método construtor
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++; // numero sequencial variavel static
		this.cliente = cliente;
	}

	// Métodos

	@Override
	public void sacar(double valor) {
		this.saques = 0;

		if (this.saques < 3) {

			if (getSaldo() >= valor) {

				this.saldo -= valor;
				this.saques++;

			} else {
				System.out.println("==============================\n");
				System.out.println("Saldo insuficiente. Favor realizar depósito\n");
				System.out.println("\n==============================\n\n");
			}
		}

	}

	@Override
	public void depositar(double valor) {

		if (valor > 0) {

			this.saldo += valor;

		} else {

			System.out.println("==============================\n");
			System.out.println("Não é possível realizar depósitos com valores negativos!");
			System.out.println("\n==============================\n\n");
		}

	}

	@Override
	public void transferir(double valor, Conta contaDestino) {

		if (getSaldo() > 0) {

			this.sacar(valor);
			contaDestino.depositar(valor);

		} else {
			System.out.println("==============================\n");
			System.out.println(
					" Você não tem saldo suficiente para realizar transferência de valores, Favor realizar um Depósito.");
			System.out.println("\n==============================\n\n");
		}

	}

	@Override
	public void imprimirExtrato() {

	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero Conta: %d", this.numero));
		System.out.println(String.format("Saldo Atual: %.2f\n", this.saldo));

	}

	// Métodos Acessores
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

}
