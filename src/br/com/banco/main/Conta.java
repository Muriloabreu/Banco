package br.com.banco.main;

public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	//construtor
		public Conta() {
			this.agencia = AGENCIA_PADRAO;
			this.numero = SEQUENCIAL++; // numero sequencial variavel static 
		}
	//Métodos
	@Override
	public void sacar(double valor) {
		this.saldo -= valor;

	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;

	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);

	}
	
	@Override
	public void imprimirExtrato() {
		
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero Conta: %d", this.numero));
		System.out.println(String.format("Saldo Atual: %.2f", this.saldo));
	}
	
	//Métodos Acessores
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
