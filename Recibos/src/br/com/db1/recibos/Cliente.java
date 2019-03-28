package br.com.db1.recibos;

public class Cliente {

	private String nome;

	private String cpf;

	private StatusTipoCliente status;

	public Cliente(String nome, String cpf, StatusTipoCliente status) {

		Validador.naoPodeSerNulo(nome, "nome");
		Validador.naoPodeSerNulo(cpf, "CPF");
		Validador.cpfDeveTerOnzeChar(cpf);
		Validador.naoPodeSerInativo(status, "Cliente");
		
		this.nome = nome;
		this.cpf = cpf;
		this.status = status;

	}

	public String getNome() {
		return this.nome;
	}

	public String getCpf() {
		return this.cpf;
	}

}
