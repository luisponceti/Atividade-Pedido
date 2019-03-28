package br.com.db1.recibos;

import java.util.ArrayList;
import java.util.List;


public class Pedido {

	private StatusTipoPedido status;

	private Cliente cliente;

	private List<Produto> produtos;

	private String numero;
	
	private List<ProdutoHistorico> historicos = new ArrayList<>();

	public Pedido(StatusTipoPedido status , Cliente cliente, Produto produto, String numero) {

		this.status = status;
		this.cliente = cliente;
		this.produtos = produtos;
		this.numero = numero;
		
	}
	
	
}
