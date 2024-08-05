package javacore.K_enum.dominio;

public class Cliente {
	
	
	private String nome;
	private TipoCliente tipoCliente;
	private TipoPagamento tipoPagamento;
	
	public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
		super();
		this.nome = nome;
		this.tipoCliente = tipoCliente;
		this.tipoPagamento = tipoPagamento;
	}

	@Override
	public String toString() {
		return "Cliente: " + nome + "\n" + 
				"Tipo Cliente: " + tipoCliente.getNomeRelatorio() + "\n" +
				"Valor Cliente: " + tipoCliente.VALOR + "\n" + 
				"Tipo Pagamento: " + tipoPagamento + "\n";
	}

	
	
	
	
	
	
	
}
