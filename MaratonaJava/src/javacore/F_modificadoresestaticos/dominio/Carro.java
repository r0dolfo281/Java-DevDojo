package javacore.F_modificadoresestaticos.dominio;

public class Carro {
	private String manufacturer;
	private double maxSpeed;
	private static double speedLimit = 250;
	
	public Carro(String manufacturer, double maxSpeed) {
		super();
		this.manufacturer = manufacturer;
		this.maxSpeed = maxSpeed;
	}

	public void printInfo() {
		System.out.printf("%nFabricante: %s%n", this.manufacturer);
		System.out.printf("Velocidade Máxima: %.1f km/h%n", this.maxSpeed);
		System.out.printf("Limite de Velocidade: %.1f km/h", Carro.speedLimit);
		System.out.printf("%n");
	}
	
	public static void setspeedLimit(double speedLimit) {
		Carro.speedLimit = speedLimit;
	}	
	public static double getspeedLimit() {
		return Carro.speedLimit;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public double getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
}
