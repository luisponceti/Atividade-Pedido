package br.com.db1.recibos;

public class ProdutoDoPedido {
	
	private Produto produto;
	
	private Double quantidade;
	
	private Double valor;
	
	public ProdutoDoPedido(Produto produto, Double quantidade, Double valor){
		this.produto = produto;
		this.quantidade = quantidade;
		this.valor = valor;
	}

}
