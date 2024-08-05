package javacore.K_enum.dominio;

public enum TipoCliente {
	PESSOA_FÍSICA(1, "Pessoa Física"), 
	PESSOA_JURÍDICA(2, "Pessoa Jurídica");
	public final int VALOR;
	private String nomeRelatorio;

	private TipoCliente(int valor, String nomeRelatorio) {
		this.VALOR = valor;
		this.nomeRelatorio = nomeRelatorio;
	}
	public String getNomeRelatorio() {
		return nomeRelatorio;
	}
	public static TipoCliente typeClientbyNameReport(String nomeRelatorio) {
		for(TipoCliente tipoCliente: values()) {
			if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
				return tipoCliente;
				
			}
		}
		return null;
		
	}
}
