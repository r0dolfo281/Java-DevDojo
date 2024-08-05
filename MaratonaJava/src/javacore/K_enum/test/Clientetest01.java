package javacore.K_enum.test;
import javacore.K_enum.dominio.Cliente;
import javacore.K_enum.dominio.TipoCliente;
import javacore.K_enum.dominio.TipoPagamento;

public class Clientetest01 {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Trump", TipoCliente.PESSOA_FÍSICA, TipoPagamento.DÉBITO);
		Cliente c2 = new Cliente("Oh Dulci", TipoCliente.PESSOA_JURÍDICA, TipoPagamento.CRÉDITO);
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println("--------------------------------------\n");
		
		System.out.println(TipoPagamento.DÉBITO.calcularDesconto(100));
		System.out.println(TipoPagamento.CRÉDITO.calcularDesconto(100));
		
		System.out.println("\n--------------------------------------\n");
		
		TipoCliente tipoCliente1 = TipoCliente.valueOf("PESSOA_FÍSICA");
		System.out.println(tipoCliente1.getNomeRelatorio());
		TipoCliente tipoCliente2 = TipoCliente.typeClientbyNameReport("PESSOA_FÍSICAaaaa");
		System.out.println(tipoCliente2 + "\n");
	}
}
