package br.com.db1.recibosTest;

import org.junit.Before;
import org.junit.Test;

import br.com.db1.recibos.Cliente;
import br.com.db1.recibos.Produto;
import br.com.db1.recibos.Pedido;
import br.com.db1.recibos.StatusTipoCliente;
import br.com.db1.recibos.StatusTipoPedido;
import br.com.db1.recibos.StatusTipoProduto;

public class PedidoTest {

	//private Cliente cliente;
	
	@Before
	public void init(){
		Cliente cliente = new Cliente("Luís Fernando","09855171900", StatusTipoCliente.ATIVO);
		Produto produto = new Produto("1", "Gabinete", 200.0, StatusTipoProduto.ATIVO);
		Pedido pedido = new Pedido(StatusTipoPedido.FATURADO, cliente, produto,"1");
	}
	
	@Test
	public void deveRetornarPrimeiroRelatorio(){
		
	}
}
