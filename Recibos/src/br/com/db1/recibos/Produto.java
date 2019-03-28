package br.com.db1.recibos;

public class Produto {

	private String codigo;
	
	private String nome;
	
	private Double valor;
	
	private StatusTipoProduto status;
	
	public Produto(String codigo, String nome, Double valor, StatusTipoProduto status){
		
		Validador.naoPodeSerNulo(codigo, "codigo");
		Validador.naoPodeSerNulo(nome, "nome");
		Validador.valorDeveSerMaiorQueZero(valor, "valor");
		Validador.naoPodeSerInativo(status, "Produto");
		
		
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
	}

	public String getCodigo() {
		return this.codigo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Double getValor(){
		return this.valor;
	}
}
