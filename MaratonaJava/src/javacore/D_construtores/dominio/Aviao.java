package javacore.D_construtores.dominio;

public class Aviao {
	private String type;
	private double speed;
	private String name;
	private double mtow;
	private String manufacturer;
	
	public Aviao(String name, String type, double speed, double mtow) {
		this();
		this.type = type;
		this.speed = speed;
		this.name = name;
		this.mtow = mtow;
	}
	
	public Aviao(String name, String type, String manufacturer, double speed, double mtow) {
		this(name, type, speed, mtow);
		this.manufacturer = manufacturer;
	}

	public Aviao() {
	}

	public void printInfo() {
		System.out.printf("Nome: %s%n",this.name);
		System.out.printf("Tipo: %s%n",this.type);
		System.out.printf("Fabricante: %s%n",this.manufacturer);
		System.out.printf("Velocidade: %.2f kt%n",this.speed);
		System.out.printf("Peso Máximo de Decolagem: %.1f lbs",this.mtow);
	}
	
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getMTOW() {
		return mtow;
	}

	public void setMTOW(double mtow) {
		this.mtow = mtow;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
}