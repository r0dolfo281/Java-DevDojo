package javacore.E_inicializacao.dominio;

public class Aviao {
	private String name;
	private int [] engines = {1,2,4,6};
	{
		System.out.println("Dentro do blobo de inicialização");
	}
	
	public Aviao(String name) {
		super();
		this.name = name;
		
	}
	
	public Aviao() {
		for(int eng: this.engines) {
			System.out.printf("%d ", eng);
		}
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	
	public int[] getEngines() {
		return engines;
	}
	public void setEngines(int[] engines) {
		this.engines = engines;
	}
	
	
	
	
}


