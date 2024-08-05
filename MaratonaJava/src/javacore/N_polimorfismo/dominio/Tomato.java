package javacore.N_polimorfismo.dominio;

public class Tomato extends Product {
	public static final double TAX_PER_CENT = 0.06;
	private String expirationDate;
	
	public Tomato(String name, double value) {
		super(name, value);
	}

	@Override
	public double taxCalculator() {
		return this.value * TAX_PER_CENT;
	}

	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	
	

}
