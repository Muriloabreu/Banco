package br.com.banco.main;

import java.util.List;

public class Banco {
	
	private String nome;
	private List<Conta> contas;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Conta> getConta() {
		return contas;
	}
	
	public void setConta(List<Conta> conta) {
		this.contas = conta;
	}
}
