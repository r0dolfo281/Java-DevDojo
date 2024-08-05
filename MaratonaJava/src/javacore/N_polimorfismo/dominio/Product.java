package javacore.N_polimorfismo.dominio;

public abstract class Product implements Taxable {
	@SuppressWarnings("unused")
	protected String name;
	@SuppressWarnings("unused")
	protected double value;
	
	public Product(String name, double value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}
	public double getValue() {
		return value;
	}

	
	

	

	
}
