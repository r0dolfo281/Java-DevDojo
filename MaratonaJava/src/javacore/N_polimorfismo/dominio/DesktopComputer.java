package javacore.N_polimorfismo.dominio;

public class DesktopComputer extends Product {

	public static final double TAX_PER_CENT = 0.21;
	public DesktopComputer(String name, double value) {
		super(name, value);
	}

	@Override
	public double taxCalculator() {
		return this.value * TAX_PER_CENT;
	}

	
	
	
	
}
