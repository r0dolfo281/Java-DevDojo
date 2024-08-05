package javacore.N_polimorfismo.dominio;

public class Airplane extends Product {
	public static final double TAX_PER_CENT = 0.84;
	public Airplane(String name, double value) {
		super(name, value);
		
	}

	
	@Override
	public double taxCalculator() {
		return this.value * TAX_PER_CENT;
	}

}
