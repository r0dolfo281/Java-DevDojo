package javacore.N_polimorfismo.dominio;

public class Tomato extends Product {
	public static final double TAX_PER_CENT = 0.06;
	public Tomato(String name, double value) {
		super(name, value);
	}

	@Override
	public double taxCalculator() {
		System.out.println("Calculating Tomato tax.");
		return this.value * TAX_PER_CENT;
	}
	
	

}
