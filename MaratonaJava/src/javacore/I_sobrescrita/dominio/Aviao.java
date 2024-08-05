package javacore.I_sobrescrita.dominio;

public class Aviao {
	private String name;
	
	public Aviao(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Aviao: " + this.name;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
